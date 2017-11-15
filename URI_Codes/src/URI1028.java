
import java.util.Scanner;
/**
@author Claudio Victor
*/
public class URI1028 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int casosTeste = scan.nextInt();
		int qtdFigurinhas1 = 0;
		int qtdFigurinhas2 = 0;
		int qtdCartas = 0;
		
		for(int i=0; i<casosTeste; i++){
			qtdFigurinhas1 = scan.nextInt();
			qtdFigurinhas2 = scan.nextInt();
			
			int dividendo = 0;
			int divisor = 0;
			
			if(qtdFigurinhas1 > qtdFigurinhas2){
				dividendo = qtdFigurinhas1;
				divisor = qtdFigurinhas2;
			}else{
				dividendo = qtdFigurinhas2;
				divisor = qtdFigurinhas1;
			}
			
			while(dividendo % divisor != 0 ){
				qtdCartas = divisor;
				divisor = dividendo;
				dividendo = qtdCartas % dividendo;
			}
			qtdCartas = divisor;
			
			System.out.println(qtdCartas);
		}
		scan.close();
	}
}