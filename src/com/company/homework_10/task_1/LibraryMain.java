package com.company.homework_10.task_1;

public class LibraryMain {
    public static void main(String[] args) {
        Library<String, String> reader_1 = new Library<>("Makar", "12345", 1889);
        Library<String, Integer> reader_2 = new Library<>("Valeria", 54321, "The Lord of the Rings");
        showType(reader_1);
        showType(reader_2);
    }

    // Library -> void
    private static Library showType(Library reader) {
        System.out.println("Name: " + reader.getPersonName() + " - " + reader.getPersonName().getClass());
        System.out.println("PersonId: " + reader.getPersonId() + " - " + reader.getPersonId().getClass());
        System.out.println("Book: " + reader.getBook() + " - " + reader.getBook().getClass());
        return reader;
    }
}
