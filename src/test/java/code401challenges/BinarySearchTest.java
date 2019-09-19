package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void main() {
    }

    @Test
    public void searchTest() {
        int expected = BinarySearch.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 8);
        assertEquals(7, expected);
    }

    @Test
    public void searchInputEmptyTest() {
        assertEquals(-1, BinarySearch.search(new int[]{}, 8));
    }
}