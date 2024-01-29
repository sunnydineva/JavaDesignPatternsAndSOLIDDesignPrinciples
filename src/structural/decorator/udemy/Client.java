package structural.decorator.udemy;

public class Client
{
    public static void main(String[] args)
    {
        Message m = new TextMessage("The <FORCE> is strong with this one");
        System.out.println(m.getContent());

        //Wrap message in decorator
        Message decorator = new HtmlEncodedMessage(m);
        System.out.println("DECORATED HTML msg: " + decorator.getContent());

        //Wrap message in another decorator
        decorator = new Base64EncodeMessage(m);
        System.out.println("DECORATED Base64 msg: " + decorator.getContent());

        //Wrap decorator in another decorator
        decorator = new Base64EncodeMessage(decorator);
        System.out.println("DECORATED_2 Base64 msg: " + decorator.getContent());
    }
}
