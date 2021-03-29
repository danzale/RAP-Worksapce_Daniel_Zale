
public class MathTest {
	public static void main(String[] args) {
		
		int result = Math.abs(15);
		System.out.println(result);
		
		result = (int)Math.floor(18.5);
		System.out.println(result);
		
		result = Math.max(-10, 9);
		System.out.println(result);
		
		result = Math.min(10, 5);
		System.out.println(result);
		
		double resultDouble = Math.sqrt(4.0);
		System.out.println(resultDouble);
		
		double randomNumber = Math.random();
		System.out.println(randomNumber);
		
		resultDouble = Math.ceil(-18.01);
		System.out.println(resultDouble);
		
		//Math.floor(Math.random* (max-min+1)) + min;
		
		randomNumber = Math.floor(Math.random()*100);

	}
}
