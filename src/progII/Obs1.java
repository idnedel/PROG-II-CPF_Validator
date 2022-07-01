package progII;

public class Obs1 implements Validador {

	public static final String RESET = "\033[0m";		//No VSCode as cores funcionam normalmente, quando vou testar no Eclipe ou NetBeans,
	public static final String GREEN = "\033[0;32m";	//só me retorna "[0;32mCPF Valido!" com este caracteres na frente e sem a cor definida.
	public static final String RED = "\033[0;31m";

	public void valido() {
		System.out.printf("%s%s%s", GREEN, "CPF Valido!\n", RESET);
	}

	public void invalido() {
		System.out.printf("%s%s%s", RED, "CPF Invalido!\n", RESET);
	}
}
