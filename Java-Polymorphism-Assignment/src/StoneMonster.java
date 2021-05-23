
public class StoneMonster extends Monster{
		
		public StoneMonster(String name) {  // Constructor
		super(name);
		}
		// Subclass provides actual implementation
		@Override
		public String attack() {
		return name + " Attack with stones!";
		}
}
