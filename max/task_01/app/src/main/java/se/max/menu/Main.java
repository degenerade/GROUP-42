package se.max.menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuNew menu = new MenuNew(scanner);
        menu.run();
    }
}