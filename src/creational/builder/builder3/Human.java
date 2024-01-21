package creational.builder.builder3;

public class Human
{
    private String firstName;
    private String lastName;
    private Integer age;
    private String job;

    protected Human(String firstName, String lastName, Integer age, String job)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
    }
}
