import java.io.*;

public class RedditReader {
	String fileToAnalyze;

	RedditReader() {
		System.out.println("Default constructor");
		fileToAnalyze = "";

	}

	boolean detectRussia(String linetoAnalyze)

	{
		String lineToAnalyzeLowerCase = linetoAnalyze.toLowerCase();
		if (lineToAnalyzeLowerCase.contains("russia")&&lineToAnalyzeLowerCase.contains("russia")&&lineToAnalyzeLowerCase.contains("hillary")) {

			return true;
		} else {
			return false;
		}
	}

	RedditPost[] getPostsReddit(String fileToRead, String word) {
		RedditPost[] theDonaldPosts = new RedditPost[6466];

		try {
			FileReader myFileReader = new FileReader(fileToRead);
			BufferedReader myBufferReader = new BufferedReader(myFileReader);
			String line = null;
			int postCounter = 0;
			while ((line = myBufferReader.readLine()) != null) {
				theDonaldPosts[postCounter] = new RedditPost(line);
				postCounter += 1;

				String lineToAnalyzeLowerCase = line.toLowerCase();

				if (lineToAnalyzeLowerCase.contains(word)) {

					System.out.println(postCounter + ": " + line);
				} else {
					;
				}

			}
			System.out.println("exited while:");
			return theDonaldPosts;

		} catch (Exception ex) {
			System.out.println("I don't think I was able to find your file");
		}
		return theDonaldPosts;
	}

	void readRedditFileAndDetectRussia(String fileToRead) {
		System.out.println("ready to read:" + fileToRead);
		try {
			FileReader myFileReader = new FileReader(fileToRead);
			BufferedReader myBufferReader = new BufferedReader(myFileReader);
			String line = null;
			int postCounter = 0;
			while ((line = myBufferReader.readLine()) != null) {
				if (detectRussia(line) == true) {
					postCounter += 1;
					System.out.println("Line:" + postCounter + " " + "" + line);
				} else {
					postCounter += 1;
				}
			}
			postCounter += 1;
		} catch (Exception ex) {
			System.out.println("I don't think I was able to find your file");
		}
	}
}