package movies;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void aCustomerCanBeCreatedWith1ParametersCustomerName() {

        Customer customer = new Customer("Juan");
        assertTrue(customer instanceof Customer);
    }

    @Test
    public void customerCanBeCreatedWithParameters() {
        Customer customer = new Customer("Juan");      
        assertNotNull(customer);
    }
    
    @Test
    public void movieCreateWithNameParamsShouldReturnThem() {
        Customer customer = new Customer("Juan");   
        assertEquals("Juan", customer.getName());
    }
}
