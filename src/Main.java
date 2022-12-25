public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int it = 123456789;
        byte bit = 123;
        short shot = 12345;
        long lon = 123456789;
        float flo = 12.2334f;
        double dob = 123.345345;
        System.out.println("Переменная int = " + it);
        System.out.println("Переменная byte = " + bit);
        System.out.println("Переменная short = " + shot);
        System.out.println("Переменная long = " + lon);
        System.out.println("Переменная float = " + flo);
        System.out.println("Переменная double = " + dob);

    }
    public static void task2 () {
        System.out.println("Задача 2");
    float flo = 27.12f;
    long lon = 987678965549L;
    double dub = 2.786;
    short shot = 569;
    short in = -159;
    int shor = 27897;
    byte bit = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte audPav = 23;
        byte annSer = 27;
        byte ekAnd = 30;
        short bum = 480;
        int teacher = audPav + annSer + ekAnd;
        int totalPaper = bum / teacher;
        System.out.println("На каждого ученика рассчитано " + totalPaper + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        short twentyMinutes = 20 * 8;
        int day = 1440 * 8;
        int theeDay = 4320 * 8;
        long month = 43200 * 8;
        System.out.println("За " + 20 + " минут машина произвела " + twentyMinutes +" штук бутылок");
        System.out.println("За 1 день машина произвела " + day +" штук бутылок");
        System.out.println("За 3 дня машина произвела " + theeDay +" штук бутылок");
        System.out.println("За месяц машина произвела " + month +" штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte paintsRequired = 120;
        byte white = 2;
        byte brown = 4;
        int Class = white + brown;
        int allClass = paintsRequired / Class;
        int allWhite = white * allClass;
        int allBrown = brown * allClass;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int allBanana = banana * 5;
        int allMilk = milk * 2;
        int allIceCream = iceCream * 2;
        int allEgg = egg * 4;
        int breakfast = allBanana + allMilk + allIceCream + allEgg;
        System.out.println("Общее количество грамм спортивного завтрака: " + breakfast);
        int kilBreakfast = breakfast / 1000;
        System.out.println("В килограммах это: " + kilBreakfast);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int weight = 7000;
        int allWeight250 = weight / 250;
        int allWeight500 = weight / 500;
        System.out.println(allWeight250 + " Дней уйдёт на похудение, при трате 250 грамм");
        System.out.println(allWeight500 + " Дней уйдёт на похудение, при трате 500 грамм");
        int allWeight = (allWeight250 + allWeight500) / 2;
        System.out.println(allWeight + " День уйдёт в среднем на похудение");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int moneyMasha = masha / 10;
        int moneyDenis = denis / 10;
        int moneyKristina = kristina / 10;
        System.out.println("Зарплата Маши увеличиться на: " + moneyMasha);
        System.out.println("Зарплата Дениса увеличиться на: " + moneyDenis);
        System.out.println("Зарплата Кристины увеличиться на: " + moneyKristina);
        int yearMasha = masha * 12;
        int yearDenis = denis * 12;
        int yearKristina = kristina * 12;
        System.out.println("Зарплата Маши за год составляет: " + yearMasha);
        System.out.println("Зарплата Дениса за год составляет: " + yearDenis);
        System.out.println("Зарплата Кристины за год составляет: " + yearKristina);
        int yearPlusMasha = (masha + moneyMasha) * 12;
        int yearPlusDenis = (denis + moneyDenis) * 12;
        int yearPlusKristina = (kristina + moneyKristina) * 12;
        System.out.println("Зарплата Маши за год с повышением зарплаты, составляет: " + yearPlusMasha);
        System.out.println("Зарплата Дениса за год с повышением зарплаты, составляет: " + yearPlusDenis);
        System.out.println("Зарплата Кристины за год с повышением зарплаты, составляет: " + yearPlusKristina);

    }
}
