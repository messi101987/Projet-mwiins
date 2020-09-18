/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g55047
 */
public enum Direction {
    NORTH('N', "North"), SOUTH('S', "South"), WEST('W', "West"), EAST('E', "East");
    private char c;
    private String str;

    Direction(char c, String str) {
        this.c = c;
        this.str = str;
    }
    public char getChar() {
        return c;
    }
    @Override
    public String toString() {
        return str;
    }

}
