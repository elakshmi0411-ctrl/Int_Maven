package com.example.Int_maven;

/**
 * Hello world!
 */



public class Grade {

    public static String calculateGrade(int marks) {

        if (marks > 90) {
            return "A";
        }
        else if (marks >= 80) {
            return "B";
        }
        else if (marks >= 70) {
            return "C";
        }
        else {
            return "Fail";
        }
    }
}
