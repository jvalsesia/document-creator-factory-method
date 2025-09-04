package org.example.creator;

import org.example.product.Document;
import org.example.product.WordDocument;

public class WordCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }

    @Override
    public void openDocument(Document document) {
        System.out.println("Opening a Word document...");
    }
}
