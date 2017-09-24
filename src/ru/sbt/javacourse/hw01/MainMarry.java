package ru.sbt.javacourse.hw01;

public class MainMarry {

    public static void main(String[] args) {

        Person perJohn = new Person(true, "John");
        Person perMary = new Person(false, "Mary");
        Person perBill = new Person(true, "Bill");
        Person perSara = new Person(false, "Sara");

        perJohn.marry(perMary);
        perJohn.marry(perBill);
        perJohn.marry(perSara);
        perMary.marry(perSara);
        perMary.marry(perBill);

        perSara.marry(perJohn);
        perSara.marry(perBill);

        perJohn.divorce();
        perBill.divorce();

        perJohn.marry(perMary);
        perJohn.marry(perMary);
    }

}
