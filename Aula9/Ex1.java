package Aula9;

import java.util.Scanner;

public class Ex1 {

    private static int toSeconds(int rawSeconds) { return rawSeconds; }
    private static int toMinutes(int rawSeconds) { return rawSeconds/60; }
    private static int toHours(int rawSeconds) {
        return rawSeconds/3600;
    }

    private static int readSeconds(Scanner sc) {
        int rawSeconds;

        System.out.println("Insira um valor em Segundos > ");
        rawSeconds = sc.nextInt();

        return rawSeconds;
    }

    private static void printTime(int hours, int minutes, int seconds) {
        String convertToString = Integer.toString(hours) + "hours "
                +Integer.toString(minutes) + "minutes "
                +Integer.toString(seconds) + "seconds";

        System.out.println(convertToString);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rawSeconds;
        int seconds;
        int minutes;
        int hours;

        rawSeconds = readSeconds(sc);

        hours = toHours(rawSeconds);
        rawSeconds -= (hours*3600);

        minutes = toMinutes(rawSeconds);
        rawSeconds -= (minutes*60);

        seconds = toSeconds(rawSeconds);

        printTime(hours, minutes, seconds);
    }

}
