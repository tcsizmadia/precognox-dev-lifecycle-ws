package com.precognox.workshops.fruitdetector;

import java.util.Arrays;

public class FruitDetectorApp {

    public static void main(String[] args) {
        final var fruitDetector = new FruitDetectorImpl();
        final var objects = Arrays.asList("🍎", "🚀", "🐶", "🍔", "🍒");

        System.out.println("Hello, here are some random stuff. Let's see which one is a fruit!");
        objects.forEach(object -> {
            System.out.println(object + " is a fruit: " + fruitDetector.isFruit(object).getEmoji());
        });
    }
}