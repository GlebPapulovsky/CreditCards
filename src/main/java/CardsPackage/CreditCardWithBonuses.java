package CardsPackage;

import java.util.concurrent.atomic.AtomicInteger;

public class CreditCardWithBonuses extends CreditCard {
    AtomicInteger bonuses = new AtomicInteger();

    public CreditCardWithBonuses(int creditLimitValue) {
        super(creditLimitValue);
        bonuses.set(0);
    }

    @Override
    public boolean pay(int value) {
        if (value >= 0) {
            if (value <= this.balance.get() + this.creditBalance.get()) {
                this.balance.set(this.balance.get() - value);
                if (this.balance.get() < 0) {
                    this.creditBalance.set(this.creditBalance.get() + this.balance.get());
                    this.balance.set(0);
                }
                if (this.balance.get() >= 0 && this.creditBalance.get() >= 0) {
                    this.bonuses.set(this.bonuses.get() + value / 100);
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("bonuses: " + this.bonuses.get());
    }

    public int getBonuses() {
        return this.bonuses.get();
    }
}
