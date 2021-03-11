/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author ANDJELA
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Node mat[][] = new Node[10][15];
        List<Antenna> antennas = new ArrayList<>();

        List<Building> buildings = new ArrayList<>();

        int n = 6000;
        int m = 6000;
        int antene = 32515;

        int size = n * m;

        Set<Integer> set = new HashSet<>();

        Random r = new Random();
        while (set.size() < antene) {

            set.add(r.nextInt(size));
        }
        for (int s : set) {
            //System.out.println(s / n + " " + s % m);
           // antennas.add(4,s/n,s%m);
        }
        
        


        antennas.add(new Antenna(5, 0, 2));
        antennas.add(new Antenna(3, 3, 6));
        antennas.add(new Antenna(6, 6, 2));

        buildings.add(new Building(6, 9));
        buildings.add(new Building(3, 8));
        buildings.add(new Building(9, 8));
        buildings.add(new Building(10, 8));
        buildings.add(new Building(3, 3));
        buildings.add(new Building(6, 5));

        boolean svePokrivene = true;
        for (Antenna a : antennas) {
            for (Building b : buildings) {
                if (a.distanceFrom(b) < a.r) {
                    b.pokrivena = true;
                    a.brPokrivenih++;
                }
                svePokrivene = svePokrivene && b.pokrivena;
            }
        }

        System.out.println("Sve pokrivene: " + svePokrivene);
//        for (Building b : buildings) {
//            System.out.println(b.pokrivena);
//        }
//        for (Antenna a : antennas) {
//            System.out.println(a.brPokrivenih);
//        }

//        int max = 0;
//        for (Antenna a : antennas) {
//            if (a.brPokrivenih > max) {
//                max = a.brPokrivenih;
//            }
//        }
//        System.out.println(max);
        Collections.sort(antennas, new Comparator<Antenna>() {

            public int compare(Antenna o1, Antenna o2) {

                return o1.brPokrivenih - o2.brPokrivenih;
            }
        });
        System.out.println("----------");
        for (Antenna a : antennas) {
            System.out.println(a.brPokrivenih);
        }

    }

}
