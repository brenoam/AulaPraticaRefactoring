public class Main{
	public static void main(String[] args) {
		Movie m1 = new Movie("Inception", 0);
		Movie m2 = new Movie("Interstellar", 0);
		Movie m3 = new Movie("Finding Nemo", 2);
		Movie m4 = new Movie("Aladdin", 1);
		Customer c = new Customer("Phineas");
		Rental r1 = new Rental(m1, 3);
		Rental r2 = new Rental(m2, 2);
		Rental r3 = new Rental(m3, 4);
		Rental r4 = new Rental(m4, 5);
		c.addRental(r1);
		c.addRental(r2);
		c.addRental(r3);
		c.addRental(r4);
		
		Boolean result  = c.statement().equals("Rental Record for Phineas\n\tInception\t3.5\n\tInterstellar\t2.0\n\tFinding Nemo\t3.0\n\tAladdin\t15.0\nAmount owed is 23.5\nYou earned 5 frequent renter points");
		System.out.println(result);
		System.out.println(c.statement());
	}
}