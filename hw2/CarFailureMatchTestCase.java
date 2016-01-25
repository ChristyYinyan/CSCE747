package hw2;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.*;
import test2Mproject2.Client;

import org.junit.Test;

public class CarFailureMatchTestCase {

	private Car myFerrari = mock(Car.class);

	@Test
	// Test failure cases
	public void allOfExampleShowsFailingIfOneMatcherDoesNotMatch()
			throws Exception {
		assertThat(myFerrari, is(allOf(notNullValue(), instanceOf(Client.class))));
	}

}
