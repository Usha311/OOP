package skill1;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LocalDateTime now =LocalDateTime.now();
         DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm::ss");
         System.out.println("Current Date-Time: " + now.format(format));
          LocalDate startDate = LocalDate.of(2025, 1, 1);
         Period diff = Period.between(startDate, LocalDate.now());
         System.out.println("Difference: " + diff.getYears() + " years, " + diff.getMonths() + " months");
	}

}
