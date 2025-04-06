package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<String> animals = new ArrayList<String>();

        System.out.println("Input the file path:");


        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        int longestLineIndex = 0;


        File file = new File(filePath);
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String nextLine = fileReader.nextLine();
                animals.add(nextLine);
                if (nextLine.length() > longestLineIndex) longestLineIndex = nextLine.length();

            }


            for (int i = 0; i < animals.size(); i++) {

                if (animals.get(i).length() < longestLineIndex) {
                    for (int j = animals.get(i).length(); j < longestLineIndex; j++) {

                        animals.set(i, animals.get(i) + " ");


                    }
                }


            }

            List<String> reversedAnimals = new ArrayList<String>();
            

            for (String animal : animals) {

                String animalLine = new StringBuilder(animal).reverse().toString();
                StringBuilder newLine = getLine(animalLine);
                reversedAnimals.add(newLine.toString());


            }

            for (int i = 0; i < animals.size(); i++) {

                System.out.print(animals.get(i));
                System.out.print(" | ");
                System.out.println(reversedAnimals.get(i));
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }


    }

    private static StringBuilder getLine(String animalLine) {
        StringBuilder newLine = new StringBuilder();


        for (char c : animalLine.toCharArray()) {
            if (c == '[') newLine.append(']');
            else if (c == ']') newLine.append('[');

            else if (c == '<') newLine.append('>');
            else if (c == '>') newLine.append('<');

            else if (c == '(') newLine.append(')');
            else if (c == ')') newLine.append('(');

            else if (c == '{') newLine.append('}');
            else if (c == '}') newLine.append('{');

            else if (c == '/') newLine.append('\\');
            else if (c == '\\') newLine.append('/');
            else newLine.append(c);
        }
        return newLine;
    }
}