package week1.day2;

public class Calculator 

{
		
        public int add(int a, int b)		
		{
			int sum = a+b;
			return sum;
		}
		
		public double sub(double a, double b)
		{
			double difference = a-b;
			return difference;
		}
		
		public double mul(double a, double b)
		{
			double multiply = a*b;
			return multiply;
		}
		
		public int div(int a, int b)
		{
			int divide = a/b;
			return divide;
		}
		
		public static void main(String[] args) 
		
		{
			Calculator calc = new Calculator();
			System.out.println("Addition of two numbers: " +calc.add(1, 2));
			System.out.println("Subtraction of two numbers: " +calc.sub(6, 4));
			System.out.println("Multiplication of two numbers: " +calc.mul(7, 5));
			System.out.println("Division of two numbers: " +calc.div(9, 3));
			
		}

}