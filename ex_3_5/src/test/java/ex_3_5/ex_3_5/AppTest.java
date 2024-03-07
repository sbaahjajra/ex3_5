package ex_3_5.ex_3_5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
	@Test
	 public void Test_1_(){//1,2,4,8 
		boolean exp_result=true;
	    double cartValueGold = 3000.00;
	    int creditRatingGold = 400;
        Status status = Status.GOLD;
        boolean result = App.checkOut(cartValueGold, creditRatingGold, status);
        assertEquals(exp_result,result);
	}
	@Test
	 public void Test_2_(){ //1,2,5,9,10 
		boolean exp_result=true;
	    double cartValueGold = 4000.00;
	    int creditRatingGold = 700;
       Status status = Status.GOLD;
       boolean result = App.checkOut(cartValueGold, creditRatingGold, status);
       assertEquals(exp_result,result);
	}
	
	
	
	@Test
	 public void Test_3_() { //1,2,5,11 
		boolean exp_result=false;
	    double cartValueGold = 4000.00;
	    int creditRatingGold = 400;
      Status status = Status.GOLD;
      boolean result = App.checkOut(cartValueGold, creditRatingGold, status);
      assertEquals(exp_result,result);
	}
	
	
	
	
	@Test
	 public void Test_4_(){ //1,3,6,12,14 
		boolean exp_result=true;
	    double cartValueSilver = 2000.00;
	    int creditRatingSilver = 700;
      Status status = Status.SILVER;
      boolean result = App.checkOut(cartValueSilver, creditRatingSilver, status);
      assertEquals(exp_result,result);
	}
	
	
	
	@Test
	 public void Test_6_() {  //1,3,6,13,17
		boolean exp_result=false;
	    double cartValueSilver = 3000.00;
	    int creditRatingSilver = 700;
        Status status = Status.SILVER;
        boolean result = App.checkOut(cartValueSilver, creditRatingSilver, status);
        assertEquals(exp_result,result);
	}

}
