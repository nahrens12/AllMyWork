import org.junit.Test;
//import org.junit.ignore;
import static org.junit.Assert.assertEquals;
//import static junit.



public class Testing {

    BlackJack blackJa = new BlackJack();

    @Test
    public void testBlackJack()
    {


        assertEquals(20, blackJa.BlackJack(20,15));
        assertEquals(18, blackJa.BlackJack(18, 10));

    }
}