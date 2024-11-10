package CreditCardsTests;

import CardsPackage.CreditCardWithBonuses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class topUpTest {
    @Test
    public void isWorking() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(100);
        card.topUp(200);

        int expected = 200;

        Assertions.assertEquals(expected, card.getBalance());

    }

    @Test
    public void isWorkingWithZerCreditBalance1() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(100);
        card.pay(100);
        card.topUp(300);

        int expected = 200;

        Assertions.assertEquals(expected, card.getBalance());

    }

    @Test
    public void isWorkingWithZerCreditBalance2() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(100);
        card.pay(100);
        card.topUp(100);

        int expected = 0;

        Assertions.assertEquals(expected, card.getBalance());

    }
}
