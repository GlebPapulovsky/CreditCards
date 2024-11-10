import java.util.concurrent.atomic.AtomicInteger;

public abstract class AbstractBankCard {
    protected AtomicInteger balance;

    public abstract boolean pay();
    public abstract int getBalance();
    public abstract void getInfo();
}
