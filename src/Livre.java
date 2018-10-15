import java.util.ArrayList;
import java.util.List;

public class Livre {
    private String categorie;
    private String reference;
    private String title;
    private List<Auteur> auteurs;

    public Livre(String categorie, String reference, String title)
    {
        setCategorie(categorie);
        setReference(reference);
        setTitle(title);
        setAuteurs(new ArrayList<>());
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }

    public void addAuteur(Auteur auteur)
    {
        this.auteurs.add(auteur);
    }
}
