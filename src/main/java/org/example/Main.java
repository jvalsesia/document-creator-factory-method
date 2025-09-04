package org.example;

import org.example.creator.DocumentCreator;
import org.example.creator.ExcelCreator;
import org.example.creator.PdfCreator;
import org.example.creator.WordCreator;
import org.example.product.Document;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DocumentCreator pdfCreator = new PdfCreator();
        Document pdfDoc = pdfCreator.createDocument();
        pdfCreator.openDocument(pdfDoc);
        pdfDoc.view(); // Output: Viewing a PDF document.
        pdfDoc.print();

        DocumentCreator wordCreator = new WordCreator();
        Document wordDoc = wordCreator.createDocument();
        wordCreator.openDocument(wordDoc);
        wordDoc.view();
        wordDoc.print();
        
        DocumentCreator excelCreator = new ExcelCreator();
        Document excelDoc = excelCreator.createDocument();
        excelCreator.openDocument(excelDoc);
        excelDoc.view();
        excelDoc.print();
    }
}