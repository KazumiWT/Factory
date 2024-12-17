package edu.bdeb.a13;

// Document texte
public class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Ouverture d'un document texte");
    }

    @Override
    public void save() {
        System.out.println("Sauvegarde d'un document texte");
    }

    @Override
    public void close() {
        System.out.println("Fermeture d'un document texte");
    }
}


