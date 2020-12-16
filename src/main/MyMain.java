package main;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index of the array element you want to access ");
        try{
            int index = sc.nextInt();
            System.out.println("the array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");
        }
        catch (Exception e){
            System.out.println();
            System.out.println("User entered invalid index.");
            System.out.println(e.getClass());
        }
    }

}
