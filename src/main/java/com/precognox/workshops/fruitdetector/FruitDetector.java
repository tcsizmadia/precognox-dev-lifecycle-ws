package com.precognox.workshops.fruitdetector;

/**
 * This interface is used to describe an entity which is capable to detect
 * fruits.
 *
 * @author Tamas Csizmadia
 */
public interface FruitDetector {

    /**
     * For a given emoji, this method returns the result of the detection.
     * Which can be positive - if the provided emoji is definitely a fruit,
     * negative - if the provided emoji is definitely not a fruit,
     * or unknown - if the implementor of this {@code interface} cannot decide
     * confidently.
     * 
     * @param emoji the emoji to be checked
     * @return the result of the detection
     */
    Results isFruit(String emoji);
}