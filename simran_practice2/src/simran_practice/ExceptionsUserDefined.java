package simran_practice;
import java.util.*;

class DailyLimitCrossedException extends Throwable{
	
	//constructor
	DailyLimitCrossedException(String str){
		super(str);
	}
}

public class ExceptionsUserDefined {
	
	public static void main(String[] args) throws DailyLimitCrossedException{
		
		int amount=15000;
		if(amount>10000) {
			
			throw new DailyLimitCrossedException("Daily Limit exceeded.");
		}
		else {
			System.out.println("withdrawl successful");
		}

	}

}
