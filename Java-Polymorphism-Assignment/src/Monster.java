
abstract public class Monster {
// protected instance variable
protected String name;
// Constructor
public Monster(String name) {
this.name = name;
}
// All Monster subclasses must implement a method called attack()
abstract public String attack();
}
