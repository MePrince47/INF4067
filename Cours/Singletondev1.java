final class Operationmathematique {
    private static Operationmathematique instance = null;

    private int x;
    private int y;
    private int z;

    // Faire passer le constructeur par defaut à privé pour le desactiver
    private Operationmathematique() {
        super();
    }

    private Operationmathematique(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private Operationmathematique(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Methode getinstance pour chaque valeur
    public static Operationmathematique getinstance() {
        if (instance == null) {
            instance = new Operationmathematique();
        }
        return instance;

    }

    public static Operationmathematique getinstance(int x, int y) {
        if (instance == null) {
            instance = new Operationmathematique(x, y);
        }
        return instance;

    }

    public static Operationmathematique getinstance(int x, int y, int z) {
        if (instance == null) {
            instance = new Operationmathematique(x, y, z);
        }
        return instance;

    }

    // les fonctions sommes pour deux
    public int somme(int x, int y) {
        return x + y;
    }

    // les fonctions sommes pour trois
    public int somme(int x, int y, int z) {
        return x + y + z;
    }

    // fonction moyenne pour deux
    public float moyenne(int x, int y) {
        return somme(x, y) / 2;
    }

    // fonction moyenne pour deux
    public float moyenne(int x, int y, int z) {
        return somme(x, y, z) / 3;
    }

    /*
     * // Affichage Pour deux
     * public void affiche() {
     * System.out.println("Calcul pour deux : avec X=" + this.x + "Y=" + this.y);
     * }
     */
    // Affichage Pour trois
    public void affiche() {
        System.out.println("Calcul pour deux : avec X=" + this.x + " Y=" + this.y + " Z=" + this.z);
    }

}

public class Singletondev1 {
    public static void main(String[] Arg) {
        Operationmathematique.getinstance(2, 5).affiche();
        Operationmathematique.getinstance(6, 5).affiche();

    }
}

/*
 * git init
 * git add .
 * git commit -m "cours/Singletondev1.java"
 * git branch -M main
 * git remote add origin https://github.com/MePrince47/INF4067.git
 * git push -u origin main
 */
