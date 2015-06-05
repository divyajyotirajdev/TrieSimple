package com;

import static java.lang.System.out;

import java.io.File;
import java.util.Scanner;

public class TrieGame {

	public static void main(String args[]){
	    if (args.length<2) {System.exit(0);}  //boundary case, not enough arguements passed
	    File vocabfile = new File(args[0]);
	    File wordfile = new File(args[1]);
	    if (!vocabfile.exists()) {System.exit(0);} //early exit condition for FileNotFound
	    if (!wordfile.exists()) {System.exit(0);}
	        
	    Vocabulary vocab = new Vocabulary('\0');  //root stores null char
	    try {
			vocab.buildVocab(new File(args[0]));
			boolean foundIt;      
			Scanner sc=new Scanner(wordfile);       //searches for each word from 'wordfile' in the vocabulary
	        while (sc. hasNext()){
	        	String word=sc.next();
			    foundIt = vocab.searchWord(word.toLowerCase());
			    out.println(word+" "+foundIt);
				//if (foundIt==false) {System.exit(0);} //exit condition for any word not found
	        }
	        sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }

}
