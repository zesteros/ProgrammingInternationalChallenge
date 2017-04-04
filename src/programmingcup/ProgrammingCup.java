/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingcup;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

/**
 *
 * @author Angelo
 */
public class ProgrammingCup {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();

        Scanner input = new Scanner(new File("src/ProgrammingCup/entrada.txt"));
        while (input.hasNext()) {
            String line = input.nextLine();
            String numbers[] = line.split(" ");
            int i = Integer.parseInt(numbers[0]);
            int j = Integer.parseInt(numbers[1]);
            System.out.print(i + " " + j);
            int cycleSize = 0;
            for (int k = i; k <= j; k++) {
                int cycle = 0;
                int n = k;
                while (n > 1) {
                    if (n % 2 == 0) 
                        n /= 2;
                    else 
                        n = 3 * n + 1;
                    cycle++;
                }
                if (cycle > cycleSize) 
                    cycleSize = cycle;
                
            }
            System.out.print(" "+ cycleSize+"\n");

        }
        long end = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución: "+(end-start)+" milliseconds");
    }

}
