package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        Set<Integer> keyset = sourceMap.keySet();
        for (Integer key : keyset) {
            if (!map.containsValue(key))
                map.put(sourceMap.get(key), key);
        }
        return map;
    }
}
