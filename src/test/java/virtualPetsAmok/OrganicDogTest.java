package virtualPetsAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OrganicDogTest {
	
	public void ShouldHaveName() {
		
		//Arrange
		OrganicDog testOrganicDog = new OrganicDog("ODog"); 
		//Act
		String testName = testOrganicDog.getName();
		//Assert
		assertThat(testName, is("ODog"));
		}
	}

