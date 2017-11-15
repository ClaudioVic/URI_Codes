
import java.util.Scanner;
/**
@author Claudio Victor
*/
public class URI1238 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int qtdCasos = scan.nextInt();
		String palavra1 = "";
		String palavra2 = "";
		
		String palavraFinal;
		
		for(int i=0; i<qtdCasos; i++){
			palavraFinal = "";
			palavra1 = scan.next();
			palavra2 = scan.next();
			int tamanhoPalavra1 = palavra1.length();
			int tamanhoPalavra2 = palavra2.length();
			int tamanhoTotalPalavras = (palavra1+palavra2).length();
			
			int j=0;
			
			String maiorPalavra = palavra1;
			String menorPalavra = palavra2;
			if(tamanhoPalavra1 > tamanhoPalavra2){
				maiorPalavra = palavra2;
				menorPalavra = palavra1;
			}
			
			while(j<(tamanhoTotalPalavras-1)){
				if(j < maiorPalavra.length()){
					palavraFinal += palavra1.charAt(j);
					palavraFinal += palavra2.charAt(j);
					j++;
					if(palavraFinal.length() == tamanhoTotalPalavras){
						break;
					}
				} else {
					j=palavraFinal.length();
					palavraFinal += (maiorPalavra+menorPalavra).charAt(j);			
				}
			}
			System.out.println(palavraFinal);
		}
		
		scan.close();
	}
}