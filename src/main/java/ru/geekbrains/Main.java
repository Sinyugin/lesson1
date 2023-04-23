package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        Person person1 = Person.builder()
                .firstName("Ivan")
                .lastName("Petrov")
                .middleName("Ivanov")
                .country("Russia")
                .address("Aleksandrov")
                .phone("89997776655")
                .age(30)
                .gender("male")
                .build();

        System.out.println(person1.getFirstName());
    }
}