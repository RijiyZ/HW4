public class Main {
    public static void main(String[] args) {
        int age = 22; // 1 задание
        if (age >= 18) {
            System.out.println("Поздравляю, вы достигли совершеннолетия!");
        } else {
            System.out.println("Возраст совершенноления еще не наступил, нужно немного подождать");
        }

        int ag = 77; // 2 задание
        if (ag < 7){
            System.out.println("Ходит в садик");
        } else {
            if (ag <= 18) {
                System.out.println("Ходит в школу");
            } else {
                if (ag < 24) {
                    System.out.println("Ходит в универ");
                }else {
                    System.out.println("Ходит на работу");
                }
            }
        }

        int mest = 76; // 3 zadanie
        if (mest <= 60) {
            System.out.println("Есть сидячее место");
        } else
            if (mest <=102){
                System.out.println("Есть стоячее место");
            }else{
                System.out.println("Мест нет");
            }
    }
}