package io.github.erayaydin.vowels;

import java.util.HashMap;
import java.util.Map;

public class App {


    public static void main(String[] args) {

        String sentence = "Akademik Bilisim 2018'e katilmak istiyorum";

        Vowel vowelClass = new Vowel();
        HashMap<Character, Integer> vowels = vowelClass.run(sentence);

        int total = 0;
        for (int i : vowels.values())
            total += i;

        System.out.println("Sentence: " + sentence);
        System.out.println("Total Vowel: " + total);

        System.out.println("== Vowels ==");
        for(Map.Entry<Character, Integer> vowel : vowels.entrySet()) {
            Character vowelChar  = vowel.getKey();
            Integer   vowelCount = vowel.getValue();

            System.out.println("'" + vowelChar + "' : " + vowelCount);
        }

    }

}
