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
public class Building extends Node{
    public boolean pokrivena;

    @Override
    public String toString() {
        return "Building{" + '}';
    }

    public Building(int x, int y) {
        super(x, y);
    }
    
}
