public class Main {
    public static void main(String[] args) {
        /*
        Домашнее задание по SkyPro 1 модуля 2 занятия "Переменные"
         */
        task1_2_3();
        task4();
        task5();
        task6_7();
        task8();
    }
    static void task1_2_3()
    {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        outTask1_3(dog, cat, paper);

        System.out.println("Задание 2");
        dog = dog +4;
        cat = cat +4;
        paper = paper +4;
        outTask1_3(dog, cat, paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        outTask1_3(dog, cat, paper);
    }
    static void outTask1_3(double dog, double cat, int paper)
    {
        System.out.println("Переменная dog = "+ dog +"\nПеременная cat = "+ cat + "\nПеременная paper = "+ paper);
        System.out.println("\n---\n");
    }

    static void task4()
    {
        System.out.println("Задание 4");

        var friend = 19;
        outTask4(friend);

        friend = friend +2;
        outTask4(friend);

        friend = friend / 7;
        outTask4(friend);
        System.out.println("---\n");
    }
    static void outTask4(int friend)
    {
        System.out.println("Переменная friend = "+ friend);
    }

    static void task5()
    {
        System.out.println("Задание 5");

        var frog = 3.5;
        outTask5(frog);

        frog = frog *10;
        outTask5(frog);

        frog = frog / 3.5;
        outTask5(frog);

        frog = frog + 4;
        outTask5(frog);
        System.out.println("---\n");
    }
    static void outTask5(double frog)
    {
        System.out.println("Переменная frog = "+ frog);
    }

    static void task6_7()
    {
        System.out.println("Задание 6");

        var box1 = 78.2;
        var box2 = 82.7;

        var weight = box1 + box2;
        var difference = box2 - box1;

        System.out.println("Общий вес двух бойцов = " + weight + " кг.");
        outTask6_7(difference);
        System.out.println("---\n");

        System.out.println("Задание 7");

        var diff1 = box2 - box1;
        outTask6_7(diff1);

        var diff2 = box2 % box1;
        outTask6_7(diff2);
        System.out.println("---\n");
    }
    static void outTask6_7(double diff)
    {
        System.out.println("Разница между бойцами составляет " + diff + "кг.");
    }

    static void task8()
    {
        System.out.println("Задание 8");

        var hours = 640;
        var workHours  = 8;

        var workers  = hours / workHours;
        System.out.println("Всего работников в компании — " +workers+ " человек");

        workers = workers + 94;
        hours = workers * workHours;
        System.out.println("Если в компании работает "+workers+" человек, то всего "+hours+
                " часов работы может быть поделено между сотрудниками");
    }


}