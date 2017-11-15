
import java.util.Scanner;
/**
@author Claudio Victor
*/
public class URI1103 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int hora1 = 1,minuto1 = 1,hora2 = 1,minuto2 = 1;
		
		while(true){
			
			hora1 = scan.nextInt(); 
			minuto1 = scan.nextInt();
			hora2 = scan.nextInt();
			minuto2 = scan.nextInt();
			
			int totalMinutos = 0;
			
			if(hora1 == 0 && minuto1 == 0 && hora2 == 0 && minuto2 == 0){
				break;
			}
			
			if(hora1 == hora2){
				if(minuto1 > minuto2){
					totalMinutos = 1440 - (minuto1 - minuto2);
				}else{
					totalMinutos = minuto2 - minuto1; 
				}	
			}else{
				hora1 = (hora1* 60) + minuto1;
				hora2 = (hora2* 60) + minuto2;
				if(hora1 > hora2){
					totalMinutos = 1440 - (hora1 - hora2);
				}else{
					totalMinutos = hora2 - hora1;
				}	
			}
			System.out.println(totalMinutos);
			
		}
		scan.close();
	}
}