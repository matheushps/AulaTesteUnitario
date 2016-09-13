
public class Palindromo {
	public boolean validarPalindromo(String entrada) {
		String formatarEntrada = entrada.toUpperCase().replace(" ", "").replace("-", "");
		for (int i = 0; i < formatarEntrada.length(); i++) {
			int trasPraFrente = formatarEntrada.length() - i - 1;
			if (formatarEntrada.charAt(i) != formatarEntrada.charAt(trasPraFrente)) {
				return false;
			}
		}
		return true;
	}
}
