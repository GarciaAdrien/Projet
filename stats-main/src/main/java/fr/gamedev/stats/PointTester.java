package fr.gamedev.stats;

import fr.gamedev.stats.fixedSizeCoeficient.FscRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PointTester {

    private final PointCalculator pointCalculator = PointCalculator.getInstance();

    @Test
    void fsc() {
        assertEquals(pointCalculator.fsc(10, true, (short) 25, FscRule.fromString(
                "[Fixed step coefficient plus firstTime bonus rounded up (accumulated points)] " +
                        "FSC[(100)(up)(accumulated_points-*)500-2|1000-1.5|2000-1|5000-0.75|10000-0.5|50000-0.25|i-0.01]"
        )), 255);
    }
}