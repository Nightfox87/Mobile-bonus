public class Main {
    public static void main(String[] args) {

        int balance = 500; // остаток средств на счете
        int refill = 1500; // пополнение счета

        if (refill >= 1000) {
            int bonus = refill / 100;
            System.out.println("После пополнения баланса сумма на счету составляет: " + (balance + refill + bonus) + " руб.");
            System.out.println("Бонусов начислено: " + bonus + " руб.");
        } else {
            System.out.println("После пополнения баланса сумма на счету составляет: " + (balance + refill) + " руб.");
        }

    }
}
