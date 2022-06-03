package daten_lesen;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class csvleser {
    public static void main(String[] args) {
        //log.csv hat Einlogg Uhrzeit in der ersten spalte, Einlogg Datum in der Zweiten Spalte,
        // Auslogg Uhrzeit in der dritten Spalte und Auslogg Datum in der vierten Spalte und der Name in der fünften Spalte
        String filename = "H:\\PR1\\3BKI11\\Serialisierung\\src\\daten_lesen\\log.csv";
        List<String> log = new ArrayList<>();
        List<User> user = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String zeile = br.readLine();
            while (zeile != null) {
                zeile = br.readLine();
                log.add(zeile);
            }
            for (int i = 0; i < log.size(); i++) {
                String s = log.get(i);
                String[] parts = s.split(",");
                User u = new User(parts[4], parts[0], parts[2], parts[1], parts[3]);
                user.add(u);
                u.ausgeben();
                System.out.println();
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Fehler beim Lesen");
        }
    }
}
