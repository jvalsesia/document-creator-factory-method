package org.example.creator;

import org.example.product.Document;
import org.example.product.PdfDocument;
import org.example.product.WordDocument;

public abstract class DocumentCreator {
    public abstract Document createDocument();
    public abstract void openDocument(Document document);

}
