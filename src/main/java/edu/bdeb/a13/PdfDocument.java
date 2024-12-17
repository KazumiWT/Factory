package edu.bdeb.a13;

// Document PDF
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Ouverture d'un document PDF");
    }

    @Override
    public void save() {
        System.out.println("Sauvegarde d'un document PDF");
    }

    @Override
    public void close() {
        System.out.println("Fermeture d'un document PDF");
    }
}

