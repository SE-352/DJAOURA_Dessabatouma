public class App {
    public static void main(String[] args) throws Exception {
        Joueur joueur1 = new Joueur("MIKE", "Ross", "Mk10123", 72);
        Joueur joueur2 = new Joueur("KAMBI0", "Irenna", "Kam456", 50);

        JoueurJDBC jjdc = new JoueurJDBC();

        jjdc.add(joueur1);
        jjdc.add(joueur2);

        jjdc.findAll();
    }
}
