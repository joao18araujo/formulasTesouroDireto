import java.math.BigDecimal;

public class MathOperations {
	public static double truncate(double number, int decimal_digits){
		
		BigDecimal bd = BigDecimal.valueOf(number);
		bd = bd.setScale(decimal_digits, BigDecimal.ROUND_DOWN);
		return bd.doubleValue();
	}
}
