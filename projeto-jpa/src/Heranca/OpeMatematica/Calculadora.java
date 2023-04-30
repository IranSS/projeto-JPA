package Heranca.OpeMatematica;
public class Calculadora implements OperacaoMatematica{
	public static void main(String[] args) {
		
	}

	@Override
	public void soma(double n1, double n2) {
		System.out.println("Soma: " + n1 + n2);
		
	}

	@Override
	public void sub(double n1, double n2) {
		System.out.println("Subtrarir: " + (n1 - n2));
		
	}

	@Override
	public void multi(double n1, double n2) {
		System.out.println("Multiplicar: " + (n1 * n2));
		
	}

	@Override
	public void dividirr(double n1, double n2) {
		System.out.println("Dividir: " + (n1 / n2));
		
	}
}
