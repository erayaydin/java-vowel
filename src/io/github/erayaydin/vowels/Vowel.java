package io.github.erayaydin.vowels;

import java.util.HashMap;

public class Vowel {
    private HashMap<Character, Integer> vowels;

    public Vowel() {
        vowels = new HashMap<>();
        Character[] chars = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};
        initialize(chars);
    }

    private void initialize(Character[] chars) {
        for(Character character : chars){
            vowels.put(character, 0);
        }
    }

    public HashMap<Character, Integer> run(String sentence) {

        char[] characters = sentence.toLowerCase().toCharArray();
        for(int i = 0; i < sentence.length(); i++) {
            char index = characters[i];
            if(vowels.containsKey(index)){
                int count = vowels.get(index);
                vowels.put(index, count+1);
            }
        }

        return vowels;
    }

}
