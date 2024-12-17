package edu.bdeb.a13;

public class Main {
    public static void main(String[] args) {
        // Créateur pour documents texte
        DocumentCreator textCreator = new TextDocumentCreator();
        textCreator.openDocument(); // Résultat : Ouverture d'un document texte
        textCreator.saveDocument();

        // Créateur pour documents PDF
        DocumentCreator pdfCreator = new PdfDocumentCreator();
        pdfCreator.openDocument();    // Résultat : Ouverture d'un document PDF
        pdfCreator.saveDocument();
    }
}
