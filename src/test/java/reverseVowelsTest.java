import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class reverseVowelsTest {

    @Test
    void edgeCase_One(){
        reverseVowels solution = new reverseVowels();
        assertEquals("holle", solution.reverseVowels("hello"));
    }

    @Test
    void edgeCase_two(){
        reverseVowels solution = new reverseVowels();
        assertEquals("leotcede", solution.reverseVowels("leetcode"));
    }
}
