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
      //caseID:4ccc1dd3565203c22c26bdd9678b98d5
      //CoveredLines: [8, 12, 14, 15, 16, 17, 18, 21, 23]
      //Input_0_int[]: intArray0
      
      BubbleSort bubbleSort0 = new BubbleSort();
      int[] intArray0 = new int[8];
      intArray0[0] = 741;
      
      //Call method: sort
      bubbleSort0.sort(intArray0);
      
      //Test Result Assert
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 741}, intArray0);
  }
}
