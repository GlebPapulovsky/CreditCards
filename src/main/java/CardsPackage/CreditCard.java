package CardsPackage;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.atomic.AtomicInteger;

public class CreditCard extends AbstractBankCard {
    private AtomicInteger creditLimit=new AtomicInteger();
    private AtomicInteger creditBalance=new AtomicInteger();

    public CreditCard(int creditLimitValue){
        this.balance.set(0);
        this.creditBalance.set(creditLimitValue);
        this.creditLimit.set(creditLimitValue);
    }
    @Override
    public boolean pay(int value) {
        if (value>=0){
            if (value<=this.balance.get()+this.creditBalance.get()){
                this.balance.set(this.balance.get()-value);
                if(this.balance.get()<0){
                    this.creditBalance.set(this.creditBalance.get()+this.balance.get());
                    this.balance.set(0);
                }
               if(this.balance.get()>=0 && this.creditBalance.get()>=0){
                   return true;
               }
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
        if (value>=0){
            if (this.creditBalance.get()!=this.creditLimit.get()){
                creditBalance.set(creditBalance.get()+value);
                if(creditBalance.get()>creditLimit.get()){
                    balance.set(balance.get()+creditBalance.get()-creditLimit.get());
                }
            }
        }
        return false;
    }

    public void getInfo() {
        System.out.println("Balance: "+ this.balance.get());
        System.out.println("creditBalance: "+ this.creditBalance.get());
        System.out.println("creditLimit: "+creditLimit.get());

    }
}
