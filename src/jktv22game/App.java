/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22game;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner;/*поле хранит состояние класса*/
    
    public App() {
        this.scanner= new Scanner(System.in);
    }

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        boolean repeat = true;
        do {
            System.out.println("Выберите задачу ");
            System.out.println("0.Закончить программу");
            System.out.println("1.Игра угадай число");         
            System.out.print("Номер задачи ");
            int task = scanner.nextInt();
            switch (task) { /*sw-> tab*/
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    NumberGame numberGame = new NumberGame (scanner);
                    numberGame.DoPlay();
                    break;
                default:
                    System.out.println("Выберите номер из списка");  
                    }  
                }while (repeat);
    }
}

