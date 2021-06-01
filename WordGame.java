package game_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Game 
{
	String words[] = {"earth","socket","apple","sleep","think","software","pattern","bahubali","mask","covid"};
	static final Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	public void starGame() 
	{
		int score = 0;
		for(int i=0;i<words.length;i++) 
		{
			List<Integer> list = new ArrayList<>();
			for(int j = 0;j<words[i].length();j++) {
				list.add(j);
			}
			Collections.shuffle(list);
			int[] l = new int[list.size()/2];
			for(int k=0;k<l.length;k++) {
				l[k] = list.get(k);
			}
			Arrays.sort(l);
			int lInd = 0;
			String res = "";
			for(int k=0;k<words[i].length();k++) {
				
					if(lInd < l.length && l[lInd] == k) {
						res+="*";
						lInd++;
						continue;
					}
					else {
						res+=words[i].charAt(k);
					}	
			}
			System.out.println(res+"\nguess..");
			String guess = scanner.next().toLowerCase();
			if(guess.equals(words[i])) score++;
		}
		System.out.println("your score is : "+score);
	}
	
	private String jumbleWord(String str) {
		char[] ch = str.toCharArray();
		int ind=0;
		Character[] chr = new Character[ch.length];
		for(char c:ch) {
			chr[ind++] = c;
		}
		List ll = Arrays.asList(chr);
		Collections.shuffle(ll);
		ind = 0;
		for(Object c:ll) {
			Character cc = (Character) c;
			ch[ind++] = cc;
		}
		String str1 = String.valueOf(ch);
		return str1;
		
	}
	
	public void jumbledWordsGame() {
		int score = 0;
		for(int eachWord=0;eachWord<words.length;eachWord++) {
			String wordShow = jumbleWord(words[eachWord]);
			System.out.println(wordShow);
			System.out.print("guess word :");
			String guess = scanner.next();
			if(guess.equals(words[eachWord])) score++;
		}
		System.out.println("Your score is : "+score);
	}
}
public class WordGame {
	static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Game g = new Game();
		int choice =0;
		do {
			System.out.print("1.StarGuess game\n2.Jumbled words game\nenter choice to play a game:");
			choice = scanner.nextInt();
			switch(choice) {
			case 1: g.starGame();
					break;
			case 2: g.jumbledWordsGame();
					break;
			default:System.out.print("Invalid choice...");
		}
		}while(!(choice==1||choice==2));
		
	}
}
