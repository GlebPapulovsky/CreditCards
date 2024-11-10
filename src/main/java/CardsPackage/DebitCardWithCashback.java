package CardsPackage;

public class DebitCardWithCashback extends DebitCardAbstract {

    @Override
    public boolean pay(int value) {
        if (value >= 0) {
            if (value <= this.balance.get()) {
                this.balance.set(this.balance.get() - value);
                if (value >= 5000) {
                    this.topUp(value / 1000 * 20);
                }
                return true;
            }
        }
        return false;
    }
}
