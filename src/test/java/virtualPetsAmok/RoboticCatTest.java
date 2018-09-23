package virtualPetsAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoboticCatTest {
	
	public void ShouldHaveName() {
	
	//Arrange
	RoboticCat testRoboticCat = new RoboticCat("Rcat"); 
	//Act
	String testName = testRoboticCat.getName();
	//Assert
	assertThat(testName, is("Rcat"));
	}
}