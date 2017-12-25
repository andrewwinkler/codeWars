import java.util.Random;

public class BingoCard {
	
	public static String[] getCard() {
    
		String[] bingoB = new String[] {"B01","B02","B03","B04","B05","B06","B07","B08","B09","B10","B11","B12","B13","B14","B15"};
		String[] bingoI = new String[] {"I16","I17","I18","I19","I20","I21","I22","I23","I24","I25","I26","I27","I28","I29","I30"};
		String[] bingoN = new String[] {"N31","N32","N33","N34","N35","N36","N37","N38","N39","N40","N41","N42","N42","N44","N45"};
		String[] bingoG = new String[] {"G46","G47","G48","G49","G50","G51","G52","G53","G54","G55","G56","G57","G58","G59","G60"};
		String[] bingoO = new String[] {"O61","O62","O63","O64","O65","O66","O67","O68","O69","O70","O71","O72","O73","O74","O75"};
		
		String[] bingoCard = new String[24];
		Random rand = new Random();
		Integer r[][] = new Integer[][] {{15,15,15,15,15},
										{15,15,15,15,15},
										{15,15,15,15,15},
										{15,15,15,15,15},
										{15,15,15,15,15}};
		
		for( int i = 0 ; i < r.length ; i++ ) {
									
			Boolean duplicates = true;
			while(duplicates) {
				
				int count = 0;
						
				for( int j = 0 ; j < r[i].length ; j++ )
					r[i][j] = rand.nextInt(15);
				
				for( int j = 0 ; j < r[i].length ; j++ )
					for( int k = j+1 ; k < r[i].length ; k++ )
						if( j != k && r[i][j] == r[i][k] )
							count++;
				
				if(count == 0)
					duplicates = false;
			}
		}
		
		for( int i = 0, j = 0 ; i < 5 ; i++, j++)
			bingoCard[i] = bingoB[r[0][j]];

		for( int i = 5, j = 0 ; i < 10 ; i++, j++ )
			bingoCard[i] = bingoI[r[1][j]];
		
		for( int i = 10, j = 0; i < 14 ; i++, j++ )
			bingoCard[i] = bingoN[r[2][j]];
		
		for( int i = 14, j = 0 ; i < 19 ; i++, j++ )
			bingoCard[i] = bingoG[r[3][j]];
		
		for( int i = 19, j = 0 ; i < 24 ; i++, j++ )
			bingoCard[i] = bingoO[r[4][j]];
		
		return bingoCard;
	}
}
