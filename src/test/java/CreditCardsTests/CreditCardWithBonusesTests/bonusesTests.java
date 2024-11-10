package CreditCardsTests.CreditCardWithBonusesTests;

import CardsPackage.CreditCardWithBonuses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bonusesTests {
    @Test
    public void isWorking1() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(1000);
        card.pay(900);

        int expected = 9;

        Assertions.assertEquals(expected, card.getBonuses());

    }

    @Test
    public void isWorking2() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(1000);
        card.pay(100);

        int expected = 1;

        Assertions.assertEquals(expected, card.getBonuses());

    }

    @Test
    public void isWorking3() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(3000);
        card.pay(400);

        int expected = 4;

        Assertions.assertEquals(expected, card.getBonuses());

    }

    @Test
    public void isWorking4() {
        CreditCardWithBonuses card = new CreditCardWithBonuses(2000);
        card.pay(1100);

        int expected = 11;

        Assertions.assertEquals(expected, card.getBonuses());

    }
}
