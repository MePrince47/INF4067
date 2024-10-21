public abstract class produitA { // Classe publique
    public abstract void methodeA();
}

class produitA1 extends produitA {
    public void methodeA() {
        System.out.println("Je suis A1");
    }
}

class produitA2 extends produitA {
    public void methodeA() {
        System.out.println("Je suis A2");
    }
}
