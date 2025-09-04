package org.example.creator;

import org.example.product.Document;
import org.example.product.PdfDocument;
import org.example.product.WordDocument;

public class PdfCreator extends DocumentCreator{


    @Override
    public Document createDocument() {
        return new PdfDocument();
    }

    @Override
    public void openDocument(Document document) {
        System.out.println("Opening a PDF document...");
    }
}
