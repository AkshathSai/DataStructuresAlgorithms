package org.example.datastructures.cache;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LRUTest {

    public static void main(String[] args) {

        LRUCache lruCache = new LRUCache<>(2);
        lruCache.put(20, 21);
        lruCache.put("ABC" , "BCA");
        log.info("" + lruCache);
        log.info("" + lruCache.get(20));
        log.info("" + lruCache.get("ABC"));
        log.info("" + lruCache.get(21));
    }
}
