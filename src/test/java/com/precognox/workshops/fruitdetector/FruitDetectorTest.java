package com.precognox.workshops.fruitdetector;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * This class is used to test the {@link FruitDetector} implementation.
 * <p>
 * Workshop participants should not modify this class, but they should
 * satisfy the requirements and make the tests pass (make them green).
 */
public class FruitDetectorTest {

    private FruitDetector fruitDetector;

    @BeforeEach
    public void setUp() {
        fruitDetector = new FruitDetectorImpl();
    }

    @ParameterizedTest
    @ValueSource(strings = { "🍎", "🍌", "🍒", "🍇", "🍍" })
    public void testKnownFruitsGivenShouldReturnPositiveResults(String fruitEmoji) {
        assertEquals(Results.POSITIVE, fruitDetector.isFruit(fruitEmoji));
    }

    @ParameterizedTest
    @ValueSource(strings = { "🍔", "🍕", "🍞", "🍰", "🍫" })
    public void testKnownNonFruitsGivenShouldReturnNegativeResults(String nonFruitEmoji) {
        assertEquals(Results.NEGATIVE, fruitDetector.isFruit(nonFruitEmoji));
    }

    @ParameterizedTest
    @ValueSource(strings = { "🚀", "🐶", "🐱", "🐭", "🐹" })
    public void testUnknownObjectsGivenShouldReturnUnknownResults(String unknownEmoji) {
        assertEquals(Results.UNKNOWN, fruitDetector.isFruit(unknownEmoji));
    }
}