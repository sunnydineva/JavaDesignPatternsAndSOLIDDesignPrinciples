package structural.decorator.udemy;

import java.util.Base64;

//Decorator. Implements component interface
public class Base64EncodeMessage implements Message
{
    private Message msg; //the concrete component that we need

    public Base64EncodeMessage(Message msg)
    {
        this.msg = msg;
    }

    @Override
    public String getContent()
    {
        //Be wary of charset!! This is platform depend.
        return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
    }
}
