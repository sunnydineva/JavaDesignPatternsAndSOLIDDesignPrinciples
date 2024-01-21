package creational.factoryMethod;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator
{
    @Override
    public Message createMessage()
    {
        return new TextMessage();
    }
}
