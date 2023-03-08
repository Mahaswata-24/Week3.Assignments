package week3.day1;

public class MyCalculator extends Calculator {
public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.sub(15);
	calc.mul(64, 34);
	calc.mul(2, 6, 10.5f);
}
}
