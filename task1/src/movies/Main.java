package movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        Borrowing borrowing = new Borrowing(customer);
        borrowing.addRental(new Rental(new Movie("The Revenant", 1), 2));
        borrowing.addRental(new Rental(new Movie("Terminator", 0), 2));
        System.out.println(borrowing.statement());
    }
}
