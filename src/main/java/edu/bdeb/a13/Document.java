package edu.bdeb.a13;

// Produit commun : tous les documents doivent implémenter cette interface
public interface Document {
    void open();
    void save();
    void close();
}

