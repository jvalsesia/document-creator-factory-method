package org.example.product;

public class ExcelDocument implements Document {
    @Override
    public void view() {
        System.out.println("Viewing Excel document...");
    }

    @Override
    public void print() {
        System.out.println("Printing Excel document...");
    }
}
