package test1Part2;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import org.junit.Test;


public class MockTestForCourse {
	@Test
	public void testCourse(){
		Course crs = mock(Course.class);
		when(crs.findProfessor("CSCE101")).thenReturn("TBA");
		assertEquals("TBA", crs.findProfessor("CSCE101"));
		
		when(crs.findStartT("CSCE101")).thenReturn("08:30");
		assertEquals("08:30", crs.findProfessor("CSCE101"));
		
		when(crs.findFinishT("CSCE101")).thenReturn("09:20");
		assertEquals("09:20", crs.findFinishT("CSCE101"));
		
		
		
	}
	

}
