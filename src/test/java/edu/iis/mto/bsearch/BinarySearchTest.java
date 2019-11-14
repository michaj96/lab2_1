package edu.iis.mto.bsearch;


import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void searchSingleElementTrue() {
        int key = 25;
        int[] seq = {25};
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound());
    }
}