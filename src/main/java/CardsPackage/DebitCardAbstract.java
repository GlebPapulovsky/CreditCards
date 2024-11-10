package CardsPackage;

public abstract class DebitCardAbstract extends AbstractBankCard {


    public DebitCardAbstract() {
        this.balance.set(0);
    }

    /*@Override
    public boolean pay(int value) {
        if (value >= 0) {
            if (value <= this.balance.get()) {
                this.balance.set(this.balance.get() - value);
                return true;
            }
        }
        return false;
    }*/


    @Override
    public final boolean topUp(int value) {
        if (value > 0) {
            this.balance.set(this.balance.get() + value);
            return true;
        }
        return false;
    }


}
