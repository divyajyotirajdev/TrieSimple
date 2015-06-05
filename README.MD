Project Timeline- October 2014

######Details
Created the [Trie DataStructure](http://en.wikipedia.org/wiki/Trie) as part of a larger project as I couldnt find a satisfactory implementation of the same at the time. For a quick tutorial [this link](http://www.toptal.com/java/the-trie-a-neglected-data-structure) is pretty good.

######Before Running
1. SET UP ECLIPSE RUN CONFIGURATION: such that path_vocabularyFile.txt goes to args'[0]', and path_TestWordsFile.txt goes to args'[1]'

2. INPUTS: 
  1. VocabularyFile- containing the entire wocabulary, 
  2. TestWordsFile- containing the words to be tested against the vocabulary
  OUTPUTS: command line display of word being searched, truth value of finding it
  
3. Sample vocabulary file and test file in .txt format is provided in the resources folder of the project


######Assumptions
1. Trie is case insensitive, both vocabulary words and test words are explicitly converted to lowercase before processing on them
2. only char a-z in vocabulary and test words, exits for any other symbols (True for the vocabulary I used you might want to change if you're using a custom Vocabulary file)

######Possible Bad Cases
1. This is the only project I haven't made a pull request for from another system/ clone repository so if there's any issues in runnign please brign to my attentions
2. Since this was absorbed into a larger project I've not vigorously checked for fail cases and end cases instead thrown it out or exit wherever possible so the outer module takes care of it (will put it up soon as I finish the UI)
3. VocabularyFile and TestWordsFile found but incompatible format for Scanner
4. User possibly jumbling the order of VocabularyFile, TestWordsFile




