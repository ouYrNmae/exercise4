//Jocelin Martinez-Reyes
//Exercise 4 2/5/25
//Write a program that first prompts the user to enter a list of city names, one at a time until the user specifies "END".
// Next, the program should prompt the user to enter the average daily temperature for
// each of the next five days for each city. The program should store the user's cities and temperature data in one data
// structure. Next, calculate the five-day average for each city.
//Finally, display a message containing the city's name and the average for each city.
//The code to prompt the user for input, to calculate the five-day average, and to display the results should be in separate methods.
//Hint: You can use String.split(" ") to split a string into an array of strings based on where spaces occur in the original string.

//List<String> cities
//List<Double> temps
//List<Double> avgTemps
//Map<String, ArrayList,<Double>>

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> cities = new ArrayList<>();
    static ArrayList<Double> temps = new ArrayList<>();
    static ArrayList<Double> avgTemps = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        do {
            System.out.println("Note: To stop adding cities enter the word 'END'\nAdd a city:");
            addCities();
            input = scanner.nextLine();
        } while (!input.equals("END"));

        System.out.println("You entered the word 'END'. Loop 1 terminated.");
        for (String city : cities) {
            System.out.println(city);
        }
        scanner.close();
    }

    static void addCities() {
        String city = input.nextLine();
        cities.add(city);
        System.out.println("Note: To stop adding cities enter the word 'END'\nAdd a city:");
    }
}
