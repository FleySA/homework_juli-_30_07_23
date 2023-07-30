public class Main {
    public static void main(String[] args) {

    EvenNumbers evenNumbers = new EvenNumbers();
        System.out.println("Число  : " + evenNumbers.a);
        System.out.println("Остаток от деления по модулю = " + evenNumbers.b);

        int evenNumbers1 = evenNumbers.getB();
        System.out.println("Число четное, если остаток от деления по модулю = " + evenNumbers1);

        int evenNumbers2 = evenNumbers.getC();
        System.out.println("Число не четное,если остаток от деления по модулю = " + evenNumbers2);




    }
}