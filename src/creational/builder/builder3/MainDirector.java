package creational.builder.builder3;

public class MainDirector
{
    Human h8 = new HumanBuilder()
            .withFirstName("Vasil")
            .build();

    Human h9 = new HumanBuilder()
            .withFirstName("Vasil")
            .withLastName("Hristov")
            .build();

    Human h10 = new HumanBuilder()
            .withFirstName("Dora")
            .withLastName("Venkova")
            .withAge(18)
            .build();

    Human h11 = new HumanBuilder()
            .withFirstName("Boro")
            .withLastName("Petrov")
            .withAge(18)
            .withJob("developer")
            .build();
}
