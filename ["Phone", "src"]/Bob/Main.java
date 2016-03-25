package Bob;

public class Main {

	public static void main(String[] args) {
		Acheteur a = new Acheteur();
		Phonee p = new Phonee();
		
		a.acheter(p);
		System.out.println("l'acheter a "+ a.getPhone().size() + " telephone");
	}
}
