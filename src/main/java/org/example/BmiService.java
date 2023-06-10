package org.example;
public class BmiService {
    public double calculate (double parameters) {
        double bmiServiceIndex = parameters / Math.pow (1.7, 2);
        return bmiServiceIndex;
    }
}