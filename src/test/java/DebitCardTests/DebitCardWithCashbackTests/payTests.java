package DebitCardTests.DebitCardWithCashbackTests;

import CardsPackage.DebitCardWithCashback;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class payTests {
    @Test
    public void isWorking() {
        DebitCardWithCashback card = new DebitCardWithCashback();
        card.topUp(1000);
        card.pay(500);

        int expected = 500;

        Assertions.assertEquals(expected, card.getBalance());
    }

    @Test
    public void shouldFalseIfNotAnouthMoney() {
        DebitCardWithCashback card = new DebitCardWithCashback();
        card.topUp(1000);

        boolean expected = false;

        Assertions.assertEquals(expected, card.pay(1001));
    }

    @Test
    public void shouldFalseIfParametrsLessZero() {
        DebitCardWithCashback card = new DebitCardWithCashback();
        card.topUp(1000);

        boolean expected = false;

        Assertions.assertEquals(expected, card.pay(-1));
    }
}
