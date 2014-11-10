/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package score;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class student {

    // Field
    private String ID;
    ArrayList<homework> hRecord = new ArrayList<>();

    // Constructor
    public student(String id) {
        this.ID = id;
    }

    public student(String id, String hw, String score) {
        this.ID = id;
        hRecord.add(new homework(hw, score));
    }

    // Medthod
    public boolean isSame(String id) {
        return ID.equals(id);
    }

    public boolean isSubmit(String hwName) {
        for (homework h : hRecord) {
            if (h.getHomework().equals(hwName)) {
                return true;
            }
        }
        return false;
    }

    public void printSubmitScore(String hwName) {
        for (homework h : hRecord) {
            if (h.getHomework().equals(hwName)) {
                System.out.printf(" %2d ", Integer.parseInt(h.getScore()));
                break;
            }
        }
    }

    @Override
    public String toString() {
        System.out.print(ID);
        return "";
    }
}
