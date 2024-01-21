package creational.singleton;

/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry
{
    /**
     * The single instance. Eagerly initialized singleton
     */
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    /** By making constructor private, we prevent object instantiation outside of this class
     * & this also prevent inheritance
     */

    private EagerRegistry()
    {
    }

    /**
     * This method returns the singleton instance to outside world.
     */
    public static EagerRegistry getInstance()
    {
        return INSTANCE;
    }
}
