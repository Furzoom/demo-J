package com.furzoom.lab;

public class HanoiTower {
    public static void moveDish(int level, char from, char inter, char to) {
        if (level == 1) {
            System.out.println("Move dish " + level + " from " + from + " to " 
                    + to);
        } else {
            moveDish(level - 1, from, to, inter);
            System.out.println("Move disk " + level + " from " + from + " to "
                    + to);
            moveDish(level - 1, inter, from, to);
        }
    }

    public static void main(String[] args) {
        int nDishs = 3;
        moveDish(nDishs, 'A', 'B', 'C');
    }
}

