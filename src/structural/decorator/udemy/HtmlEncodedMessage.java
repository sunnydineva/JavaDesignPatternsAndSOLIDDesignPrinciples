package structural.decorator.udemy;

import org.apache.commons.lang3.StringEscapeUtils;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message
{
    private Message msg; //the concrete component that we need

    public HtmlEncodedMessage(Message msg)
    {
        this.msg = msg;
    }

    @Override
    public String getContent()
    {
        return StringEscapeUtils.escapeHtml4(msg.getContent());
    }
}
