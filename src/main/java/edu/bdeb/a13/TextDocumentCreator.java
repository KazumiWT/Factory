package edu.bdeb.a13;

// Créateur de documents texte
public class TextDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
