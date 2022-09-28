package dam.temauno;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

import static java.time.temporal.ChronoUnit.HOURS;

public class DateType {
    public static void main(String[] args) {
        /**
         * Example with class LocalDate
         */
        // Compare if localDate1 is after localDate2
        LocalDate localDate1 = LocalDate.of(2006, 7, 12);
        LocalDate localDate2 = LocalDate.of(1980, 3, 7);

        if (localDate1.isAfter(localDate2)) {
            System.out.println("El año " + localDate1.getYear() + " va después del año " + localDate2.getYear() + ".");
        } else {
            System.out.println("El año " + localDate1.getYear() + " va antes del año " + localDate2.getYear() + ".");
        }


        /**
         * Example with class Date
         */
        // Show info about Date
        Date dateInfo = new Date();

        System.out.println("La información del día de hoy es " + dateInfo);


        /**
         * Example with class LocalDateTime
         */
        // Extract hour and minutes of now
        LocalDateTime timeDate = LocalDateTime.now();
        byte hourNow = (byte) timeDate.getHour();
        byte minutesNow = (byte) timeDate.getMinute();

        System.out.println("Actualmente, son las " + hourNow + ":" + minutesNow + ".");


        /**
         * Example with class Period
         */
        // Period between localDate2 and localDate1 variables
        Period timeBetweenLocalDates = Period.between(localDate2, localDate1);
        byte yearsBetweenLocalDates = (byte) timeBetweenLocalDates.getYears();
        byte monthsBetweenLocalDates = (byte) timeBetweenLocalDates.getMonths();
        byte daysBetweenLocalDates = (byte) timeBetweenLocalDates.getDays();

        System.out.println("El periodo entre la variable localDate1 y localDate2 es de "
                + yearsBetweenLocalDates + " años, "
                + monthsBetweenLocalDates + " meses, y "
                + daysBetweenLocalDates + " días.");


        /**
         * Example with class Duration
         */
        // Duration of 2 hours in minutes and seconds
        Duration twoHours = Duration.of(2, HOURS);
        short hoursToMinutes = (short) twoHours.toMinutes();
        int hoursToSeconds = (int) twoHours.toSeconds();

        System.out.println("En 2 horas hay " + hoursToMinutes + " minutos y " + hoursToSeconds + " segundos.");


        /**
         * Example with String datatype
         */
        // Transform String
        String email = "MyEmail@gmail.com";
        String emailInUpperCase = email.toUpperCase();
        String emailInLowerCase = email.toLowerCase();
        String onlyEmailName = email.substring(0, 7);
        String[] onlyDomainName = email.split("@");
        byte lengthOfEmail = (byte) email.length();

        System.out.println("\nEl email es: " + email + ".\n" +
                "El email transformado a mayúsculas sería: " + emailInUpperCase + ".\n" +
                "El email transformado a minúsculas sería: " + emailInLowerCase + ".\n" +
                "El nombre del email es: " + onlyEmailName + ".\n" +
                "El dominio del email es: " + onlyDomainName[1] + ".\n" +
                "La longitud de carácteres del email es: " + lengthOfEmail + ".");
    }
}
