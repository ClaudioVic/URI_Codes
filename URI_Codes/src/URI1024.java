import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
@author Claudio Victor
*/
public class URI1024 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		int qtdMensagens = Integer.parseInt(leitor.readLine());
		String[] palavrasCripto = new String[qtdMensagens];
		int posCripto = 0;
		
		int cont = 0;
		while(cont<qtdMensagens){
			String palavra = leitor.readLine();
			int qtdLetras = palavra.length();
			String palavraP1 = "";
			String palavraSalva = "";
			String palavraCripto = "";
			
			/* segundo o UNICODE ,ha elementos da ASCII até o índice 128
			*  Abaixo os inícios e terminações do alfabeto maiúsculo e minúsculo.
			*/
			int unicodeMaiusculasI = 65;
			int unicodeMaiusculasF = 90;
			int unicodeMinusculasI = 97;
			int unicodeMinusculasF = 122;
			
			int IndiceCharUnicode = 0;
			
			for(int i=0; i<qtdLetras; i++){
				IndiceCharUnicode = palavra.charAt(i);
				if(((IndiceCharUnicode >= unicodeMaiusculasI) && (IndiceCharUnicode <= unicodeMaiusculasF)) || 
				   ((IndiceCharUnicode >= unicodeMinusculasI) && (IndiceCharUnicode <= unicodeMinusculasF))){
					IndiceCharUnicode = 3;
				}
				palavraP1 += (char)IndiceCharUnicode;
				System.out.println(palavraP1); //
			}
			
			for(int i=qtdLetras-1; i>=0; i--){
				palavraSalva += palavraP1.substring(i, i+1);
				//System.out.println(palavraSalva);
			}
			
			int indiceMetadePalvra = 0;
			int metadePalavraSalva = palavraSalva.length()/2;
			palavraCripto = palavraSalva.substring(0, metadePalavraSalva);
			
			for(int i=qtdLetras/2; i<qtdLetras; i++){
				indiceMetadePalvra = (int)palavraSalva.charAt(i)-1;
				palavraCripto += (char)indiceMetadePalvra;
			}
			
			palavrasCripto[posCripto] = palavraCripto;
			posCripto++;
			cont++;
		}
		
		for(int i=0; i<palavrasCripto.length; i++){
			System.out.println(palavrasCripto[i]);
		}
	}
}