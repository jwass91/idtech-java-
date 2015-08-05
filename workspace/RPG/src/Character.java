

public class Character {

	public String name = "Geoff";
    public int strength = 10;
    public int health = 20;
    public int defense = 5;
    public static String[] nameList = {"Geoff", "Steve", "Krogar"};
	
    public Character(int strength, int defense, int health){
        this();
        this.strength = strength;
        this.defense = defense;
        this.health = health;
         
        }
    
    public static void main(String[] args) {
        
        Character player1 = new Character(20,4,200);
        Character player2 = new Character(10,2,100);
         
} 
    
    public int takeDamage( int damage ) {
    	int damageTaken = damage - this.defense;
    	this.health -= damageTaken;
    	return damageTaken;
    }
	
	public int attack( Character target){
		int damageDelt = this.strength + Arena.generator.nextInt(5);
		return target.takeDamage(damageDelt);
	}
	
	public boolean isAlive(){
		return this.health > 0;
	}
	
	public Character(){
        // Class constructor
         
        // Pick a character name at random
        this.name = nameList[Arena.generator.nextInt(nameList.length)];
    }
}
