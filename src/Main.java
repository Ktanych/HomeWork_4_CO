public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }

        int ageTwo = 16;
        if (ageTwo <= 18) {
            System.out.println("Если возраст равен " + ageTwo + " ,то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + ageTwo + " ,то он совершеннолетний");
        }

        // task 2
        System.out.println("Задача 2");
        int temperatureAir = 8;
        if (temperatureAir < 5) {
            System.out.println("На улице " + temperatureAir + " градусов, нужно надеть шапку");
        }

        if (temperatureAir > 5) {
            System.out.println("На улице " + temperatureAir + " градусов, можно идти без шапки");
        }

        // task 3
        System.out.println("Задача 3");
        int speedKmHour = 73;
        if (speedKmHour > 60) {
            System.out.println("Если скорость " + speedKmHour + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedKmHour + " км/ч, можно ездить спокойно");
        }

        // task 4
        System.out.println("Задача 4");
        int agePerson = 1;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад.");
        } else if (agePerson >=7 && agePerson < 18) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу");
        } else if (agePerson >= 18 && agePerson < 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то его место в университете.");
        } else if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человка равен " + agePerson + " он еще под опекай родителей");
        }

        // task 5
        System.out.println("Задача 5");
        int ageRestrictions = 16;
        if (ageRestrictions < 5) {
            System.out.println("Если возраст ребенка равен " + ageRestrictions + ", то ему нельзя кататься на аттракционе.");
        } else if (ageRestrictions > 5 && ageRestrictions < 14) {
            System.out.println("Если возраст ребенка равен " + ageRestrictions + " то он можно кататься на аттракционе в сопровождении взрослого");
        } else if (ageRestrictions >= 14) {
            System.out.println("Если возраст ребенка равен " + ageRestrictions + " может кататься без сопровождения взрослого.");
        } else {
            System.out.println();
        }

        // task 6
        System.out.println("Задача 6");
        int trainCapacityPeople = 102;
        int seating = 60;
        int standingPlaces = trainCapacityPeople - seating;
        int busySedentary = 60;
        int busyStanding = 42;
        if (seating > busySedentary) {
            System.out.println("В поезде сидячих мест " + (seating - busySedentary) );
        } else {
            System.out.println("В поезде сидячих мест нет");
        }
        if (standingPlaces > busyStanding) {
            System.out.println("В поезде стоячих мест " + (standingPlaces - busyStanding));
        } else {
            System.out.println("В поезде сточих мест нет");
        }

        // task 7
        System.out.println("Задача 7");
        int one = 37;
        int two = 15;
        int three = 24;
        if (one > two && one > three) {
            System.out.println("Максимальное значение " + one);
        } else if (two > three) {
            System.out.println("Максимальное значение " + two);
        } else {
            System.out.println("Максимальное значение " + three);
        }


    }
}