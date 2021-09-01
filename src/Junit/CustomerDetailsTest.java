package Junit;

import org.junit.jupiter.api.Test;

import ordersystem.CustomerDetails;

class CustomerDetailsTest {
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void testProcessCustomerDetails() {
		 @SuppressWarnings("unused")
		CustomerDetails customer = new CustomerDetails(null, null, null, null);
		equals(CustomerDetails.processCustomerDetails ==1 );
	}

}
