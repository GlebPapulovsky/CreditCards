package CreditCardsTests;

import CardsPackage.CreditCard;
import CardsPackage.CreditCardWithBonuses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class payTests {
    @Test
    public void isWorkingSimplePay() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(1000);
        card.topUp(1000);
        card.pay(100);

        int expected = 900;

        Assertions.assertEquals(expected, card.getBalance());

    }

    @Test
    public void isWorkingCreditPay1() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(1000);

        card.pay(100);

        int expected = 900;

        Assertions.assertEquals(expected, card.getCreditBalance());

    }

    @Test
    public void isWorkingCreditPay2() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(1000);
        card.topUp(100);
        card.pay(200);

        int expected = 900;

        Assertions.assertEquals(expected, card.getCreditBalance());
        Assertions.assertEquals(0, card.getBalance());

    }

    @Test
    public void shouldFalseIfMoreThenLimit1() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(1000);

        boolean expected = false;

        Assertions.assertEquals(expected, card.pay(1001));
    }

    @Test
    public void shouldFalseIfMoreThenLimit2() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(1000);
        card.topUp(100);
        boolean expected = false;

        Assertions.assertEquals(expected, card.pay(1101));
        Assertions.assertEquals(100, card.getBalance());
    }


}
