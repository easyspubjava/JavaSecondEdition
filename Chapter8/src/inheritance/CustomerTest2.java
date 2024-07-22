package inheritance;
   
public class CustomerTest2 {
	 public static void main(String[] args) {		
          //VIPCustomer customerKim = new VIPCustomer();
		  VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		  customerKim.setCustomerID(10020);
		  customerKim.setCustomerName("김유신");
		  customerKim.bonusPoint = 10000;
		  System.out.println(customerKim.showCustomerInfo());
	 }
}
