public class CreditCard extends AbstractBankCard{


    public CreditCard(){
        this.balance.set(0);
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
