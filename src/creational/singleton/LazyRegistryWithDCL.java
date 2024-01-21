package creational.singleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking the volatile key is guaranteed to work only after JVMs starting with version 1.5 and later.
 */
public class LazyRegistryWithDCL
{
    /**
     * Private constructor to prevent instantiation outside this class and prevent subclassing
     */
    private LazyRegistryWithDCL()
    {

    }

    /**
     * THE instance. Note the use of volatile.
     */
    private static volatile LazyRegistryWithDCL INSTANCE;

    /**
     * This method implements the double check locking
     * @return Instance of {@link LazyRegistryWithDCL}
     */

    public static LazyRegistryWithDCL getInstance()
    {
        if(INSTANCE == null) //if it's not created yet
        {
            //if two thread call this method we will end up creating 2 instances
            synchronized (LazyRegistryWithDCL.class)
            {
                // Double check locking
                //it may happen that 2 threads might call getInstance() and both will see it's null.
                // Using synchronized, one of the threads is going to get the lock and start executing the code inside synchronized
                // The second thread is going to wait on this line "    synchronized (LazyRegistryWithDCL.class)"
                // if we simply INSTANCE = new LazyRegistryWithDCL() - the second will wait, then create another INSTANCE
                // to avoid that, we will do the null check once again
                if(INSTANCE == null)
                {
                    INSTANCE =  new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }


}
