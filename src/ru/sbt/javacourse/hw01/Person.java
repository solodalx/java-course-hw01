package ru.sbt.javacourse.hw01;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
        System.out.println("Welcome, " + name + " (" + (man ? "man": "girl") + ")");
    }

    public boolean isMan() {
        return man;
    }

    public String getName() {
        return name;
    }

    public Person getSpouse() {
        return spouse;
    }

    public boolean isMarried() {
        return spouse != null;
    }

    public boolean areSameGender(Person person) {
        return man == person.man;
    }

    public boolean areTogether(Person person) {
        return spouse != null && spouse == person && this == person.spouse;
    }

    public boolean marry(Person person) {
        if (areSameGender(person)) {
            System.out.println(name + " and " + person.name + " are trying to marry?... No, no, no!");
            return false;
        }
        if (areTogether(person)) {
            System.out.println(name + " and " + person.name + " have already been married");
            return false;
        }
        // If married then devorce, for both
        if (person.isMarried()) {
            person.divorce();
        }
        if (isMarried()) {
            divorce();
        }
        // Marry
        person.spouse = this;
        spouse = person;

        System.out.println(name + " and " + person.name + " have just got married");
        return true;
    }

    public boolean divorce() {
        if (spouse != null) {
            System.out.println(name + " and " + spouse.name + " divorced");

            spouse.divorceSpouse(this);
            spouse = null;
            return true;
        }
        return false;
    }

    private boolean divorceSpouse(Person person) {
        if (spouse == person) {
            spouse = null;
            return true;
        }
        return false;
    }
}
