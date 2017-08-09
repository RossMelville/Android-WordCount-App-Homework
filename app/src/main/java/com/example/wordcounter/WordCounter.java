package com.example.wordcounter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by rossmelville on 08/08/2017.
 */

public class WordCounter {

    String passage;
    HashMap<String, Integer> wordTracker;

    public WordCounter(String passage) {
        this.passage = passage;
        wordTracker = new HashMap<String, Integer>();
    }

    public int wordCount() {
        int count = 0;
        String[] words = this.passage.split(" ");
        for (String word : words) {
            if (wordTracker.containsKey(word) == true) {
                Integer value = wordTracker.get(word);
                wordTracker.put(word, value + 1);
                count += 1;
            } else if (wordTracker.containsKey(word) == false) {
                wordTracker.put(word, 1);
                count += 1;
            }
        }
        return count;
    }



}

