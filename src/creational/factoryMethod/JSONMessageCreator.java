package creational.factoryMethod;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator
{
    @Override
    public Message createMessage()
    {
        return new JSONMessage();
    }
}
