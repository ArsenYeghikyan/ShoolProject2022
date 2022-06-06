package school.people;

import school.people.Employee;

import static school.subjects.Position.PRINCIPAL;

public final class Principal extends Employee {


    public Principal(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, PRINCIPAL, salary, experience);
    }
}
