package exemploDataHora01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2023-01-22");
		LocalDateTime d05 = LocalDateTime.parse("1190-07-02T21:26:05");
		Instant d06 = Instant.parse("2023-04-29T09:50:12Z");
		Instant d07 = Instant.parse("2023-04-29T09:50:12-02:00");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d08 = LocalDate.parse("22/07/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("22/07/2023 10:09", fmt2);
		LocalDate d10 = LocalDate.of(2023, 04, 23);
		LocalDateTime d11 = LocalDateTime.of(1990, 07, 02, 23, 45);
		
		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09);
		System.out.println("d10: " + d10);
		System.out.println("d11: " + d11);
	}

}
