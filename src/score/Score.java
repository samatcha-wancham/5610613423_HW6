/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Score {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("input.txt");
        Scanner input = new Scanner(file);
        ArrayList<student> sRecord = new ArrayList<>();
        ArrayList<homework> hwRecord = new ArrayList<>();
        
        while (input.hasNext()) {
            String[] data = input.next().split(":");
            // Check student
            boolean same = false;
            for (student s : sRecord) {
                if (s.isSame(data[0])) {
                    s.hRecord.add(new homework(data[1], data[2]));
                    same = true;
                    break;
                }
            }
            if (!same) {
                sRecord.add(new student(data[0], data[1], data[2]));
            }

            // Check homework
            boolean already = false;
            for (homework h : hwRecord) {
                if (h.isAlready(data[1])) {
                    already = true;
                    break;
                }
            }
            if (!already) {
                hwRecord.add(new homework(data[1]));
            }

        }
        
        // Print score table
        System.out.print("    ID     ");
        for (homework h : hwRecord) {
            System.out.print(h);
        }
        System.out.println("");
        

        // Print  
        for (student s : sRecord) {
            System.out.print(s + " ");
            for (homework hw : hwRecord) {
                if (s.isSubmit(hw.getHomework())) {
                    s.printSubmitScore(hw.getHomework());
                } else {
                    System.out.print("  " + hw.getScore() + " ");
                }
            }
            System.out.println("");
        }
    }
}
