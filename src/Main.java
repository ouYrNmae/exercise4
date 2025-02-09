//Jocelin Martinez-Reyes
//Exercise 4 2/5/25
//Robloc
import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> cities = new ArrayList<>();
    static ArrayList<ArrayList<Double>> allTemps = new ArrayList<>();
    static ArrayList<Double> avgTemps = new ArrayList<>();

    public static void main(String[] args) {
        String cityInput = "";
//Robloc
        do {
            System.out.println("Note: To stop adding cities, enter the word 'END'.\nAdd a city:");
            cityInput = input.nextLine();
            if (!cityInput.equals("END")) {
                addCities(cityInput);
            }
        } while (!cityInput.equals("END"));
//Robloc
        System.out.println("You entered the word 'END'. Let's move on!:D");//Robloc
        //Robloc
        for (String city : cities) {
            collectTemperatures(city);
        }
//Robloc
        for (int i = 0; i < cities.size(); i++) {
            double avg = calculateAverage(allTemps.get(i));
            avgTemps.add(avg);
            System.out.println("The average temperature for " + cities.get(i) + " is: " + avg);
        }
//Robloc
        input.close();
    }
//Robloc
    static void addCities(String city) {
        cities.add(city);
    }
//Robloc
    static void collectTemperatures(String city) {
        ArrayList<Double> tempsForCity = new ArrayList<>();
        System.out.println("Enter the temperatures for " + city + " for the next 5 days:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter day " + i + " temperature:");
            double temp = input.nextDouble();
            tempsForCity.add(temp);
        }
//Robloc
        allTemps.add(tempsForCity);
//Robloc
        input.nextLine();
    }
//Robloc
    static double calculateAverage(ArrayList<Double> tempsForCity) {
        double sum = 0;
        for (double temp : tempsForCity) {
            sum += temp;
        }
        return sum / tempsForCity.size();//Robloc
    }//Robloc
}//Robloc
