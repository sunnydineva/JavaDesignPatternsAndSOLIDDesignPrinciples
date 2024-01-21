package creational.singleton;

/**
 * Since Java 1.5 using enum we can create singleton. It handles serialization using java's in-build
 * mechanism and still ensure single instance
 */
public enum RegistryEnum
{
    INSTANCE;

    public void getConfiguration()
    {
        //Do actual work here
    }
}
