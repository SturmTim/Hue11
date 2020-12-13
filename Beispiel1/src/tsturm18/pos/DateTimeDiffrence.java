/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsturm18.pos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author timst
 */
public class DateTimeDiffrence {

    public DateTimeDiffrence() {
    }

    public long[] getDateDiffrence(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        long[] betweenDates = new long[7];
        betweenDates[0] = ChronoUnit.YEARS.between(dateTime1, dateTime2);
        betweenDates[1] = ChronoUnit.MONTHS.between(dateTime1, dateTime2);
        betweenDates[2] = ChronoUnit.WEEKS.between(dateTime1, dateTime2);
        betweenDates[3] = ChronoUnit.DAYS.between(dateTime1, dateTime2);
        betweenDates[4] = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        betweenDates[5] = ChronoUnit.MINUTES.between(dateTime1, dateTime2);
        betweenDates[6] = ChronoUnit.SECONDS.between(dateTime1, dateTime2);
        return betweenDates;
    }

    public void getAllDates(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        LocalDate date1 = dateTime1.toLocalDate();
        LocalDate date2 = dateTime2.toLocalDate();
        for (LocalDate nextDate = date1.plusDays(1); !nextDate.equals(date2); nextDate = nextDate.plusDays(1)) {
            System.out.println(nextDate);
        }
    }
}
