package CardsPackage;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class AbstractBankCard {
    protected AtomicInteger balance = new AtomicInteger();

    public abstract boolean pay(int value);

    public final int getBalance() {
        return this.balance.get();
    }

    public abstract boolean topUp(int value);
    //public  void getInfo();
}
