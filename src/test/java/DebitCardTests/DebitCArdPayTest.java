package DebitCardTests;

import CardsPackage.DebitCard;
import org.junit.jupiter.api.Test;

public class DebitCArdPayTest {

    @Test
    public void payTest(){
        DebitCard debitCard=new DebitCard();
        debitCard.topUp(1000);
        boolean isPayed=debitCard.pay(100);
        


    }
}
