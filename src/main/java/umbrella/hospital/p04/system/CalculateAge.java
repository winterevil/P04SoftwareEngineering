package umbrella.hospital.p04.system;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CalculateAge {
    private GetDateInformation gDI = new GetDateInformation();

    // Input as May-04-2024 to age
    public String calculateAge(String dateOfBirth) {
        try {
            // Assuming dateOfBirth format is MMM-dd-yyyy (e.g., May-04-2024)
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
            LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
            LocalDate currentDate = LocalDate.now();
            int age = Period.between(birthDate, currentDate).getYears();
            return String.valueOf(age);
        } catch (DateTimeParseException e) {
            // Handle invalid date format
            return "Invalid date format";
        }
    }
}