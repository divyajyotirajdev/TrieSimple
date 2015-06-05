package com;

class Node {            //most fundamental unit of my trie
    char alphabet;        //saves which alphabet, tail of 26 possible children, isWord flag
    Node[] tail;
    boolean isWord;
    public Node (char s1) {
      alphabet = s1;
      tail = new Node[26];
      isWord=false;
    }
  }

