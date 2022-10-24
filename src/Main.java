public class Main {
    public static void main(String[] args) {
        int age = 15; // 1 zadanie
        if (age >= 18) {
            System.out.println("Поздравляю, вы достигли совершеннолетия!");
        } else {
            System.out.println("Возраст совершенноления еще не наступил, нужно немного подождать");
        }

        int ag = 77; // 2 задание
        if (ag < 7) {
            System.out.println("Ходит в садик");
        } else if (ag <= 18) {
            System.out.println("Ходит в школу");
        } else if (ag < 24) {
            System.out.println("Ходит в универ");
        } else {
            System.out.println("Ходит на работу");
        }

        int mest = 242; // 3 zadanie
        if (mest <= 60) {
            System.out.println("Есть сидячее место");
        } else if (mest <= 102) {
            System.out.println("Есть стоячее место");
        } else
            System.out.println("Мест нет");

        int voz = 24; // 4 zadanie
        if (voz >= 2 && voz <= 6) {
            System.out.println("Если возраст человека равен " + voz + " , то ему нужно ходить в детский сад");
        } else if (voz >= 7 && voz <= 18) {
            System.out.println("Если возраст человека равен " + voz + " , то ему нужно ходить в школу");
        } else if (voz > 18 && voz < 24) {
            System.out.println("Если возраст человека равен " + voz + " , то ему нужно ходить в университет");
        } else if (voz > 23) {
            System.out.println("Если возраст человека равен " + voz + " , то ему нужно ходить на работу");
        }

        int aje = 25; // 5 zadanie
        if (aje < 5) {
            System.out.println("Hе mожет кататься на аттракционе.");
        } else if (aje >= 5 && aje < 14) {
            System.out.println("Mожет кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (aje >= 14) {
            System.out.println("Mожет кататься без сопровождения взрослого.");
        }

        int one = 1; // 6 zadanie
        int two = 6;
        int free = 4;
        if (one > two && one > free) {
            System.out.println("Большее число " + one);
        } else if (two > one && two > free) {
            System.out.println("Большее число " + two);
        } else if (free > one && free > two) {
            System.out.println("Большее число " + free);
        }
    }
}