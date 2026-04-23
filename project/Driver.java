package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) throws Exception {

        PQMaxHeap myHeap = new PQMaxHeap();

        BufferedReader br = new BufferedReader(new FileReader("valorant-stats.csv"));
        String line = br.readLine();

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            String name = data[0];
            String type = data[1];
            int price = Integer.parseInt(data[2]);
            double fireRate = Double.parseDouble(data[3]);
            double damage = Double.parseDouble(data[6]); // HDMG_0

            Weapon w = new Weapon(name, type, price, fireRate, damage);
            myHeap.enqueue(w);
        }

        br.close();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k (how many top weapons to print): ");
        int k = sc.nextInt();

        System.out.println("\nTop " + k + " weapons by fire rate:\n");

        for (int i = 0; i < k && !myHeap.isEmpty(); i++) {
            System.out.println(myHeap.dequeue());
        }

        sc.close();
    }
}

