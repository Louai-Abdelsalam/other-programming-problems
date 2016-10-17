import java.util.Scanner;
import java.io.PrintStream;

public class Problem_A_Sept25
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in );
      int size, seed;
      int s, row;
      boolean state = true;
      
      size = in.nextInt();
      seed = in.nextInt();
	  
      while (state)
      {
	      s = 0;
	      row = 1;
	      
	      System.out.printf("size %d, seed %d\n", size, seed);
	      
	      while (s < size)
	      {
	    	  for (int i = 0; i < row; i++)
	    	  {
	    		  if (row - i > 1)
	    		  {
	    			  System.out.print(seed + " ");
	    		  }
	    		  else
	    		  {
	    			  System.out.print(seed);
	    		  }
	    		  
	    		  if (seed == 9)
	    		  {
	    			  seed = 1;
	    		  }
	    		  else
	    		  {
	    			  seed++;
	    		  }
	    	  }
	    	  
	    	  row++;
	    	  s++;
	    	  
	    	  if (size - s >= 1)
	    	  {
	    		  System.out.println("");
	    	  }
	      }
	      
	      size = in.nextInt();
	      seed = in.nextInt();
	      
	      if (size == 0 && seed == 0)
	      {
	    	  state = false;
	      }
	      else
	      {
	    	  System.out.println("");
	    	  System.out.println("");
	      }
	      
      }
	
	}

}
