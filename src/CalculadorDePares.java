public class CalculadorDePares {

	public boolean verificaSeQuantidadeDeDigitosValidos(int primeiroNumero,
			int segundoNumero) {

		String strPrimeiro = "" + primeiroNumero;
		String strSegundo = "" + segundoNumero;

		if (strPrimeiro.length() > (strSegundo.length())) {
			return true;
		}

		return false;
	}

	public boolean verificaSePrimeiroNumeroMenosUmDigitoIgualSegundo(
			int primeiroNumero, int segundoNumero) {

		String stringPrimeiroNumero = String.valueOf(primeiroNumero);
		String stringSegundoNumero = String.valueOf(segundoNumero);
		String stringNumeroComUmDigitoRemovido = "";

		char[] charsPrimeiroNumero = stringPrimeiroNumero.toCharArray();

		for (int i = 0; i < charsPrimeiroNumero.length; i++) {
			for (int j = 0; j < charsPrimeiroNumero.length; j++) {
				if (j != i)
				{
					stringNumeroComUmDigitoRemovido = stringNumeroComUmDigitoRemovido
							+ charsPrimeiroNumero[j];
				}
			}
			System.out.println(stringNumeroComUmDigitoRemovido);
			if (stringNumeroComUmDigitoRemovido.equals(stringSegundoNumero))
				return true;
			else
				stringNumeroComUmDigitoRemovido = "";
		}
		return false;

	}

}
