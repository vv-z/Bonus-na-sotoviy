public class Main {
    public static void main(String[] args) {

        int balance = 200; // баланс телефона
        int bonus_amount = 100; // полная сумма за которую дается 1 балл
        int refill = 1100; // сумма пополнения баланса
        if (refill > 1000) {
            System.out.println("Вы пополнили баланс на " + refill + " руб., Вам начислено " + refill / bonus_amount + " бонусов. Ваш баланс с учетом бонусов составляет " + (refill + refill / bonus_amount + balance) + " руб.");
        } else {

            System.out.println("Ваш баланс = " + (refill + balance) + " руб.");
        }
    }
}