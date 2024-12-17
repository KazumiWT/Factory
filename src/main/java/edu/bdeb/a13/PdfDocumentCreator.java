package edu.bdeb.a13;

// Créateur de documents PDF
public class PdfDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
