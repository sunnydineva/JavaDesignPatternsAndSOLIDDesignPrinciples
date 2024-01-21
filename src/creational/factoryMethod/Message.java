package creational.factoryMethod;
/*
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 */

public abstract class Message
{
    public abstract String getContent();

    public void addDefaultHeaders()
    {
        //adds some default headers
    }

    public void encrypt()
    {
        //has some code to encrypt content
    }
}
