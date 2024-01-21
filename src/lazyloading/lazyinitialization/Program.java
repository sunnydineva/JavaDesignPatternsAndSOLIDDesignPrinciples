package lazyloading.lazyinitialization;

class Program {
    public static void main(String[] args)
    {
        Car.getCarByTypeName(CarType.BMW);
        Car.showAll();
        Car.getCarByTypeName(CarType.Audi);
        Car.showAll();
        Car.getCarByTypeName(CarType.BMW);
        Car.showAll();
    }
}
