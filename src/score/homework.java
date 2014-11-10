/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package score;

/**
 *
 * @author Administrator
 */
public class homework {

    // Field
    private String HW;
    private String score = "-";

    // Constructor
    public homework(String name, String initscore) {
        HW = name;
        score = initscore;
    }

   public homework(String name) {
        this.HW = name;
    }

    // Method
    public boolean isAlready(String hwName) {
        return HW.equals(hwName);
    }

    public void setScore(String initscore) {
        this.score = initscore;
    }

    public String getHomework() {
        return HW;
    }

    public String getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        System.out.print(HW + " ");
        return "";
    }
}
