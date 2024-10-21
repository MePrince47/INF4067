public final class OperationMathematique {
    private static OperationMathematique instance = null;

    private int x;
    private int y;
    private int z;

    // Le constructeur par défaut est privé pour empêcher l'instanciation directe
    private OperationMathematique() {
        super();
    }

    private OperationMathematique(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private OperationMathematique(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Méthodes pour obtenir l'instance du Singleton
    public static OperationMathematique getInstance() {
        if (instance == null) {
            instance = new OperationMathematique();
        }
        return instance;
    }

    public static OperationMathematique getInstance(int x, int y) {
        if (instance == null) {
            instance = new OperationMathematique(x, y);
        }
        return instance;
    }

    public static OperationMathematique getInstance(int x, int y, int z) {
        if (instance == null) {
            instance = new OperationMathematique(x, y, z);
        }
        return instance;
    }

    // Méthode pour la somme de deux nombres
    public int somme(int x, int y) {
        return x + y;
    }

    // Méthode pour la somme de trois nombres
    public int somme(int x, int y, int z) {
        return x + y + z;
    }

    // Méthode pour la moyenne de deux nombres
    public float moyenne(int x, int y) {
        return somme(x, y) / 2;
    }

    // Méthode pour la moyenne de trois nombres
    public float moyenne(int x, int y, int z) {
        return somme(x, y, z) / 3;
    }

    // Méthode pour l'affichage des valeurs
    public void affiche() {
        System.out.println("Calcul : avec X=" + this.x + " Y=" + this.y + " Z=" + this.z);
    }
}
