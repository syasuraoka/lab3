import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test 
	public void testfilter() {
    int[] input1 = { 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1,2,3 };
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testaverageWithoutLowest(){
    double[] input = null;
    assertEquals(null, ArrayExamples.averageWithoutLowest(input));
    
  }
}