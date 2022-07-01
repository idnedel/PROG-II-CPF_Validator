
package progII;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class Obs2 implements Validador{

	public static void log(String localArq, String logCPFs) {
		
		try(
				
				FileWriter criadorLog = new FileWriter(localArq, true);
				BufferedWriter buffer = new BufferedWriter(criadorLog);
				PrintWriter escritorLog = new PrintWriter(buffer);
				
				){
			
			escritorLog.append(logCPFs);
			
		}catch(IOException e) {
		 e.printStackTrace();	
		} 
	}
}
