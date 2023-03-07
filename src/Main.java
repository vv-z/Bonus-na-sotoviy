public class Main {
    public static void main(String[] args) {

        int balance = 200; // баланс телефона
        int bonusAmount = 100; // полная сумма за которую дается 1 балл
        int refill = 1100; // сумма пополнения баланса
        if (refill > 1000) {
            System.out.println("Вы пополнили баланс на " + refill + " руб., Вам начислено " + refill / bonusAmount + " бонусов. Ваш баланс с учетом бонусов составляет " + (refill + refill / bonusAmount + balance) + " руб.");
        } else {

            System.out.println("Ваш баланс = " + (refill + balance) + " руб.");
        }
    }
}