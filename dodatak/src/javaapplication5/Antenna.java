/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author ANDJELA
 */
public class Antenna extends Node{
    public int r;
    public int brPokrivenih = 0;

    public Antenna(int r, int x, int y) {
        super(x, y);
        this.r = r;
    }
    

    

    public int distanceFrom(Node b){
        return Math.abs(this.x - b.x) + Math.abs(this.y - b.y);
    }
    
    public void changePosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Antenna{" + "r=" + r + '}';
    }
}
