This challenge evaluates a candidate's understanding and implementation of the **Method Factory Pattern**. The goal is to create a simple application for managing different types of digital documents.

### Challenge: Digital Document Management System

#### Objective

Design and implement a system for a digital document management application. This system must handle different document types, such as **PDFs** and **Word documents**, and be easily extensible to support new formats in the future. The core of the challenge is to use the **Method Factory Pattern** to create the correct document objects without exposing the instantiation logic to the client code.

-----

### Core Requirements

1.  **Abstract Document Creator:** Create an abstract class or interface called `DocumentCreator`. This class will declare an abstract method, say `createDocument()`, which returns a `Document` object. This is the **factory method**. `DocumentCreator` should also have a method, such as `openDocument()`, that uses the result of `createDocument()`.

2.  **Concrete Creators:** Implement concrete creator classes for each document type:

    * `PdfCreator`: This class must implement `DocumentCreator` and override the `createDocument()` method to return a `PdfDocument` object.
    * `WordCreator`: This class must implement `DocumentCreator` and override the `createDocument()` method to return a `WordDocument` object.

3.  **Abstract Product:** Define an abstract class or interface called `Document`. This class will declare methods that all document types must implement, such as `view()` and `print()`.

4.  **Concrete Products:** Implement concrete document classes for each type:

    * `PdfDocument`: This class must implement `Document` and provide a specific implementation for the `view()` and `print()` methods (e.g., printing a message like "Viewing a PDF document." or "Printing a PDF document.").
    * `WordDocument`: This class must implement `Document` and provide its own specific implementation for `view()` and `print()` (e.g., "Viewing a Word document." or "Printing a Word document.").

5.  **Client Code:** Write a `main` or client class that demonstrates the usage of the pattern. The client code should not directly instantiate `PdfDocument` or `WordDocument`. Instead, it should use an instance of `PdfCreator` and `WordCreator` to get the desired document objects. The client should be able to call the `openDocument()` method on a `DocumentCreator` instance, and the system should correctly handle the document, regardless of its specific type.

-----

### Example Usage (Pseudo-Code)

```
// Main client class
public class DocumentApp {
    public static void main(String[] args) {
        // Create a PDF creator and open a document
        DocumentCreator pdfCreator = new PdfCreator();
        Document pdfDoc = pdfCreator.createDocument();
        pdfDoc.view(); // Output: Viewing a PDF document.

        // Create a Word creator and open a document
        DocumentCreator wordCreator = new WordCreator();
        Document wordDoc = wordCreator.createDocument();
        wordDoc.print(); // Output: Printing a Word document.
    }
}
```

### Evaluation Criteria

* **Correctness:** The code should compile and execute as described, with the correct output.
* **Design Pattern Implementation:** The solution must correctly apply the **Method Factory Pattern**, with clear separation between creators, products, and client code.
* **Code Quality:** The code should be clean, well-structured, and follow standard coding conventions. The use of meaningful variable and class names is expected.
* **Extensibility:** The design should demonstrate how easy it would be to add a new document type (e.g., an `ExcelDocument` and `ExcelCreator`) without modifying the existing code.

This challenge tests a candidate's ability to not only understand but also effectively apply a key creational design pattern to solve a common software design problem, highlighting their skills in creating flexible and maintainable systems.