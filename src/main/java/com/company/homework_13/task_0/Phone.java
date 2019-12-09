package com.company.homework_13.task_0;

import java.util.Objects;

public class Phone {
    private String model;
    private String producer;
    private int price;

    public Phone(String model, String producer, int price) {
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Phone phone = (Phone) o;
        return price == phone.price && Objects.equals(model, phone.model)
                && Objects.equals(producer, phone.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                model,
                producer,
                price);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }
}
