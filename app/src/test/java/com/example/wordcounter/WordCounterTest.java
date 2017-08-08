package com.example.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rossmelville on 08/08/2017.
 */

public class WordCounterTest {

    String testPassage;
    WordCounter wordCounter;

    @Before
    public void before(){
        testPassage = "Hello my name is Ross";
        wordCounter = new WordCounter(testPassage);
    }

    @Test
    public void testCanReturnWordsInPassage() {
        assertEquals(5, wordCounter.wordCount());
    }

    @Test
    public void testCanReturnNumberOfWordOccurrencesInPassage() {
        assertEquals("Hello - 1, my - 1, name - 1, is - 1, Ross - 1", wordCounter.wordOccurrence());

    }


}
