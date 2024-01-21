package creational.factoryMethod;

/**
 * This is our abstract "creator". The abstract method createMessage() has to be implemented by its subclasses
 */
public abstract class MessageCreator
{
    /**
     * This is called by clients
     * @return a {@link Message}
     */
    public Message getMessage()
    {
        Message msg = createMessage();
        msg.addDefaultHeaders(); //not mandatory
        msg.encrypt();

        return msg;
    }

    /**
     * Factory method
     * Subclasses must provide implementation for this & return a specific Message subclass
     * @return A concrete {@link Message}
     */
    protected abstract Message createMessage();
}
