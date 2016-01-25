package hw2;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.*;
import test2Mproject2.Client; 

import org.junit.Test;

public class CarTestHam {

	private Car myFerrari = mock(Car.class);
	private Car Honda = mock(Car.class);
	
	//Test whether it is an instance
	@Test
	public void instanceOfExampleForCar() throws Exception{
	
		//use instanceOf
			assertThat(myFerrari, instanceOf(Car.class));
	}
	@Test
	//Test whether it is true
	public void allOfExampleShowsAllMatchersMustAllBeTrue() throws Exception{
		assertThat(myFerrari, is(allOf(notNullValue(), instanceOf(Car.class), equalTo(myFerrari))));
	}
	@Test
	//Test any example is true if one match
	public void allOfExampleReturnsTrueIfOneMatches() throws Exception{
		assertThat(myFerrari, is(anyOf(nullValue(), instanceOf(Car.class), equalTo(Honda))));
	}
	//anything example always return true
	public void anythingExampleAlwaysReturnsTrue() throws Exception{
		assertThat(myFerrari, is(anything()));
	}
	
}
