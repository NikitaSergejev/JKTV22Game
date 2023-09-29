/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22game;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author pupil
 */
public class NumberGame {
    public final Scanner scanner;
    
    public NumberGame() {
    this.scanner = new Scanner(System.in);    
    }
      public NumberGame(Scanner scanner) {
       this.scanner = scanner; 
    }

    public void DoPlay() {
        System.out.println("----Игра----"); 
        System.out.println("Для выхода введите s");
        System.out.println("Задумано число в диапазоне от 0 до 9, угадай какое");       
        int score=20;
        int time=5;       
        while (time!=0 || score<0) {
            try{
                System.out.print("Введи число: ");
                int answer = scanner.nextInt();
                Random random = new Random();
                int numRandom = random.nextInt(10);
                
                if(answer==numRandom)
                {
                    score+=10;
                    time++;
                    System.out.println("Ты угадал!");
                    System.out.print("Очки: "+score);
                    System.out.print("Время: "+time);

                }
                else if(answer!=numRandom)
                {
                    score-=10;
                    time++;
                    System.out.print("Ты проиграл");
                    System.out.print("Очки: "+score);
                    System.out.print("Время: "+time);
                }
            }catch(InputMismatchException e)
            {
                System.out.println("Ошибка: Введите целое число.");
                scanner.next(); // Очистите ввод, чтобы избежать зацикливания
            }
        }
        
    }
    
}
