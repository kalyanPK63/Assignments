package MinandMaxtest;

import MinandMax.MinMaxFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxFinderTest {

    @Test
    void findMinMax() {
        MinMaxFinder minMaxFinder = new MinMaxFinder();
        assertAll(
                () -> assertArrayEquals(new int[]{1, 4}, minMaxFinder.findMinMax(new int[]{1, 2, 3, 4})),
                () -> assertArrayEquals(new int[]{-5, 20}, minMaxFinder.findMinMax(new int[]{10, -5, 2, 20, 17, 4})),
                () -> assertArrayEquals(new int[]{0, 9}, minMaxFinder.findMinMax(new int[]{4, 8, 0, 7, 9})),
                () -> assertArrayEquals(new int[]{-10, 0}, minMaxFinder.findMinMax(new int[]{-1, -10, -4, 0}))
        );

    }

    @Test
    void findMinMax2() {
        MinMaxFinder minMaxFinder = new MinMaxFinder();
        assertAll(
                () -> assertEquals("Min = 1, Max = 4", minMaxFinder.findMinMax2(new int[]{1, 2, 3, 4})),
                () -> assertEquals("Min = -5, Max = 20", minMaxFinder.findMinMax2(new int[]{10, -5, 2, 20, 17, 4})),
                () -> assertEquals("Min = 0, Max = 9", minMaxFinder.findMinMax2(new int[]{4, 8, 0, 7, 9})),
                () -> assertEquals("Min = -10, Max = 0", minMaxFinder.findMinMax2(new int[]{-1, -10, -4, 0}))
        );

    }
}