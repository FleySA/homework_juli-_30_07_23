public class Main {
    public static void main(String[] args) {

        double a = 5.5;
        double b = 10.8;

        System.out.println("Начальные значения:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

                // Обмен значениями
                a = a + b; // 10.8 + 5.5 = 16.3
                b = a - b; // 16.3 - 10.8 = 5.5
                a = a - b; // 16.3 - 5.5 = 10.8

        System.out.println("Значения после обмена:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
            }
        }




