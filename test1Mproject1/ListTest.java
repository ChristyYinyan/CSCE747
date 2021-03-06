package test1Mproject1;

import static org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.awt.List;

public class ListTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		//Let's import Mockito statically so that the code looks clearer
		

	   	//mock creation
		List mockedList = mock(List.class);

		//using mock object
		mockedList.add("one");
		mockedList.clear();

		//verification
		verify(mockedList).add("one");
		verify(mockedList).clear();
	}

}
