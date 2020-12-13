/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsturm18.pos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author timst
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        String format = "dd.MM.yyyy HH:mm:ss";
        DateTimeFormatter formater = DateTimeFormatter.ofPattern(format);
        System.out.println("1st date:");
        System.out.println(format + "> ");
        LocalDateTime date1Time1 = LocalDateTime.parse(scanner.nextLine(), formater);
        System.out.println("2nd date:");
        System.out.println(format + "> ");
        LocalDateTime date1Time2 = LocalDateTime.parse(scanner.nextLine(), formater);

        if (date1Time1.isAfter(date1Time2)) {
            output(date1Time2, date1Time1);
        } else {
            output(date1Time1, date1Time2);
        }

    }

    public static void output(LocalDateTime date1Time1, LocalDateTime date1Time2) {
        if (ChronoUnit.YEARS.between(date1Time1, date1Time2) > 0) {
            DateTimeDiffrence dtf = new DateTimeDiffrence();
            long[] dateDiffrences = dtf.getDateDiffrence(date1Time1, date1Time2);
            System.out.println("years: " + dateDiffrences[0]
                    + "\nmonths: " + dateDiffrences[1]
                    + "\nweeks: " + dateDiffrences[2]
                    + "\ndays: " + dateDiffrences[3]
                    + "\nhours: " + dateDiffrences[4]
                    + "\nminutes: " + dateDiffrences[5]
                    + "\nseconds: " + dateDiffrences[6]);
            System.out.println("");
            dtf.getAllDates(date1Time1, date1Time2);
        } else {
            System.out.println("There has to be at least a one year difference");
        }

    }

}
