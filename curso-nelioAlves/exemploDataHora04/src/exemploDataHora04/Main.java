package exemploDataHora04;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2023-01-22");
		LocalDateTime d05 = LocalDateTime.parse("1990-07-02T21:26:05");
		Instant d06 = Instant.parse("2023-04-29T09:50:12Z");
		
		LocalDate subtraindoDias = d04.minusDays(3);
		LocalDate adicionandoMes = d04.plusMonths(13);
		LocalDateTime subtraindoMinutos = d05.minusMinutes(5);
		Instant adicionandoDias = d06.minus(8, ChronoUnit.DAYS);
		Instant menosDias = d06.plus(5, ChronoUnit.DAYS);
		Duration t1 = Duration.between(adicionandoDias, menosDias);
		Duration t2 = Duration.between(subtraindoDias.atStartOfDay(), d04.atStartOfDay());
		
		System.out.println("Subtraindo Dias = " + subtraindoDias);
		System.out.println("Adicionando Mês = " + adicionandoMes);
		System.out.println("Subtraindo Minutos = " + subtraindoMinutos);
		
		System.out.println("Adicionando Dias = " + adicionandoDias);
		System.out.println("Subtraindo Dias = " + menosDias);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t2 minutos = " + t1.toMinutes());
	}

}
