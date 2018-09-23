package virtualPetsAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoboticDogTest {
	
	public void ShouldHaveName() {
	
	//Arrange
	RoboticDog testRoboticDog = new RoboticDog("Rdog"); 
	//Act
	String testName = testRoboticDog.getName();
	//Assert
	assertThat(testName, is("Rdog"));
	}
}


