package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double calculateTriangleArea(double base, double height){
        return base * height / 2;
    }
    public static double calculateRectangleArea(double length, double width){
        return length * width;
    }
    public static double calculateCircleArea(double radius){
        return radius * radius * Math.PI;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Area Calculator ==");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");
        int option = scanner.nextInt();

        switch(option){
            // Circle
            case 1:
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
                System.out.print("Area of the circle: ");
                System.out.printf("%.2f", calculateCircleArea(radius));
                break;
            //Triangle
            case 2:
                System.out.print("Enter the base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height: ");
                double height = scanner.nextDouble();
                System.out.print("Area of the triangle: ");
                System.out.printf("%.2f", calculateTriangleArea(base,height));
                break;
            //Rectangle
            case 3:
                System.out.print("Enter the length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the height: ");
                double width = scanner.nextDouble();
                System.out.print("Area of the rectangle: ");
                System.out.printf("%.2f", calculateRectangleArea(length, width));
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }
}