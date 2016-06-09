package movies;

import static org.junit.Assert.*;

import org.junit.Test;

public class RentalTest {

    @Test
    public void aRentalCanBeCreatedWith2ParametersMovieAndRentalDay() {

        Movie movie = new Movie("Rocky", 65);
        Rental rental = new Rental(movie, 5);
        assertTrue(rental instanceof Rental);
    }

    @Test
    public void rentalCanBeCreatedWithParameters() {
        Movie newMovie = new Movie("Rocky", 65);
        Rental rental = new Rental(newMovie, 5);
        assertNotNull(rental);
    }

    @Test
    public void rentalCreateWithMovieandRentalDayShouldReturnThem() {
        Movie movie = new Movie("Rocky", 30);
        Rental rental = new Rental(movie, 5);
        assertEquals(5, rental.getDaysRented());
        assertTrue(rental.getMovie() instanceof Movie);
    }

    @Test
    public void rentalReturnWithTitleandPriceParamsShouldReturnThem() {
        Movie movie = new Movie("Rocky", 30);
        Rental rental = new Rental(movie, 5);
        assertEquals(5, rental.getDaysRented());
        assertEquals(movie, rental.getMovie());
    }

}
