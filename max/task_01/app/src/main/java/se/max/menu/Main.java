package se.max.menu;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        MenuNew menu = new MenuNew(scanner, random);
        menu.run();
    }
}