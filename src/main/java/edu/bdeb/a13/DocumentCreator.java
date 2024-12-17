package edu.bdeb.a13;

// Créateur : classe abstraite pour la méthode de création
public abstract class DocumentCreator {
    // Factory Method
    public abstract Document createDocument();

    // Méthodes communes à tous les documents
    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }

    public void saveDocument() {
        Document doc = createDocument();
        doc.save();
    }

}

