package com.company.homework_10.task_1;

public class Library<S, T> {
    private S personName;
    private T personId;

    private String book;

    public <D> Library(S personName, T personId, D book) {
        this.personName = personName;
        this.personId = personId;
        this.book = book.toString();
    }

    public S getPersonName() {
        return personName;
    }

    public void setPersonName(S personName) {
        this.personName = personName;
    }

    public T getPersonId() {
        return personId;
    }

    public void setPersonId(T personId) {
        this.personId = personId;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Library{" +
                "personName=" + personName +
                ", personId=" + personId +
                ", book='" + book + '\'' +
                '}';
    }
}
