package programmingcup;

import java.util.Scanner;
import java.io.*;

public class BuscaMinas {

    public static void main(String a[]) throws FileNotFoundException {
        long start = System.currentTimeMillis();
        Scanner input = new Scanner(new File("src/ProgrammingCup/input.txt"));
        while (input.hasNext()) {
            System.out.println("\n");

            String[] data = input.nextLine().split(" ");
            int row = Integer.parseInt(data[0]);
            int col = Integer.parseInt(data[1]);
            String[][] field = new String[row + 2][col + 2];

            for (int i = 0; i < field.length; i++) 
                for (int j = 0; j < col + 2; j++) 
                    field[i][j] = "";
            
            for (int i = 1; i < row + 1; i++) {
                for (int j = 1; j < col + 1; j++) {
                    int choose = (int) (Math.random() * 2);
                    if (choose == 1) {
                        System.out.print("* ");
                        field[i][j] = "*";
                    } else {
                        System.out.print(". ");
                        field[i][j] = ".";
                    }
                }
                System.out.println();
            }
            System.out.println("\n\n");
            for (int i = 1; i < row + 1; i++) {
                for (int j = 1; j < col + 1; j++) {
                    //System.out.println("i "+i+", j"+j);
                    int k = 0;
                    if (!field[i][j].equals("*") && !field[i][j].equals("")) {

                        if (field[i - 1][j].equals("*")) {
                            k++;
                        }
                        if (field[i - 1][j + 1].equals("*")) {
                            k++;
                        }
                        if (field[i][j + 1].equals("*")) {
                            k++;
                        }
                        if (field[i + 1][j + 1].equals("*")) {
                            k++;
                        }
                        if (field[i + 1][j].equals("*")) {
                            k++;
                        }
                        if (field[i + 1][j - 1].equals("*")) {
                            k++;
                        }
                        if (field[i][j - 1].equals("*")) {
                            k++;
                        }
                        if (field[i - 1][j - 1].equals("*")) {
                            k++;
                        }
                    }
                    System.out.print(k+" ");

                }
                System.out.println();

            }
        }
        System.out.println("time = " + (System.currentTimeMillis() - start));
    }
}
