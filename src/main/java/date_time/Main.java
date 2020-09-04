package date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {


    public static Date convert(LocalDate date) {
        // todo finish this
        return Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDateTime convert(Date date) {
        // todo finish this
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

        // 1981/02/30&18:20
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/d&HH:mm");
    public static int daysBetween(String firstDate, String lastDate) {
        //JSR 310
        //todo finish this
        return (int) ChronoUnit.DAYS.between(LocalDateTime.parse(firstDate, format), LocalDateTime.parse(lastDate, format));
    }



    public static void main(String[] args) {



        LocalTime now1 = LocalTime.now();
//        LocalDateTime.of(1932,12,12,12,12,12)
        LocalDate now = LocalDate.now();
        LocalDate yest = now.minusDays(1);
        LocalDate date = now.withYear(2010);
        System.out.println(date);
        System.out.println(Main.convert(Main.convert(date)));
        String displayName = date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        System.out.println("displayName = " + displayName);

//        Duration
        long between = ChronoUnit.DAYS.between(date, now);
        System.out.println("between = " + between);
        System.out.println("between = " + Main.daysBetween("1981/02/28&18:20", "1982/03/30&18:20"));

//
//        String str = "java";
//        str = str.toUpperCase();
//
//        Date date = new Date();
//        System.out.println("date = " + date.getYear());
    }
}
