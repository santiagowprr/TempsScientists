package cpm.example.mypackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {
        int[] arrTemps = new int[3];


    }
}

class TempsManager{
    public int[] getTempsAroundZero(Integer[] inputTemps){
        int tempAroundZero = Collections.max(Arrays.asList(inputTemps));
    }
}