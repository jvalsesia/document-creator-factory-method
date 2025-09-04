package org.example.product;

public class WordDocument implements Document {

    @Override
    public void view() {
        System.out.println("Viewing Word document...");
    }

    @Override
    public void print() {
        System.out.println("Printing Word document...");
    }
}
