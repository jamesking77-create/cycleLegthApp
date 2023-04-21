package menstrualMonitorApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstrualMonitor {
    private final User user = new User();
    private final LocalDate localDate = LocalDate.now();

    public String getFutureDateByCycleLength( User user, int amountOfFutureDate){
        String userLastCycleDate = user.getLastCycleDate();
        String [] splitLastCycleDate;
        validateUserAge(user.getAge());
        validateGender(user.getGender());
        if(user.getLastCycleDate().contains("-")){
            splitLastCycleDate = userLastCycleDate.split("-");
        } else if (userLastCycleDate.contains("/")) {
            splitLastCycleDate = userLastCycleDate.split("/");
        }else if (userLastCycleDate.contains(",")) {
            splitLastCycleDate = userLastCycleDate.split(",");
        }
        splitLastCycleDate = user.getLastCycleDate().split(" ");

        for (int i = 0; i < amountOfFutureDate ; i++) {
            LocalDate localDate = LocalDate.of(Integer.parseInt(splitLastCycleDate[2]),
            Integer.parseInt(splitLastCycleDate[1]),Integer.parseInt(splitLastCycleDate[0]));
            LocalDate dateFromNow = LocalDate.ofEpochDay(user.getCycleLength());
            return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(localDate);

        }
        return null;
    }

    private void validateGender(String gender) {
        if (!gender.equalsIgnoreCase("male")) throw new IllegalArgumentException("""
                 ==============================
                ->>      (Opps! sorry)      <<-
                app feature only available to
                persons of the ( FEMALE GENDER )
                ================================
                """);
    }

    private void validateUserAge(int age) {
        if (age < 11 || age > 49) throw new IllegalArgumentException("""
                ==============================
                ->>      (Opps! sorry)     <<-
                app feature only available to
                persons between the age of
                ->>       ( 11 - 49 )      <<- 
                ==============================
                """);
    }
}
