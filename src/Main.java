public class Main {
    public static void main(String[] args) {
        //Задание 1: создание массивов

        int[] arrayInt = new int[]{1, 2, 3};

        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};

        char[] arrayChar = new char[]{'M', 'a', 's', 'h', 'a'};

        //Задание 2: Вывод на экран
        System.out.println("Прямой порядок элементов массивов");
        for (int i = 0; i < arrayInt.length; i++) {
            if (i==arrayInt.length-1){
                System.out.println(arrayInt[i]);
            }
            else {
                System.out.print(arrayInt[i]+", ");
            }
        }

        for (int i = 0; i < arrayDouble.length; i++) {
            if (i==arrayDouble.length-1){
                System.out.println(arrayDouble[i]);
            }
            else {
                System.out.print(arrayDouble[i]+", ");
            }
        }

        for (int i = 0; i < arrayChar.length; i++) {
            if (i==arrayChar.length-1){
                System.out.println(arrayChar[i]);
            }
            else {
                System.out.print(arrayChar[i]+", ");
            }
        }
        //Задание 3: Вывод н экран в обратном порядке
        System.out.println("Обратный порядок элементов массивов");
        for (int i = arrayInt.length-1; i >=0; i--) {
            if (i==0){
                System.out.println(arrayInt[i]);
            }
            else {
                System.out.print(arrayInt[i]+", ");
            }
        }

        for (int i = arrayDouble.length-1; i >=0; i--) {
            if (i==0){
                System.out.println(arrayDouble[i]);
            }
            else {
                System.out.print(arrayDouble[i]+", ");
            }
        }

        for (int i = arrayChar.length-1; i >=0; i--) {
            if (i==0){
                System.out.println(arrayChar[i]);
            }
            else {
                System.out.print(arrayChar[i]+", ");
            }
        }
        //Задание 4: Сделать все нечетные числа четными
        System.out.println("Замена нечетных на четные в первом массиве");
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i]%2==1){
                arrayInt[i]++;
            }
        }
        for (int i = 0; i < arrayInt.length; i++) {
            if (i==arrayInt.length-1){
                System.out.println(arrayInt[i]);
            }
            else {
                System.out.print(arrayInt[i]+", ");
            }
        }
    }
}