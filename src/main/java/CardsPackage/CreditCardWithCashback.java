package CardsPackage;

public class CreditCardWithCashback extends CreditCardAbstract {


    public CreditCardWithCashback(int creditLimitValue) {
        super(creditLimitValue);
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
                    if (value >= 5000) this.topUp(value / 100 * 5);
                    return true;
                }
            }
        }

        return false;
    }
}
