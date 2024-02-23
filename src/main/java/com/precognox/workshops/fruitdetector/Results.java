package com.precognox.workshops.fruitdetector;

/**
 * Used to represent the result of the detection. Every result is represented by
 * an emoji.
 * <p>
 * The possible results are:
 * - POSITIVE: 👍
 * - NEGATIVE: 👎
 * - UNKNOWN: 🤷‍♂️
 * 
 * @author Tamas Csizmadia
 * @see FruitDetector
 */
public enum Results {
    POSITIVE("👍"),
    NEGATIVE("👎"),
    UNKNOWN("🤷‍♂️");

    private final String emoji;

    Results(String emoji) {
        this.emoji = emoji;
    }

    public String getEmoji() {
        return emoji;
    }
}