package com.os.ileschinsky.fundamentals.optionaltask;

import java.util.Arrays;
import java.util.Scanner;

public class FirstOptional {
    public static void main(String[] args) {
        int numberOfElements;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        if (!in.hasNextInt()){
            throw new IllegalArgumentException("Number of elements should be int!");
        }
        numberOfElements = in.nextInt();
        if (numberOfElements < 1) {
            throw new IllegalArgumentException("Number of arguments can't be negative");
        }
        long[] elements = new long [numberOfElements];
        char [][] elementsChar = new char[numberOfElements][];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.printf("Enter %d element: ", i);
            elements[i] = in.nextLong();
            elementsChar[i] = String.valueOf(elements[i]).toCharArray();
        }
        in = new Scanner(System.in);
        System.out.print("Choose the task (1-7): ");
        int taskChoice = in.nextInt();
        switch (taskChoice) {
            case 1:
                longShortNumber(elements, elementsChar);
                break;
            case 2:
                System.out.print("Choose Ascending(1) or Descending (2) order: ");
                in = new Scanner(System.in);
                int ascOrDesc = in.nextInt();
                if (ascOrDesc == 1) {
                    sortByLengthAsc(elements, elementsChar);
                } else if (ascOrDesc == 2) {
                    sortByLengthDesc(elements, elementsChar);
                } else {
                    throw new IllegalArgumentException("No such choice for that task");
                }
                break;
            case 3:
                System.out.print("Choose Above Average(1) or Below Average (2): ");
                in = new Scanner(System.in);
                int aboveBelow = in.nextInt();
                if (aboveBelow == 1) {
                    printAboveAverage(elements, elementsChar);
                } else if (aboveBelow == 2) {
                    printBelowAverage(elements, elementsChar);
                } else {
                    throw new IllegalArgumentException("No such choice for that task");
                }
                break;
            case 4:
                diffNumbers(elements, elementsChar);
                break;
            case 5:
                oddEven(elements, elementsChar);
                break;
            case 6:
                ascendingOrder(elements, elementsChar);
                break;
            case 7:
                onlyDiffNumbers(elements, elementsChar);
                break;
            default:
                System.out.println("No such task");
                break;
        }

    }

    public static int getLength(char[] ch) {
        if (ch[0] == '-') {
            return ch.length - 1;
        } else {
            return ch.length;
        }
    }


    public static void longShortNumber(long[] elements, char[][] elementsChar){
        int min = 0;
        int minLength = getLength(elementsChar[min]);
        int max = 0;
        int maxLength = getLength(elementsChar[max]);
        int elementLength;
        for (int i = 0; i < elements.length; i++){
            elementLength = getLength(elementsChar[i]);
            if (elementLength > maxLength) {
                max = i;
                maxLength = elementLength;
            }
            if (elementLength < minLength) {
                min = i;
                minLength = elementLength;
            }
        }
        System.out.printf("Element with minimum length is %d and it is %d \n", min, elements[min]);
        System.out.printf("Element with maximum length is %d and it is %d \n", max, elements[max]);
    }

    public static void sortByLengthAsc(long[] elements, char[][] elementsChar){
        long tempInt;
        char[] tempChar;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (getLength(elementsChar[j]) < getLength(elementsChar[i])){
                    tempInt = elements[i];
                    tempChar = elementsChar[i];
                    elements[i] = elements[j];
                    elementsChar[i] = elementsChar[j];
                    elements[j] = tempInt;
                    elementsChar[j] = tempChar;
                }
            }
        }
        System.out.println(Arrays.toString(elements));
    }

    public static void sortByLengthDesc(long[] elements, char[][] elementsChar){
        long tempInt;
        char[] tempChar;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (getLength(elementsChar[j]) > getLength(elementsChar[i])){
                    tempInt = elements[i];
                    tempChar = elementsChar[i];
                    elements[i] = elements[j];
                    elementsChar[i] = elementsChar[j];
                    elements[j] = tempInt;
                    elementsChar[j] = tempChar;
                }
            }
        }
        System.out.println(Arrays.toString(elements));
    }

    public static void printAboveAverage(long[] elements, char[][] elementsChar){
        int sum = 0;
        for (int i = 0; i < elements.length; i++){
            sum += getLength(elementsChar[i]);
        }
        float avg = (float)sum / elements.length;
        for (int i = 0; i < elements.length; i++){
            if (getLength(elementsChar[i]) >= avg) {
                System.out.printf("The length of %d is %d and it's above (or equal to) average (%2.1f) \n",
                        elements[i],
                        getLength(elementsChar[i]),
                        avg);
            }
        }
    }

    public static void printBelowAverage(long[] elements, char[][] elementsChar){
        int sum = 0;
        for (int i = 0; i < elements.length; i++){
            sum += getLength(elementsChar[i]);
        }
        float avg = (float)sum / elements.length;
        for (int i = 0; i < elements.length; i++){
            if (getLength(elementsChar[i]) <= avg) {
                System.out.printf("The length of %d is %d and it's below (or equal to) average (%2.1f) \n",
                        elements[i],
                        getLength(elementsChar[i]),
                        avg);
            }
        }
    }

    public static void diffNumbers(long[] elements, char[][] elementsChar){
        int minLength = getLength(elementsChar[0]);
        int min = 0;
        int elementLength;
        for (int i = 0; i < elements.length; i++){
            elementLength = elementsChar[i].length;
            for (int j = 0; j < elementsChar[i].length - 1; j++) {
                for (int k = j + 1; k < elementsChar[i].length; k ++){
                    if (elementsChar[i][j] == elementsChar[i][k]){
                        elementLength--;
                    }
                }
            }
            if (elementLength < minLength) {
                minLength = elementLength;
                min = i;
            }
        }
        System.out.printf("Number with minimum number of digits is %d", elements[min]);
    }

    public static void oddEven(long[] elements, char[][] elementsChar){
        int oddCount = 0;
        int oddEvenCount = 0;
        int numberOddCount = 0;
        int numberEvenCount = 0;
        int j;
        boolean oddFlag;
        for (int i = 0; i < elements.length; i++) {
            j = 0;
            oddFlag = true;
            while (j++ < elementsChar[i].length - 1) {
                if (elementsChar[i][j] % 2 != 0){
                    oddFlag = false;
                    break;
                }
            }
            if (oddFlag) {
                oddCount++;
            } else {
                for (int k = 0; k < elementsChar[i].length; k++){
                    if (elementsChar[i][k] % 2 == 0) {
                        numberOddCount++;
                    } else {
                        numberEvenCount++;
                    }
                }
                if (numberEvenCount == numberOddCount) {
                    oddEvenCount++;
                }
            }
        }
        System.out.println("Number of elements with odds: " + oddCount);
        System.out.println("Number of elements with equal amount of odds and evens: " + oddEvenCount);
    }

    public static void ascendingOrder(long[] elements, char[][] elementsChar){
        int ascendingNumbers = -1;
        boolean ascFlag;
        int j;
        for (int i = 0; i < elements.length; i++) {
            j = 0;
            ascFlag = true;
            while (j++ < elementsChar[i].length - 2) {
                if (elementsChar[i][j] > elementsChar[i][j + 1]){
                    ascFlag = false;
                    break;
                }
            }
            if (ascFlag && ascendingNumbers == -1) {
                ascendingNumbers = i;
            }
        }
        if (ascendingNumbers != -1){
            System.out.println("The number is: " + elements[ascendingNumbers]);
        } else {
            System.out.println("No such numbers");
        }

    }

    public static void onlyDiffNumbers(long[] elements, char[][] elementsChar){
        int elementNumber = -1;
        int elementLength;
        for (int i = 0; i < elements.length; i++){
            elementLength = elementsChar[i].length;
            for (int j = 0; j < elementsChar[i].length - 1; j++) {
                for (int k = j + 1; k < elementsChar[i].length; k ++){
                    if (elementsChar[i][j] == elementsChar[i][k]){
                        elementLength--;
                    }
                }
            }
            if (elementLength == elementsChar[i].length && elementNumber == -1) {
                elementNumber = i;
            }
        }
        if (elementNumber != -1) {
            System.out.printf("Number with diff digits is %d", elements[elementNumber]);
        } else {
            System.out.println("No such number");
        }

    }
}
