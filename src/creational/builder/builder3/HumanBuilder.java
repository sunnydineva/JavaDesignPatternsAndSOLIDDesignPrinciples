package creational.builder.builder3;

public class HumanBuilder
{
    private String firstName;
    private String lastName;
    private Integer age;
    private String job;

    private Human human;

    public HumanBuilder withFirstName(String fname)
    {
        this.firstName = fname;
        return this;
    }

    public HumanBuilder withLastName(String lname)
    {
        this.lastName = lname;
        return this;
    }

    public HumanBuilder withAge(Integer age)
    {
        this.age = age;
        return this;
    }

    public HumanBuilder withJob(String job)
    {
        this.job = job;
        return this;
    }

    public Human build()
    {
        human = new Human(this.firstName, this.lastName, this.age, this.job);
        return human;
    }

    public Human getUserDTO()
    {
        return human;
    }
}
