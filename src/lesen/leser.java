package lesen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class leser {
    public static void main(String[] args) {
        String filename = "H:\\PR1\\3BKI11\\Serialisierung\\src\\lesen\\namen.txt";
        List<String> namen = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String zeile = br.readLine();
            while (zeile != null) {
                System.out.println("Hallo "+zeile);
                namen.add(zeile);
                zeile = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Fehler beim Lesen");
        }
        //print namen
        System.out.println("");
        for (String name : namen) {
            System.out.println(name);
        }
    }
}

