public class WorldState {
    public boolean isWater = true; //  есть ли вода
    public boolean isRaining = false; // не идет ли дождь
    public boolean isSunny = true; // Солнечно
    public boolean hasElectricity = true; // есть ли электричество
    public boolean isPeaceful = true; // мир или война
    public boolean isPolluted = false; // false, если окружающая среда загрязнена; true, если нет.
    public boolean isPandemic  = false; // false,эпидемия; true, если нет.

    //  негативное состояние мира
    public boolean isWorldNegativelyGood() {
        // если день и
        return !isPeaceful || !hasElectricity && (!isSunny || isRaining || isPolluted || !isPandemic || !isWater);
    }
    //позитивное состояние мира
    public boolean isWorldPositivelyGood() {
        return isSunny && hasElectricity && isPeaceful && !isPolluted && !isPandemic  && isWater;
    }
}

