public class Main {

    public static void main(String[] args)
    {
        Bibliotheque bibliotheque = new Bibliotheque("livres");

        Livre l1 = new Livre("Wow", "ptdr", "Tamere");
        l1.addAuteur(new Auteur("Maxime Gratens"));
        l1.addAuteur(new Auteur("Baptiste Gratens"));

        bibliotheque.addLivre(l1);

        bibliotheque.sauvegarder();
    }
}
