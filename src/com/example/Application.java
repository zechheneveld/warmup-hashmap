package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        Warmup:
//        Using IntelliJ, create a new project
//
//        Create a console application that will read a string from the console and add it to a hashmap.
//        If the string already exists in the hashmap, increment its count and display a message to the user that it has already been added X times.
//        Continue to do this until the user enters "quit", then exit the application.
//        Once complete, add this as a github repository called "warmup-hashmap", and put the link in the slack channel.
        HashMap<String, Integer> word = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("************* Please enter a word ************");
        String inputWord = sc.nextLine();

        while (!inputWord.equalsIgnoreCase("quit")){
            if(word.containsKey(inputWord)){
                int count = word.get(inputWord).intValue();
                count++;
                System.out.println(inputWord + " has been added: " + count + " times");
                word.put(inputWord, count);

            } else {
                System.out.println("added word: " + inputWord);
                word.put(inputWord, 1);
            }

            inputWord = sc.nextLine();
        }

    }
}
