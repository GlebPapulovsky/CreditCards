import java.util.concurrent.atomic.AtomicInteger;

public class DebitCard extends AbstractBankCard {
    private AtomicInteger creditLimit;
    private AtomicInteger creditBalance;

    public DebitCard(int creditLimitValue){
        this.balance.set(0);
        this.creditBalance.set(0);
        this.creditLimit.set(creditLimitValue);
    }

    @Override
    public boolean pay() {
        return false;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public void getInfo() {

    }
}
