package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


class Grid {
    public int h;
    public int w;
    public int n;
    public int m;
    public int r;

    Grid(){

    }

}

class Building {
    Building(){

    }
    public int x;
    public int y;
    public int l;
    public int c;
}

class Antenna {
    Antenna(){

    }
    public int x;
    public int y;
    public int r;
    public int c;
    public int b;

    public int distanceFrom(Building b){
        return Math.abs(this.x - b.x) + Math.abs(this.y - b.y);
    }

}

public class Main {



    /* 15 10
5 4 100
0 7 3 20
12 2 2 14
2 4 1 32
10 7 4 44
11 8 3 23
2 100
4 10
1 50
2 40
 */


    public Main() {
    }

    public static void main(String[] args) {
        try {
            File myObj = new File("input1.txt");
            Scanner reader = new Scanner(myObj);
            Grid grid = new Grid();
            List<Building> buildingList = new ArrayList<>();
            List<Antenna> antennaList = new ArrayList<>();

            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                Scanner stringSc = new Scanner(data);
                grid.w = stringSc.nextInt();
                grid.h = stringSc.nextInt();
                data = reader.nextLine();
                stringSc = new Scanner(data);
                grid.n = stringSc.nextInt();
                grid.m = stringSc.nextInt();
                grid.r = stringSc.nextInt();
                for(int i = 0; i < grid.n; i++){
                    data = reader.nextLine();
                    stringSc = new Scanner(data);
                    buildingList.add(new Building());
                    buildingList.get(i).x = stringSc.nextInt();
                    buildingList.get(i).y = stringSc.nextInt();
                    buildingList.get(i).l = stringSc.nextInt();
                    buildingList.get(i).c = stringSc.nextInt();
                }
                for(int i = 0; i < grid.m; i++){
                    data = reader.nextLine();
                    stringSc = new Scanner(data);
                    antennaList.add(new Antenna());
                    antennaList.get(i).r = stringSc.nextInt();
                    antennaList.get(i).c = stringSc.nextInt();
                }
            }
            /*for( Building b : buildingList){
                System.out.print("x: " +b.x);
                System.out.print(" y: " +b.y);
                System.out.print(" l: " +b.l);
                System.out.print(" c: " +b.c +"\n");

            }

            for( Antenna a : antennaList){
                System.out.print("r: " +a.r);
                System.out.print(" c: " +a.c +"\n");
            }*/
            List<Integer> a = new ArrayList<>();
            for(int i = 0; i < grid.w; i++){
                a.add(i);
            }
            Collections.shuffle(a);
            List<Integer> b = new ArrayList<>();
            for(int i = 0; i < grid.h; i++){
                b.add(i);
            }
            Collections.shuffle(b);
            List<String> c = new ArrayList();


            Set<Integer> set = new HashSet<>();
            int size = grid.h * grid.w;
            System.out.println(size);
            Random r = new Random();
            while(set.size() < grid.m){
                set.add(r.nextInt(size));
            }
            for(int s : set){
                c.add(s/grid.w + " " + s%grid.h);

            }

            System.out.println(c.size());




            FileWriter myWriter = new FileWriter("output1.txt");
            myWriter.write(grid.m +"\n");
            System.out.println(grid.m);
            for(int i = 0; i < grid.m;i++){
                myWriter.write(i+" " +c.get(i)+"\n");
                System.out.println(i);
            }
            myWriter.flush();

            myWriter.close();



            reader.close();
        } catch (FileNotFoundException var4) {
            System.out.println("An error occurred.");
            var4.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File myObj = new File("input2.txt");
            Scanner reader = new Scanner(myObj);
            Grid grid = new Grid();
            List<Building> buildingList = new ArrayList<>();
            List<Antenna> antennaList = new ArrayList<>();

            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                Scanner stringSc = new Scanner(data);
                grid.w = stringSc.nextInt();
                grid.h = stringSc.nextInt();
                data = reader.nextLine();
                stringSc = new Scanner(data);
                grid.n = stringSc.nextInt();
                grid.m = stringSc.nextInt();
                grid.r = stringSc.nextInt();
                for(int i = 0; i < grid.n; i++){
                    data = reader.nextLine();
                    stringSc = new Scanner(data);
                    buildingList.add(new Building());
                    buildingList.get(i).x = stringSc.nextInt();
                    buildingList.get(i).y = stringSc.nextInt();
                    buildingList.get(i).l = stringSc.nextInt();
                    buildingList.get(i).c = stringSc.nextInt();
                }
                for(int i = 0; i < grid.m; i++){
                    data = reader.nextLine();
                    stringSc = new Scanner(data);
                    antennaList.add(new Antenna());
                    antennaList.get(i).r = stringSc.nextInt();
                    antennaList.get(i).c = stringSc.nextInt();
                }
            }
            /*for( Building b : buildingList){
                System.out.print("x: " +b.x);
                System.out.print(" y: " +b.y);
                System.out.print(" l: " +b.l);
                System.out.print(" c: " +b.c +"\n");

            }

            for( Antenna a : antennaList){
                System.out.print("r: " +a.r);
                System.out.print(" c: " +a.c +"\n");
            }*/
            List<Integer> a = new ArrayList<>();
            for(int i = 0; i < grid.w; i++){
                a.add(i);
            }
            Collections.shuffle(a);
            List<Integer> b = new ArrayList<>();
            for(int i = 0; i < grid.h; i++){
                b.add(i);
            }
            Collections.shuffle(b);
            List<String> c = new ArrayList();


            Set<Integer> set = new HashSet<>();
            int size = grid.h * grid.w;
            System.out.println(size);
            Random r = new Random();
            while(set.size() < grid.m){
                set.add(r.nextInt(size));
            }
            for(int s : set){
                c.add(s/grid.w + " " + s%grid.h);

            }

            System.out.println(c.size());




            FileWriter myWriter = new FileWriter("output2.txt");
            myWriter.write(grid.m +"\n");
            System.out.println(grid.m);
            for(int i = 0; i < grid.m;i++){
                myWriter.write(i+" " +c.get(i)+"\n");
                System.out.println(i);
            }
            myWriter.flush();

            myWriter.close();



            reader.close();
        } catch (FileNotFoundException var4) {
            System.out.println("An error occurred.");
            var4.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File myObj = new File("input3.txt");
            Scanner reader = new Scanner(myObj);
            Grid grid = new Grid();
            List<Building> buildingList = new ArrayList<>();
            List<Antenna> antennaList = new ArrayList<>();

            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                Scanner stringSc = new Scanner(data);
                grid.w = stringSc.nextInt();
                grid.h = stringSc.nextInt();
                data = reader.nextLine();
                stringSc = new Scanner(data);
                grid.n = stringSc.nextInt();
                grid.m = stringSc.nextInt();
                grid.r = stringSc.nextInt();
                for(int i = 0; i < grid.n; i++){
                    data = reader.nextLine();
                    stringSc = new Scanner(data);
                    buildingList.add(new Building());
                    buildingList.get(i).x = stringSc.nextInt();
                    buildingList.get(i).y = stringSc.nextInt();
                    buildingList.get(i).l = stringSc.nextInt();
                    buildingList.get(i).c = stringSc.nextInt();
                }
                for(int i = 0; i < grid.m; i++){
                    data = reader.nextLine();
                    stringSc = new Scanner(data);
                    antennaList.add(new Antenna());
                    antennaList.get(i).r = stringSc.nextInt();
                    antennaList.get(i).c = stringSc.nextInt();
                }
            }
            /*for( Building b : buildingList){
                System.out.print("x: " +b.x);
                System.out.print(" y: " +b.y);
                System.out.print(" l: " +b.l);
                System.out.print(" c: " +b.c +"\n");

            }

            for( Antenna a : antennaList){
                System.out.print("r: " +a.r);
                System.out.print(" c: " +a.c +"\n");
            }*/
            List<Integer> a = new ArrayList<>();
            for(int i = 0; i < grid.w; i++){
                a.add(i);
            }
            Collections.shuffle(a);
            List<Integer> b = new ArrayList<>();
            for(int i = 0; i < grid.h; i++){
                b.add(i);
            }
            Collections.shuffle(b);
            List<String> c = new ArrayList();


            Set<Integer> set = new HashSet<>();
            int size = grid.h * grid.w;
            System.out.println(size);
            Random r = new Random();
            while(set.size() < grid.m){
                set.add(r.nextInt(size));
            }
            for(int s : set){
                c.add(s/grid.w + " " + s%grid.h);

            }

            System.out.println(c.size());




            FileWriter myWriter = new FileWriter("output3.txt");
            myWriter.write(grid.m +"\n");
            System.out.println(grid.m);
            for(int i = 0; i < grid.m;i++){
                myWriter.write(i+" " +c.get(i)+"\n");
                System.out.println(i);
            }
            myWriter.flush();

            myWriter.close();



            reader.close();
        } catch (FileNotFoundException var4) {
            System.out.println("An error occurred.");
            var4.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File myObj = new File("input4.txt");
            Scanner reader = new Scanner(myObj);
            Grid grid = new Grid();
            List<Building> buildingList = new ArrayList<>();
            List<Antenna> antennaList = new ArrayList<>();

            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                Scanner stringSc = new Scanner(data);
                grid.w = stringSc.nextInt();
                grid.h = stringSc.nextInt();
                data = reader.nextLine();
                stringSc = new Scanner(data);
                grid.n = stringSc.nextInt();
                grid.m = stringSc.nextInt();
                grid.r = stringSc.nextInt();
                for(int i = 0; i < grid.n; i++){
                    data = reader.nextLine();
                    stringSc = new Scanner(data);
                    buildingList.add(new Building());
                    buildingList.get(i).x = stringSc.nextInt();
                    buildingList.get(i).y = stringSc.nextInt();
                    buildingList.get(i).l = stringSc.nextInt();
                    buildingList.get(i).c = stringSc.nextInt();
                }
                for(int i = 0; i < grid.m; i++){
                    data = reader.nextLine();
                    stringSc = new Scanner(data);
                    antennaList.add(new Antenna());
                    antennaList.get(i).r = stringSc.nextInt();
                    antennaList.get(i).c = stringSc.nextInt();
                }
            }
            /*for( Building b : buildingList){
                System.out.print("x: " +b.x);
                System.out.print(" y: " +b.y);
                System.out.print(" l: " +b.l);
                System.out.print(" c: " +b.c +"\n");

            }

            for( Antenna a : antennaList){
                System.out.print("r: " +a.r);
                System.out.print(" c: " +a.c +"\n");
            }*/
            List<Integer> a = new ArrayList<>();
            for(int i = 0; i < grid.w; i++){
                a.add(i);
            }
            Collections.shuffle(a);
            List<Integer> b = new ArrayList<>();
            for(int i = 0; i < grid.h; i++){
                b.add(i);
            }
            Collections.shuffle(b);
            List<String> c = new ArrayList();


            Set<Integer> set = new HashSet<>();
            int size = grid.h * grid.w;
            System.out.println(size);
            Random r = new Random();
            while(set.size() < grid.m){
                set.add(r.nextInt(size));
            }
            for(int s : set){
                c.add(s/grid.w + " " + s%grid.h);

            }

            System.out.println(c.size());




            FileWriter myWriter = new FileWriter("output4.txt");
            myWriter.write(grid.m +"\n");
            System.out.println(grid.m);
            for(int i = 0; i < grid.m;i++){
                myWriter.write(i+" " +c.get(i)+"\n");
                System.out.println(i);
            }
            myWriter.flush();

            myWriter.close();



            reader.close();
        } catch (FileNotFoundException var4) {
            System.out.println("An error occurred.");
            var4.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File myObj = new File("input5.txt");
            Scanner reader = new Scanner(myObj);
            Grid grid = new Grid();
            List<Building> buildingList = new ArrayList<>();
            List<Antenna> antennaList = new ArrayList<>();

            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                Scanner stringSc = new Scanner(data);
                grid.w = stringSc.nextInt();
                grid.h = stringSc.nextInt();
                data = reader.nextLine();
                stringSc = new Scanner(data);
                grid.n = stringSc.nextInt();
                grid.m = stringSc.nextInt();
                grid.r = stringSc.nextInt();
                for(int i = 0; i < grid.n; i++){
                    data = reader.nextLine();
                    stringSc = new Scanner(data);
                    buildingList.add(new Building());
                    buildingList.get(i).x = stringSc.nextInt();
                    buildingList.get(i).y = stringSc.nextInt();
                    buildingList.get(i).l = stringSc.nextInt();
                    buildingList.get(i).c = stringSc.nextInt();
                }
                for(int i = 0; i < grid.m; i++){
                    data = reader.nextLine();
                    stringSc = new Scanner(data);
                    antennaList.add(new Antenna());
                    antennaList.get(i).r = stringSc.nextInt();
                    antennaList.get(i).c = stringSc.nextInt();
                }
            }
            /*for( Building b : buildingList){
                System.out.print("x: " +b.x);
                System.out.print(" y: " +b.y);
                System.out.print(" l: " +b.l);
                System.out.print(" c: " +b.c +"\n");

            }

            for( Antenna a : antennaList){
                System.out.print("r: " +a.r);
                System.out.print(" c: " +a.c +"\n");
            }*/
            List<Integer> a = new ArrayList<>();
            for(int i = 0; i < grid.w; i++){
                a.add(i);
            }
            Collections.shuffle(a);
            List<Integer> b = new ArrayList<>();
            for(int i = 0; i < grid.h; i++){
                b.add(i);
            }
            Collections.shuffle(b);
            List<String> c = new ArrayList();


            Set<Integer> set = new HashSet<>();
            int size = grid.h * grid.w;
            System.out.println(size);
            Random r = new Random();
            while(set.size() < grid.m){
                set.add(r.nextInt(size));
            }
            for(int s : set){
                c.add(s/grid.w + " " + s%grid.h);

            }

            System.out.println(c.size());




            FileWriter myWriter = new FileWriter("output5.txt");
            myWriter.write(grid.m +"\n");
            System.out.println(grid.m);
            for(int i = 0; i < grid.m;i++){
                myWriter.write(i+" " +c.get(i)+"\n");
                System.out.println(i);
            }
            myWriter.flush();

            myWriter.close();



            reader.close();
        } catch (FileNotFoundException var4) {
            System.out.println("An error occurred.");
            var4.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
