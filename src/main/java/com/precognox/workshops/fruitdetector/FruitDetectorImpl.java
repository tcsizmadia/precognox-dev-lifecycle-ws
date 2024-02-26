package com.precognox.workshops.fruitdetector;

import java.util.Collections;
import java.util.Set;

/**
 * Reference implementation of the {@link FruitDetector} interface.
 * <p>
 * Workshop participants should work on this class to implement the
 * business needs.
 */
public class FruitDetectorImpl implements FruitDetector {

    private Set<String> knownFruits = Collections.unmodifiableSet(Set.of(
            "🍎", "🍌", "🍒", "🍇", "🍍"));

    private Set<String> knownNonFruits = Collections.unmodifiableSet(Set.of(
            "🍔", "🍕", "🍞", "🍰", "🍫"));

    @Override
    public Results isFruit(String emoji) {
        if (knownFruits.contains(emoji)) {
            return Results.POSITIVE;
        }

        if (knownNonFruits.contains(emoji)) {
            return Results.NEGATIVE;
        }

        return Results.UNKNOWN;
    }

}
