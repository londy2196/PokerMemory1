import java.io.IOException;

import javax.swing.JPanel;

public class ScoreManager extends MemoryGame {

		public ScoreManager() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

		private long score = 0;
		
		//Asigna Valores tipo int, a los Rank de las cartas.
		//Se crea un nuevo array que contiene el valor de los ranks en forma de integers.
		public static int[] setValues(String[] a) {
			int[] numRank = new int[5];
			
			for(int h=0,k=0 ;h<a.length;h++) {
			if(a[h].equals("2"))
				numRank[k]=2;
			
			else if(a[h].equals("3"))
				numRank[k]=3;
			
			else if(a[h].equals("4"))
				numRank[k]=4;
			
			else if(a[h].equals("5"))
				numRank[k]=5;
			
			else if(a[h].equals("6"))
				numRank[k]=6;
			
			else if(a[h].equals("7"))
				numRank[k]=7;
			
			else if(a[h].equals("8"))
				numRank[k]=8;
			
			else if(a[h].equals("9"))
				numRank[k]=9;
			
			else if(a[h].equals("t"))
				numRank[k]=10;
			
			else if(a[h].equals("j"))
				numRank[k]=11;
			
			else if(a[h].equals("q"))
				numRank[k]=12;
			
			else if(a[h].equals("k"))
				numRank[k]=13;
			
			else if(a[h].equals("a")) {
				numRank[k]=20;
			}
			k=k+1;
			}
			return numRank;
		}
		
	
}
