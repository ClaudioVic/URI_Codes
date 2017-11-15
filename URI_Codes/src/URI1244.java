import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
@author Claudio Victor
*/
public class URI1244 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(scan.readLine());
		String[][] P = new String[N][];
		
		for(int i=0; i<N; i++){
			String l = scan.readLine();
			String[] L = l.split(" ");
			
			for(int j=1; j<L.length; j++){
				String item = L[j];
				int k = j-1;
				while((k >= 0) && (L[k].length() < item.length())){
					L[k+1] = L[k];
					k-=1;
				}
				L[k+1] = item;
			}
			P[i] = L;
		}
		for(String[] p : P){
			for(int i=0; i<p.length; i++){
				if(i+1 != p.length){
					System.out.print(p[i] + " ");
				}else{
					System.out.print(p[i]);
				}	
			}
			System.out.println();
		}
		scan.close();	
	}
}