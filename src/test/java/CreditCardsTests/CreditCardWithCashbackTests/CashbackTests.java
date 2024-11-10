package CreditCardsTests.CreditCardWithCashbackTests;

import CardsPackage.CreditCardWithCashback;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackTests {
    @Test
    public void isWorking1() {
        CreditCardWithCashback card = new CreditCardWithCashback(10000);
        card.topUp(5000);
        card.pay(5000);

        int expected = 250;

        Assertions.assertEquals(expected, card.getBalance());

    }

    @Test
    public void isWorking2() {
        CreditCardWithCashback card = new CreditCardWithCashback(10000);

        card.pay(5000);

        int expected = 5250;

        Assertions.assertEquals(expected, card.getCreditBalance());

    }

    @Test
    public void isWorking3() {
        CreditCardWithCashback card = new CreditCardWithCashback(10000);
        card.topUp(5000);
        card.pay(10000);

        int expected = 5500;

        Assertions.assertEquals(expected, card.getCreditBalance());

    }


}
