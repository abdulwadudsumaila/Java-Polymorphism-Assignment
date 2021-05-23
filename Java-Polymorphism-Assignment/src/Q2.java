
public class Q2 {
	
	public static void main(String[] args) {
		// Declare references of the superclass
		// and assign instances of subclasses.
		Monster m1 = new FireMonster("Kwame"); 
		Monster m2 = new WaterMonster("Kojo"); 
		Monster m3 = new StoneMonster("Baba");
		// Invoke the actual implementation
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
		// m1 dies, generate a new instance and re-assign to m1.
		m1 = new StoneMonster("Meta");
		System.out.println(m1.attack()); 
		
		}

}
