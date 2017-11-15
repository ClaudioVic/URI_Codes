
import java.util.Scanner;
/**
@author Claudio Victor
*/
public class URI1329 {
	
	public static void main(String[] ars){
		
		Scanner scan = new Scanner(System.in);
		
		int vzsARodar = 1;
		
		while(vzsARodar != 0){
		
			vzsARodar = scan.nextInt();
			
			int cont0 = 0;
			int cont1 = 0;
			for(int i=0; i<vzsARodar; i++){
				int value = scan.nextInt();
				if(value == 0){
					cont0 += 1;
				} else{
					cont1+=1;
				}
			}
			if(vzsARodar > 0){
				System.out.println("Mary won "+ cont0 +" times and John won "+ cont1 +" times");
			}
		}
		
		scan.close();
	}
}