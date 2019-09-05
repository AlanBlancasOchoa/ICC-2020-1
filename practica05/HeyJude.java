public class HeyJude {
	public static void main(String[] args) {
		String hey = "hey Jude ";
		String dont1 = "dont make it bad ";
		String dont2 = "dont be afraid ";
		String dont3 = "dont let me down ";
 	    String take = "take a sad song and make it better";
 	    String where = "you were made to go out and get her";
 	    String found = "you have found her, now go and get her";
 	    String remember1 = "remember to let her into you heart";
 	    String remember2 = "remember to let her under your skin";
 	    String then1 = "then you can start to make it better ";
 	    String then2 = "then you begin to make it better ";
 	    String betteroh = "better better better better better, oh";
 	    String na = "na ";
 	    int p = 0;

 	    while (p < 7 ) {
 	        if (p == 0 || p == 1 || p == 3 || p == 5) {
 	    		System.out.print(hey);
 	    }
 	    if (p == 0 || p == 5) {
 	    	System.out.println(dont1);
 	    }
 	    if (p == 0 || p == 5) {
 	    	System.out.println(take);
 	    }
 	    if (p == 3) {
 	    	System.out.println(dont3);
 	    }
 	    if (p == 3) {
 	    	System.out.println(found);
 	    }

 	    if (p == 1) {
 	    	System.out.println(dont2);
 	    } 
 	    if (p == 1) {
 	    	System.out.println(where);
 	    }
	    if (p == 1|| p == 5) {
 	    	System.out.println(remember2);
 	    }
 	    if (p == 0 || p == 3) {
 	    	System.out.println(remember1);
 	    }
 	    if (p == 1 || p == 5) {
 	    	System.out.println(then2);
 	    }
 	    if (p == 5) {
 	    	System.out.println(betteroh);
 	    }

 	    if (p == 0 || p == 3) {
 	    	System.out.println(then1);
 	    }
 	     

 	    if (p == 2 || p == 4 || p == 6) {
            int a = 0;
            while (a < 10) {
            System.out.print(na);
            a++;
      }
      if (p == 6) {
        System.out.print(hey);
      }
        System.out.println();
 	  }
 	    System.out.println();
 	    p++;
 	   }
      }
	}
  
