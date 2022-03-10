package springQ1;



public class Customer  {
	int Customerid;
	String Customername;
	Long CustomerContact;
	Address address;
	public Customer(int customerid, String customername, Long customerContact,Address ADDress) {
		super();
		Customerid = customerid;
		Customername = customername;
		CustomerContact = customerContact;
		address = ADDress;
	}
	@Override
	public String toString() {
		return "Customer [Customerid=" + Customerid + ", Customername=" + Customername + ", CustomerContact="
				+ CustomerContact +" Address="+ address +"]";
	}

		
	
	
}
