package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int myArray[] = getIntegers(5);
       for (int i = 0; i < myArray.length; i += 1) {
            System.out.println(" My Array has the values " + myArray[i]);
        }


    }
    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter " + number + " integers: \r");
        int array[] = new int[number];
        for (int i =0; i <array.length; i +=1) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i += 1) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
      public static int[] sortIntegers(int array[]) {
          int sortedArray[] = new int[array.length];
         for (int i = 0; i < array.length; i +=1) {
              sortedArray[i] = array[i];
         }
         boolean flag = true;
         int temp;
          while (flag) {
              flag = false;
              for (int i = 0; i < sortedArray.length -1; i += 1) {
                  if (sortedArray[i] < sortedArray[i +1]) {
                      temp = sortedArray[i];
                       sortedArray[i] = sortedArray[i +1];
                       sortedArray[i + 1] = temp;
                      flag = true;
                  }
              }
         }
        return sortedArray;
      }
//    public static int[] sortIntegers(int array[]) {
//        int temp;
//        for(int i= 0; i <array.length; i+=1){
//            for(int j = i+1; j <array.length; j+=1){
//                if(array[i] < array[j]){
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//       return array;
//    }
}



