package ro.siit.enums;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // citim luna
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati una dintre valorile...");
        for(Month m: Month.values()){
            System.out.print(m + ", ");
        }
        System.out.println();
        boolean error;
        Month month = null;
        do{
            error = false;
            System.out.println("Dati luna");
            String monthAsString = scanner.nextLine();

            try{
                month = Month.valueOf(monthAsString);
            } catch(IllegalArgumentException ex) {
                System.out.println(monthAsString + " nu e o luna valida");
                error = true;
            }
        }while(error);

        System.out.println(Seasons.getSeasonFromMonth(month));

    }
}
