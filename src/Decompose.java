
public class Decompose {
	
  public String decompose(long n) {
	  
	  String sequence = new String();

	  long[] sequenceLong = new long[(int) (n-1)];
	  long[] allN = new long[(int) (n-1)];
	  long[] allSquares = new long[(int) (n-1)];
	  for( int i = 0 ; i < allSquares.length ; i++ ) {
		  allSquares[i] = (n-1-i) * (n-1-i);
		  allN[i] = n-1-i;
		  sequenceLong[i] = 0;
	  }
	  
	  long squareN = n * n;
	  int k = 0;
	  Boolean loop = true;
	  
	  WHILE_LOOP:
	  while( loop ) {
		  
		  while( k < allSquares.length ) {
			  
			  if( squareN - allSquares[k] >= 0 ) {
				  
				  squareN = squareN - allSquares[k];
				  sequenceLong[k] = allN[k]; 
			  }
			  
			  if( squareN == 0 ) {
				  k = allSquares.length;
				  loop = false;
				  break WHILE_LOOP;
			  }
			  
			  k++;
		  }
		  
		  for( int i = sequenceLong.length - 1 ; i >= 0 ; i-- ) {
				
			  if( sequenceLong[i] != 0 ) {
				  squareN = squareN + allSquares[i];
				  sequenceLong[i] = 0;
				  k = i + 1; 
				  break;
			  }
		  }
	  }

	  String temp = new String();
	  for( int i = sequenceLong.length - 1 ; i >= 0 ; i-- )
		  if( sequenceLong[i] != 0)
			  temp = temp + String.valueOf(sequenceLong[i]) + " ";
	  for( int i = 0 ; i < temp.length() - 1 ; i++ )
		  sequence = sequence + temp.charAt(i);
	  
	  return sequence;
  }
}
