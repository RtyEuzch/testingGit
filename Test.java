import java.time.*;
public class Test {
	public static void main(String args[]) {
		LocalDateTime dt = LocalDateTime.of(2020, 12, 31, 8, 30);
		for (int i = 0; i < 5; i++) {
			System.out.println(dt);
			dt = dt.plusMinutes(30);			
		}

		System.out.println("Reversed my update");
	}
}