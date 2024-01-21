package lazyloading.lazyinitialization;

import java.util.HashMap;
import java.util.Map;

public class Car
{
    public static Map<CarType, Car> types = new HashMap<>();
    private Car(CarType type)
    {
    }

    public static Car getCarByTypeName(CarType type)
    {
        Car Car;

        if (!types.containsKey(type)) {
            // Lazy initialisation
            Car = new Car(type);
            types.put(type, Car);
        } else {
            // It's available currently
            Car = types.get(type);
        }

        return Car;
    }

    public static Car getCarByTypeNameHighConcurrentVersion(CarType type)
    {
        if (!types.containsKey(type)) {
            synchronized(types)
            {
                // Check again, after having acquired the lock to make sure
                // the instance was not created meanwhile by another thread
                if (!types.containsKey(type)) {
                    // Lazy initialisation
                    types.put(type, new Car(type));
                }
            }
        }
        return types.get(type);
    }

    public static void showAll()
    {
        if (types.size() > 0) {

            System.out.println("Number of instances made = " + types.size());

            for (Map.Entry<CarType, Car> entry : types.entrySet()) {
                String Car = entry.getKey().toString();
                Car = Character.toUpperCase(Car.charAt(0)) + Car.substring(1);
                System.out.println(Car);
            }

            System.out.println();
        }
    }
}
