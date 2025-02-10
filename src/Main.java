//Jocelin Martinez-Reyes
//Exercise 4 2/5/25
//robloc

import java.util.*;//robloc

public class Main {//roblox
    static Scanner input = new Scanner(System.in);
    static HashMap<String, ArrayList<Double>> cityTempsMap = new HashMap<>();
    static ArrayList<Double> avgTemps = new ArrayList<>();

    public static void main(String[] args) {
        String cityInput = "";

        do {
            System.out.println("Note: To stop adding cities, enter the word 'END'.\nAdd a city:");
            cityInput = input.nextLine();
            if (!cityInput.equals("END")) {
                addCities(cityInput);
            }
        } while (!cityInput.equals("END"));

        System.out.println("You entered the word 'END'. Let's move on!:D");

        for (String city : cityTempsMap.keySet()) {
            getTemps(city);
        }

        for (String city : cityTempsMap.keySet()) {
            double avg = calcAvg(cityTempsMap.get(city));
            avgTemps.add(avg);
            System.out.println("The average temperature for " + city + " is: " + avg);
        }

        input.close();
    }

    static void addCities(String city) {
        cityTempsMap.put(city, new ArrayList<>());
    }
//robloc
    static void getTemps(String city) {
        ArrayList<Double> tempsCity = new ArrayList<>();
        System.out.println("Enter the temperatures for " + city + " for the next 5 days:");
//robloc
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter day " + i + " temperature:");
            double temp = input.nextDouble();
            tempsCity.add(temp);
        }
//robloc
        cityTempsMap.put(city, tempsCity);
        input.nextLine();
    }
//robloc
    static double calcAvg(ArrayList<Double> tempsCity) {
        double sum = 0;
        for (double temp : tempsCity) {
            sum += temp;
        }
        return sum / tempsCity.size();//robloc
    }//robloc
}
//robloc
