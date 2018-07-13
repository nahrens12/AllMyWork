import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testing {



        UniqueSum uniquesum = new UniqueSum();




        @Test
        public void testUniqueSum()

        {

            assertEquals(0, uniquesum.UniqueSum(2,1,3));
           assertEquals(3, uniquesum.UniqueSum(2,2,3));
            assertEquals(0, uniquesum.UniqueSum(3,3,3));
            assertEquals(3, uniquesum.UniqueSum(2,3,2));
        }
    }


