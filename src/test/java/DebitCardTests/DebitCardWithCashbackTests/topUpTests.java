package DebitCardTests.DebitCardWithCashbackTests;

import CardsPackage.DebitCardWithCashback;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class topUpTests {
    @Test
    public void isWorking() {
        DebitCardWithCashback card = new DebitCardWithCashback();
        card.topUp(100);
        card.topUp(100);
        card.topUp(100);

        int expected = 300;

        Assertions.assertEquals(expected, card.getBalance());
    }

    @Test
    public void shouldFalseIfParametrsLessZero() {
        DebitCardWithCashback card = new DebitCardWithCashback();

        boolean expected = false;

        Assertions.assertEquals(expected, card.topUp(-1));


    }
}

