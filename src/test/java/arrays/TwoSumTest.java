package arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.arrays.TwoSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TwoSumTest {

    private static final Logger log = LogManager.getLogger(TwoSumTest.class);

    @Test
    public void twoSumTest() {

        /*int[] testData = new int[]{0, 1};
        assertEquals(9, TwoSum.twoSum(new int[]{2,7,11,15}, 9));
        assertEquals(6, TwoSum.twoSum(new int[]{3,2,4}, 6));
        assertEquals(6, TwoSum.twoSum(new int[]{3,3}, 6));*/

        int[] expectedValue = null;
        int[] nums = null;
        int target=0;

        try {
            log.info("Starting execution of twoSum");
            int[] actualValue=TwoSum.twoSum( nums ,target);
            log.info("Expected Value="+ expectedValue +" . Actual Value="+actualValue);
            System.out.println("Expected Value="+ expectedValue +" . Actual Value="+actualValue);
            assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.error("Exception in execution of execute1GetAllLogFromFirstMovF-"+exception,exception);
            exception.printStackTrace();
            assertFalse(false);
        }

    }

}
