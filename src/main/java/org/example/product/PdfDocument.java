package org.example.product;

public class PdfDocument implements Document{
    @Override
    public void view() {
        System.out.println("Viewing PDF document...");
    }

    @Override
    public void print() {
        System.out.println("Printing PDF document...");
    }
}
