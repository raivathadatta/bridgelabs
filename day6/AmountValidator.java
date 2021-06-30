package day6;

public class AmountValidator {
	
 private int amount;
	
	public int getAmount() {
		return amount;
	}

	public String validateAmount(int amount) {
		String msg="";

		if ("".equals(amount) || 0 ==amount) {
			///throw new RuntimeException("Amount cannot be 0 or empty");
			
			msg= "Amount cannot be 0 or empty";
		}
		return msg;

	}
}
