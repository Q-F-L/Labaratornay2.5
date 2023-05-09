/*
 * Интерфейс для вывода/назначения информации о максимальном перевозимом всесе авто
 */
public interface CargoTransportation {
    /*
     * Вывести можно использовать для перевозки грузов
     */
    public abstract double getCanBeUsedForCargoTransportation();

    /*
     * Назначить можно использовать для перевозки грузов
     */
    public abstract void setCanBeUsedForCargoTransportation(double canBeUsedForCargoTransportation);
}
