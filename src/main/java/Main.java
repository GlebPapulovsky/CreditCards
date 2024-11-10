import CardsPackage.DebitCard;

public  class Main {
    public static void main(String[] args){
        DebitCard debitCard=new DebitCard();
        debitCard.topUp(1000);
        System.out.println(debitCard.pay(1200));
        System.out.println(debitCard.pay(100));
        System.out.println(debitCard.getBalance());
        System.out.println(debitCard.topUp(100));
        System.out.println(debitCard.getBalance());




    }
}
