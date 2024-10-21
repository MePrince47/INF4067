public class Main {
    public static void main(String[] args) {
        // Appel au Singleton avec deux valeurs
        OperationMathematique.getInstance(2, 5).affiche();

        // Appel au Singleton avec d'autres valeurs, mais cela ne change rien
        // car l'instance est déjà créée et ne peut pas être modifiée
        OperationMathematique.getInstance(6, 5).affiche();
    }
}
