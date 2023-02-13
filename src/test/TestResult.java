package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        Long num = 370l;
        System.out.printf("The num(%d)\nIs armstrong number: %b\n", num,Exercise.ArmstrongNumber(num));
        num = 912985153l;
        System.out.printf("The num(%d)\nIs armstrong number: %b\n", num,Exercise.ArmstrongNumber(num)); 
        num = 123l;
        System.out.printf("The num(%d)\nIs armstrong number: %b\n", num,Exercise.ArmstrongNumber(num)); 
    }
}
