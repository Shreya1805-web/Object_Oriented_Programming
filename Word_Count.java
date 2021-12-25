/*

Write a program to take string input from the user, write it to a file named “wordcount.txt”
then read the file line by line and print the number of sentences, words, characters and white
spaces. Note: Characters include spaces and punctuation. Sentences are demarcated
by either . (period), ! (exclamation mark) or ? (question mark)
Input 1
Enter sentence to be input: I am learning Java.
Output 1
No. of sentences: 1
No. of words: 4
No. of characters: 19
No. of spaces: 3
Input 2
Enter sentence to be input: Greetings of the day! The inconvenience is regretted.
Output 2
No. of sentences: 2
No. of words: 8
No. of characters: 53
No. of spaces: 7
Input 3
Enter sentence to be input: Hotel? Trivago. .
Output 3
No. of sentences: 2
No. of words: 2
No. of characters: 15
No. of spaces: 1

*/

import java.util.*;
import java.io.*;
public class Word_Count {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence to be input:");
		String s = sc.nextLine();
		FileWriter fw = new FileWriter("wordcount.txt");
		fw.write(s);
		fw.close();
		
		int a;
		char ch;
		int sentence = 0, words = 0, charc = 0, spaces = 0;
		FileReader fr = new FileReader("wordcount.txt");
		while((a = fr.read())!= -1){
			ch = (char)a;
			if(ch=='.' || ch=='?' || ch=='!')
				sentence++;
			else if(ch==' ')
				spaces++;
			charc++;
		}
		words = spaces + 1;
		System.out.println("No of sentences: "+ sentence);
		System.out.println("No of words: "+ words);
		System.out.println("No of characters: "+ charc);
		System.out.println("No of spaces: "+ spaces);
		fr.close();
	}

}
