package creational.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have lazy initialization
 * without worrying about synchronization.
 *
 * This class provides the Initialization on demand holder pattern
 */
public class LazyRegistryIODH
{
    private LazyRegistryIODH()
    {
        System.out.println("In LazyRegistryIODH singleton");
    }

    /**
     * Private constructor to prevent instantiation outside of this class.
     * This also prevents inheritance.
     */
    private static class RegistryHolder
    {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    /**
     * This method provides the singleton instance. Note the use of {@link RegistryHolder}.
     */
    public static LazyRegistryIODH getInstance()
    {
        return RegistryHolder.INSTANCE;
    }
}
