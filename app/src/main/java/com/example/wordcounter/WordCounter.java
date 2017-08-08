package com.example.wordcounter;

/**
 * Created by rossmelville on 08/08/2017.
 */

public class WordCounter {

    String passage;

    public WordCounter(String passage) {
        this.passage = passage;
    }

    public int wordCount() {
        int count = 0;
        String[] words = this.passage.split(" ");
        for(String word : words) {
            count += 1;
        }
        return count;
    }
}
