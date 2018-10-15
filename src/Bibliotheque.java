import java.io.*;
import java.util.List;
import java.util.ListIterator;

import org.jdom2.*;
import org.jdom2.output.*;

public class Bibliotheque {

    private Element racine;

    private Document document;

    public Bibliotheque(String racine)
    {
        this.racine = new Element(racine);
        this.document = new Document(this.racine);
    }

    public void addLivre(Livre livre)
    {
        Element livre_element = new Element("livre");
        racine.addContent(livre_element);

        Attribute categorie = new Attribute("categorie", livre.getCategorie());
        livre_element.setAttribute(categorie);

        Element reference = new Element("reference");
        reference.setText(livre.getReference());
        livre_element.addContent(reference);

        Element titre = new Element("titre");
        titre.setText(livre.getTitle());
        livre_element.addContent(titre);

        Element auteurs = new Element("auteurs");
        livre_element.addContent(auteurs);

        List<Auteur> list_auteurs = livre.getAuteurs();
        ListIterator<Auteur> it = list_auteurs.listIterator();

        while(it.hasNext())
        {
            Auteur auteur = it.next();
            Element nom = new Element("nom");
            nom.setText(auteur.getNom());
            auteurs.addContent(nom);
        }

    }

    public void sauvegarder()
    {
        try {
            XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
            sortie.output(document, new FileOutputStream("bilbio.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
