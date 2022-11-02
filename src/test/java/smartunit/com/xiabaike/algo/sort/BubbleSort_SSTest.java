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
      //caseID:40ace8cb4c28dc455b3b319806acd73a
      //CoveredLines: [8, 12, 14, 15, 16, 17, 18, 21, 23]
      //Input_0_int[]: intArray0
      
      BubbleSort bubbleSort0 = new BubbleSort();
      int[] intArray0 = new int[6];
      intArray0[0] = 1;
      intArray0[3] = 1;
      
      //Call method: sort
      bubbleSort0.sort(intArray0);
      
      //Test Result Assert
      assertArrayEquals(new int[] {0, 0, 0, 0, 1, 1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test_sort_1()  throws Throwable  {
      //caseID:bebfe125ea48aca2d0c7d15bcaf9bd32
      //CoveredLines: [8, 12, 14, 15, 16, 17, 18, 21, 23]
      //Input_0_int[]: intArray0
      
      BubbleSort bubbleSort0 = new BubbleSort();
      int[] intArray0 = new int[2];
      intArray0[0] = 158;
      
      //Call method: sort
      bubbleSort0.sort(intArray0);
      
      //Test Result Assert
      assertArrayEquals(new int[] {0, 158}, intArray0);
  }
}
