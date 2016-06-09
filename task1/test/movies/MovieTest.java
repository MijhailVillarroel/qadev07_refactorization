package movies;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

    @Test
    public void aMovieCanBeCreatedWith2ParametersTitleAndPriceCode() {

        Movie movie = new Movie("Rocky", 65);
        assertTrue(movie instanceof Movie);
    }

    @Test
    public void movieCanBeCreatedWithParameters() {
        Movie newMovie = new Movie("Rocky", 65);
        assertNotNull(newMovie);
    }

    @Test
    public void movieCreateWithTitleandPriceParamsShouldReturnThem() {
        Movie movie = new Movie("Rocky", 30);
        assertEquals(30, movie.getPriceCode());
        assertEquals("Rocky", movie.getTitle());
    }

    @Test
    public void movieReturnWithTitleandPriceParamsShouldReturnThem() {
        Movie movie = new Movie("Rocky", 30);
        movie.setPriceCode(40);
        assertEquals(40, movie.getPriceCode());
    }

    @Test
    public void RegularStaticVariableHas0() {

        assertEquals(0, Movie.REGULAR);
    }

    @Test
    public void NewReleaseStaticVariableHas1() {

        assertEquals(1, Movie.NEW_RELEASE);
    }

    @Test
    public void ChildrensStaticVariableHas2() {

        assertEquals(2, Movie.CHILDRENS);
    }

}
