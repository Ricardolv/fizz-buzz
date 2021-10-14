package br.com.richard.game;

public class FizzBuzz {

    public String toAnalyze(int number) {
        if (number >= 500) {
            return "Raia Drogasil";
        } else if (((number % 5) == 0) && ((number % 7) == 0)) {
            return "fizzbuzz";
        } else if (((number % 5) == 0)) {
            return "fizz";
        } else if (((number % 7) == 0)) {
            return "buzz";
        }  else {
            return String.format("Number %d", number);
        }
    }
}
