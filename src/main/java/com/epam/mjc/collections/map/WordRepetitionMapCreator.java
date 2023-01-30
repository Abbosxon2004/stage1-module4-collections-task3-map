package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence = sentence.replace(".", "");
        sentence = sentence.replace(",", "");
        Map<String, Integer> map = new TreeMap<>();
        String[] splittedWords = sentence.split("\\s");
        for (String splittedWord : splittedWords) {
            String str = splittedWord.toLowerCase();
            if (!str.isEmpty()) {
                if (!map.containsKey(str))
                    map.put(str, 1);
                else
                    map.put(str, map.get(str) + 1);
            }
        }
        return map;
    }
}
