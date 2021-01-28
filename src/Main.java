public class Main {
    public static void main(String[] args) {
        int balance = 700;
        int donation = 400;
        int bonus = 0;
        if (donation >= 1000) {
            bonus = donation / 100;
        } else {
            bonus = 0;
        }

        balance = balance + donation + bonus;
        System.out.println("Начислено бонусов " + bonus);
        System.out.println("Баланс с бонусами " + balance);
    }
}



