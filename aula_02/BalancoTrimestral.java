public class BalancoTrimestral {
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		double mediaMensal = gastosTrimestre / 3;
		System.out.println("A soma de gastos do trimestre é : " + gastosTrimestre);
		System.out.println("A média mensal de gastos do trimestre é : " + mediaMensal);
	}
}