import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Account {
	
	private int accNo;
	private String accType;
	private String accStatus;
	
	public Account(int accountNo, String accountType, String accountStatus){
		accNo = accountNo;
		accType = accountType;
		accStatus = accountStatus;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getAccStatus() {
		return accStatus;
	}
	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}		
}
//ListtoMap.java 
public class ListtoMap {
	
	public static void main(String[] args) {
 
		List<Account> li = new ArrayList<Account>();
		
		Account ac1= new Account(100,"Savings","Open");
		Account ac2= new Account(101,"Checking","Closed");
		
		li.add(ac1);
		li.add(ac2);
		
	 // Before Java 8
		Map<Integer, String> beforeJava8 = new HashMap<>(); 
		for (Account acc: li) {
			beforeJava8.put(acc.getAccNo(), acc.getAccStatus()); 
		} 
	    System.out.println("Before Java 8 "+beforeJava8);		    
	    
	    
	    
	 // Java 8 Using Lambda expression and Stream API
		Map<Integer, String> map = li.stream().collect(Collectors.toMap(x -> x.getAccNo()  , x -> x.getAccStatus()));
		System.out.println("Java 8 "+map);
	}
}
