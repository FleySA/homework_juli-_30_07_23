public class Main {
    public static void main(String[] args) {
        WorldState worldState = new WorldState();


        boolean isNegativelyGood = worldState.isWorldNegativelyGood(); // вызов метода негативного состояния
        System.out.println("Состояние мира негативно? : " + isNegativelyGood);

        boolean isPositivelyGood = worldState.isWorldPositivelyGood(); // вызов метода позитивного состоян
        System.out.println("Состояние мира позитивно? : " + isPositivelyGood);
    }


}
