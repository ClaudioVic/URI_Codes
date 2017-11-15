import java.util.Scanner;
/**
@author Claudio Victor
*/
public class URI1091 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int qtdConsultas = scan.nextInt();
		while(qtdConsultas != 0){
			
			int ptDivisorM = scan.nextInt();
			int ptDivisorN = scan.nextInt();
			
			for(int i=0; i< qtdConsultas; i++){
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				if((x == ptDivisorM)||(y == ptDivisorN)){
					System.out.println("divisa");
				}else if((x > ptDivisorM)&&(y > ptDivisorN)){
					System.out.println("NE");
				}else if((x > ptDivisorM)&&(y < ptDivisorN)){
					System.out.println("SE");
				}else if((x < ptDivisorM)&&(y < ptDivisorN)){
					System.out.println("SO");
				}else if((x < ptDivisorM)&&(y > ptDivisorN)){
					System.out.println("NO");
				}
			}
			qtdConsultas = scan.nextInt();
		}
		
		scan.close();
	}
}