import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

class SolutionTests {
    private static final List<int[]> testCases =
            List.of(
                    new int[] {2, 3, 2},
                    new int[] {5},
                    new int[] {2, 3},
                    new int[] {1, 2, 3, 1},
                    new int[] {10, 1, 1, 10},
                    new int[] {5, 5, 5, 5},
                    new int[] {1, 2, 3, 4, 5},
                    new int[] {5, 4, 3, 2, 1},
                    new int[] {6, 7, 1, 30, 8, 2, 4},
                    new int[] {1, 3, 1, 3, 100},
                    new int[] {2, 1, 4, 9, 2},
                    new int[] {}
            );

    // Tests for robDP method
    @Test
    public void robDPFirstTest() {
        assertEquals(3, Solution.robDP(testCases.get(0)));
    }

    @Test
    public void robDPSecondTest() {
        assertEquals(5, Solution.robDP(testCases.get(1)));
    }

    @Test
    public void robDPThirdTest() {
        assertEquals(3, Solution.robDP(testCases.get(2)));
    }

    @Test
    public void robDPFourthTest() {
        assertEquals(4, Solution.robDP(testCases.get(3)));
    }

    @Test
    public void robDPFifthTest() {
        assertEquals(11, Solution.robDP(testCases.get(4)));
    }

    @Test
    public void robDPSixthTest() {
        assertEquals(10, Solution.robDP(testCases.get(5)));
    }

    @Test
    public void robDPSeventhTest() {
        assertEquals(8, Solution.robDP(testCases.get(6)));
    }

    @Test
    public void robDPEighthTest() {
        assertEquals(8, Solution.robDP(testCases.get(7)));
    }

    @Test
    public void robDPNinthTest() {
        assertEquals(41, Solution.robDP(testCases.get(8)));
    }

    @Test
    public void robDPTenthTest() {
        assertEquals(103, Solution.robDP(testCases.get(9)));
    }

    @Test
    public void robDPEleventhTest() {
        assertEquals(11, Solution.robDP(testCases.get(10)));
    }

    @Test
    public void robDPTwelfthTest() {
        assertEquals(0, Solution.robDP(testCases.get(11)));
    }

    // Tests for robSlow method
    @Test
    public void robSlowFirstTest() {
        assertEquals(3, Solution.robSlow(testCases.get(0)));
    }

    @Test
    public void robSlowSecondTest() {
        assertEquals(5, Solution.robSlow(testCases.get(1)));
    }

    @Test
    public void robSlowThirdTest() {
        assertEquals(3, Solution.robSlow(testCases.get(2)));
    }

    @Test
    public void robSlowFourthTest() {
        assertEquals(4, Solution.robSlow(testCases.get(3)));
    }

    @Test
    public void robSlowFifthTest() {
        assertEquals(11, Solution.robSlow(testCases.get(4)));
    }

    @Test
    public void robSlowSixthTest() {
        assertEquals(10, Solution.robSlow(testCases.get(5)));
    }

    @Test
    public void robSlowSeventhTest() {
        assertEquals(8, Solution.robSlow(testCases.get(6)));
    }

    @Test
    public void robSlowEighthTest() {
        assertEquals(8, Solution.robSlow(testCases.get(7)));
    }

    @Test
    public void robSlowNinthTest() {
        assertEquals(41, Solution.robSlow(testCases.get(8)));
    }

    @Test
    public void robSLowTenthTest() {
        assertEquals(103, Solution.robSlow(testCases.get(9)));
    }

    @Test
    public void robSlowEleventhTest() {
        assertEquals(11, Solution.robSlow(testCases.get(10)));
    }

    @Test
    public void robSlowTwelfthTest() {
        assertEquals(0, Solution.robSlow(testCases.get(11)));
    }
}