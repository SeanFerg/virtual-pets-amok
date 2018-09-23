package virtualPetsAmok;

public class RoboticDog {
	String name; int happiness;
	RoboticDog(String name){
		this.name = name;
		happiness = 50;
	}
	String getName() {
		return name;
	}
	int getHappiness() {
		return happiness;
	}		
}
