/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.xiabaike.algo.sort;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.xiabaike.algo.sort.BubbleSort;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BubbleSort_SSTest extends BubbleSort_SSTest_scaffolding {
// allCoveredLines:[8, 12, 14, 15, 16, 17, 18, 21, 23]

  @Test(timeout = 4000)
  public void test_sort_0()  throws Throwable  {
      //caseID:df996dbc841828760311909c7f675d47
      //CoveredLines: [8, 12, 14, 15, 16, 17, 18, 21, 23]
      //Input_0_int[]: intArray0
      
      BubbleSort bubbleSort0 = new BubbleSort();
      int[] intArray0 = new int[5];
      intArray0[3] = (-1);
      
      //Call method: sort
      bubbleSort0.sort(intArray0);
      
      //Test Result Assert
      assertArrayEquals(new int[] {(-1), 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test_sort_1()  throws Throwable  {
      //caseID:58479c3dcde4e011e5adc79689d5c53e
      //CoveredLines: [8, 12, 14, 15, 16, 17, 18, 21, 23]
      //Input_0_int[]: intArray0
      
      BubbleSort bubbleSort0 = new BubbleSort();
      int[] intArray0 = new int[2];
      intArray0[1] = (-1);
      
      //Call method: sort
      bubbleSort0.sort(intArray0);
      
      //Test Result Assert
      assertArrayEquals(new int[] {(-1), 0}, intArray0);
  }
}
