import java.util.Scanner;
import java.io.*;

public class TesterReddit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RedditReader myReader = new RedditReader();

		boolean i = true;
		while (i == true) {
			System.out.println("What would you like to do?"+ "\n\n" + "1 - Searches for a phrase from all of the posts"+ "\n"+"2 - Searches for two phrases within the same sentence. Currently set to trump,russia, and hillary");
			String word = input.nextLine();
			if (word.equals("1")) {
				System.out.println("What string would you like to search for?");
				String phrase = input.nextLine();
				myReader.getPostsReddit("redditPosts.txt", phrase);
			}
			else if (word.equals("2")){
				myReader.readRedditFileAndDetectRussia("redditPosts.txt");
				
			}
		}
	}
}