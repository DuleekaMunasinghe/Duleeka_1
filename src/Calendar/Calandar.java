package Calendar;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.zone.*;
import java.time.format.*;

public class Calandar {


    public static void main(String[] args) {

        //year, month, day, week, time
        LocalDate localdate1 =LocalDate.now();
        System.out.println("Todays date :"+ localdate1);
        LocalDate localDate2 =LocalDate.now((ZoneId.of("Pacific/Auckland")));
        System.out.println("Todays date :"+ localDate2);

        LocalTime localtime1= LocalTime.now();
        System.out.println("Todays time :"+ localtime1);
        LocalTime localtime2= LocalTime.now((ZoneId.of("Asia/Kolkata")));
        System.out.println("Todays time :"+ localtime2);

        LocalDateTime localdatetime1 =LocalDateTime.now();
        System.out.println("Todays date :"+ localdatetime1);
        LocalDateTime localdatetime2 =LocalDateTime.now((ZoneId.of("Asia/Karachi")));
        System.out.println("Todays date :"+ localdatetime2);
        LocalDateTime localDate7 =LocalDateTime.now((ZoneId.of("Europe/London")));
        System.out.println("Todays date in London :"+ localDate7);
        //${__javaScript(v = new Date(); (v.getYear()+1900)+(v.getMonth()+1<10?"0":"")+(v.getMonth()+1)+(v.getDate()<10?"0":"")+(v.getDate()))}

        LocalDate anotherSummerDay = LocalDate.now();
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(anotherSummerDay));
        
        
        
       /* DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(LocalDate.from(europeanDateFormatter.parse("15.08.2014")).isLeapYear());
       // System.out.println(LocalDate.from(europeanDateFormatter.ofPattern("yyyymmdd").LocalDate.now());

        System.out.println(LocalDateTime.now());
        // Formater Asim needs to use
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        System.out.println(LocalDate.now().format(formatter));
        String  Date= LocalDate.now().format(formatter);

        int count = 0;
        while (count <=100000)
        {
            System.out.println("" + count++);
            System.out.println(Date+count);
        }*/
    }
    
}