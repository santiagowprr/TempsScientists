package cpm.example.mypackage;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        TempsManager tempsManager = new TempsManager();
        ArrayList<Integer> arrTemps = new ArrayList<>();
        arrTemps.add(10);
        arrTemps.add(-7);
        arrTemps.add(0);
        arrTemps.add(100);
        arrTemps.add(-7);
        arrTemps.add(9);
        arrTemps.add(-30);
        arrTemps.add(-2);
        arrTemps.add(-2);
        ArrayList<Integer> result = tempsManager.getTempsAroundZero(arrTemps);
        System.out.println(result); // [0]

    }
}

class TempsManager{
    public ArrayList<Integer> getTempsAroundZero( ArrayList<Integer> inputTemps){
        // creating new Arraylist to hold the final values
        ArrayList<Integer> tempsAroundZero = new ArrayList<>();

        int maxTemp = Collections.max(inputTemps);

        for (Integer temperature : inputTemps){
        // checking if there's a 0 in the array. If so, return arr with only one 0
            if(temperature == 0){
                tempsAroundZero.clear();
                tempsAroundZero.add(0);
                return tempsAroundZero;
            }
        // check which nr is closest to 0 and how often does it appear:
            else if(Math.abs(temperature) < Math.abs(maxTemp)){
                maxTemp = temperature;
                tempsAroundZero.clear();
                tempsAroundZero.add(temperature);

                // if the checked temp is equal to the nearest to 0 - add it to the arr
            } else if(temperature == maxTemp){
                tempsAroundZero.add(temperature);
            }
        }
        // return array of temps closest to 0
        return tempsAroundZero;
    }
}
