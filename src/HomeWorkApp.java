public class HomeWorkApp { // Задание №1/№6:
    public static void main (String[] args){
        System.out.println("Задание №2:");
        printThreeWords();
        System.out.println("\nЗадание №3:");
        checkSumSign();
        System.out.println("\nЗадание №4:");
        printColor();
        System.out.println("\nЗадание №5:");
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("_Orange\n_Banana\n_Apple");
    }

    public static void checkSumSign(){
        int a = -20;
        int b = 10;
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 200;
        int b = 5;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

