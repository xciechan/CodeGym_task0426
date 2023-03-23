package pl.codegym.task04.task0426;

import java.io.*;

/**
 Created by xciechan
 on 2023-03-23

 The application checks whether a number is positive or negative and parity number.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        printSolution(readNumber());
    }

    public static int readNumber () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int number = Integer.parseInt(bufferedReader.readLine());

        return number;
    }

    public static boolean isParity (int number){
        return number % 2 == 0 ? true : false;
    }

    public static void printSolution (int number){
        if ((number > 0) && isParity(number)){
            System.out.println("Dodatnia liczba parzysta");
        } else if ((number > 0) && !isParity(number)) {
            System.out.println("Dodatnia liczba nieparzysta");
        } else if ((number < 0) && isParity(number)){
            System.out.println("Ujemna liczba parzysta");
        } else if ((number < 0) && !isParity(number)){
            System.out.println("Ujemna liczba nieparzysta");
        } else
            System.out.println("Zero");
    }

}