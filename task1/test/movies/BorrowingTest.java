package movies;

import static org.junit.Assert.*;

import org.junit.Test;

public class BorrowingTest {

    @Test
    public void aBorrowingCanBeCreatedWith1ParametersCustomerName() {
        Customer customer = new Customer("Juan");
        Borrowing rent = new Borrowing(customer);
        assertTrue(rent instanceof Borrowing);
    }

    @Test
    public void BorrowingCanBeCreatedWithParameters() {
        Customer customer = new Customer("Juan");
        Borrowing rent = new Borrowing(customer);      
        assertNotNull(rent);
    }
    
    @Test
    public void BorrowingCanBeAddMovieinList() {
        Customer customer = new Customer("Juan");
        Borrowing rent = new Borrowing(customer);
        rent.addRental(new Rental(new Movie("Roky",5), 30));
        rent.addRental(new Rental(new Movie("Roky II",5), 30));
        assertEquals(2,rent.getRentals().size());
    }

}
