import java.util.Scanner;
/**
@author Claudio Victor
*/
public class URI1245 {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			int qtdBotas = scan.nextInt();
			int pares = 0;
			
			int[] numeros = new int[qtdBotas];
			String[] letras = new String[qtdBotas];
			
			for(int i=0; i<qtdBotas; i++){
				numeros[i] = scan.nextInt();
				letras[i] = scan.nextLine();
			}for(int i=0; i<qtdBotas; i++){
				int cont = i;
				while((cont<qtdBotas) && (!letras[i].equals("X"))){
					if((numeros[i] == numeros[cont]) && (!letras[i].equals(letras[cont])) && (!letras[cont].equals("X"))){
						pares++;
						letras[cont] = "X";
						letras[i] = "X";
						break;
					}
					cont++;
				}
			}
			System.out.println(pares);
		}
		scan.close();
	}
}