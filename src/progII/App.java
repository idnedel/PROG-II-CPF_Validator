package progII;
import java.util.Scanner;

	public class App {
		
		public static void main(String[] args) {

	        try {
	            @SuppressWarnings("resource")
				Scanner ler = new Scanner(System.in);

	            Validador v;
	            v = new Obs1();

	            String CPF;
	            
	            while (true)
	            {
	            	System.out.println("Digite um CPF: ");
		            CPF = ler.nextLine();
		            if (CPF.equals("sair")) {
		            	System.exit(0);
		            }
		
		            boolean isValid = validaCPF(CPF);
		
		            if (isValid) {
		                v.valido();
		                Obs2.log("cpfs.txt", "CPF: " + CPF + " -> " + "V\r\n");
		            }
		            else {
		                v.invalido();
		                Obs2.log("cpfs.txt", "CPF: " + CPF + " -> " + "I\r\n");
		            }
		            System.out.println();
		        }
	        }
	        catch (Exception ex) {
	            System.out.println("ERRO!");
	        }
	    }

	    public static boolean validaCPF(String CPF) {
	        
	    	int[] multiplicador1 = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2};
	        int[] multiplicador2 = new int[] {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

	        CPF.trim();
	        CPF = CPF.replace(".", "").replace("-", "");
	        if ((CPF.length() != 11)) {
	            return false;
	        }
	        String[] auxCPF = CPF.substring(0, 9).split("");
	        int soma = 0;
	        for (int i = 0; (i < 9); i++) {
	            int aux = Integer.parseInt(auxCPF[i]);
	            soma = (soma + (aux * multiplicador1[i]));
	        }

	        int resto = (soma % 11);
	        if ((resto < 2)) {
	            resto = 0;
	        }
	        else {
	            resto = (11 - resto);
	        }
	        String[] aux = new String[11];
	        for (int i = 0; i < 10; i++) {
	        	
	        	if (i == 9) aux[9] = Integer.toString(resto);
	        	else aux[i] = auxCPF[i];
	        }

	        String digito = Integer.toString(resto);
	        
	        soma = 0;
	        for (int i = 0; i < 10; i++) {
	            soma = (soma + (Integer.parseInt(aux[i].toString()) * multiplicador2[i]));
	        }

	        resto = (soma % 11);
	        if ((resto < 2)) {
	            resto = 0;
	        }
	        else {
	            resto = (11 - resto);
	        }

	        digito = (digito + Integer.toString(resto));
	        return CPF.endsWith(digito);
	    }
	}
    
