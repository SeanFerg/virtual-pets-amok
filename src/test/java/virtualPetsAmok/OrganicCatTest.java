package virtualPetsAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OrganicCatTest {
	
	public void ShouldHaveName() {
		
		//Arrange
		OrganicCat testOrganicCat = new OrganicCat("Ocat"); 
		//Act
		String testName = testOrganicCat.getName();
		//Assert
		assertThat(testName, is("Ocat"));
		}
	}
