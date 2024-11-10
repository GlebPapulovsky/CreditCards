package DebitCardTests.DebitCardWithCashbackTests;

import CardsPackage.DebitCardWithCashback;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class getBalanceTests {
    @Test
    public void isWorking() {
        DebitCardWithCashback card = new DebitCardWithCashback();
        card.topUp(1000);

        int expected = 1000;
        Assertions.assertEquals(expected, card.getBalance());

    }

    @Test
    public void isWorkingWithoutTopUp() {
        DebitCardWithCashback card = new DebitCardWithCashback();

        int expected = 0;

        Assertions.assertEquals(0, card.getBalance());

    }
}
