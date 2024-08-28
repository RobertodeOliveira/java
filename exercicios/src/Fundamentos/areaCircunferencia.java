package Fundamentos;

public class areaCircunferencia {
	public static void main(String[] args) {
		//int é um valor de variável inteira!! 
		//int raio = 3;
		//double é um valor de variável quebrado
		double raio = 3.4;
		/**
		 * Existe uma convensão para que o nome de variáveis constante sejam 
		 * escritas de forma MAIUSCULA. Por isso o PI em capslock
		 */
		final double PI = 3.14159;
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area +"m2.");
	}
}
