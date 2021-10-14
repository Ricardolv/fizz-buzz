package br.com.richard.game;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz game;

    @BeforeEach
    public void setUp() {
        game = new FizzBuzz();
    }

    @Test
    void shouldReturnFizzBuzzWhenInformingNumber_35() {

        assertEquals(game.toAnalyze(35), "fizzbuzz");
    }

    @Test
    void shouldReturnFizzWhenInformingNumber_25() {

        assertEquals(game.toAnalyze(25), "fizz");
    }

    @Test
    void shouldReturnBuzzWhenInformingNumber_14() {

        assertEquals(game.toAnalyze(14), "buzz");
    }

    @Test
    void shouldReturnRadixWhenInformingNumber_387() {

        assertEquals(game.toAnalyze(387), "Number 387");
    }

    @Test
    void shouldReturnRadixWhenInformingNumber_700() {

        assertEquals(game.toAnalyze(700), "Raia Drogasil");
    }

}