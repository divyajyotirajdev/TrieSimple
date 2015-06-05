package com;

import static java.lang.System.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Vocabulary {
	  Node root;
	  public Vocabulary(char s1) {        //note constructor for Vocabulary will only be called for root
	    root = new Node(s1);
	  }
	  public void buildVocab(File s1) throws FileNotFoundException {   //reads words from VocabularyFile and adds to trie
	      Scanner sc = new Scanner(s1);
	      while(sc.hasNext()) {
	        addWord(sc.next().toLowerCase());
	      }
	  }
	  public int getIndex(char c){          //returns index of tail at which the character should be stored
	    int in = (int) c-'a';
	    if (in<0 || in>25) {System.exit(0);}    //exit condition for ay char except a-z
	    return in;
	  }
	  public void addWord(String s1){       //logic of adding each word to Trie
	    Node thisNode = root;	
			for(int i=0;i<s1.length();++i) {
	      if(i==s1.length()-1) {thisNode.isWord = true;}  //set isWord for last char or input string
	      int index = getIndex(s1.charAt(i));
				if(thisNode.tail[index] == null) {
					thisNode.tail[index] = new Node(s1.charAt(i)); //if tail does not exist create tail node with charAt(i)
				}
				thisNode = thisNode.tail[index];      //go to next tail while end of s1 is not reached
			}	
	  }
	  public Boolean searchWord(String s1){     //logic for finding word in trie built, enter at root
	    Node thisNode = root;                   
			while(thisNode != null) {               //keep traversing DFS to next tail, if null found word does not exist
				for(int i=0;i<s1.length();i++) {	
	        int index = getIndex(s1.charAt(i));			
					if(thisNode.tail[index]== null) {return false;}
	        thisNode = thisNode.tail[index];
	      }
	      if (thisNode.isWord == true) {return true;} //if for length of word no null is found that means entire word exists in trie, but to root out possible prefixes check isWord flag
	    }
	    return false;                           //will reach here if word is a prefix only eg 'categ' from 'category'
	  }
}
