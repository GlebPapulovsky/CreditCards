package CardsPackage;

public class DebitCard extends AbstractBankCard {


    public DebitCard(){
        this.balance.set(0);
    }

    @Override
    public boolean pay(int value) {
        if (value>=0){
            if (value<=this.balance.get()){
                this.balance.set(this.balance.get()-value);
                return true;
            }
        }
        return false;
    }

    @Override
    public int getBalance() {
        return this.balance.get();
    }
    @Override
    public boolean topUp(int value) {
        if (value>0){
            this.balance.set(this.balance.get()+value);
            return true;
        }
        return false;
    }


}
