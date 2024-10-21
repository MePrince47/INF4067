public abstract class produitB { // Classe publique
    public abstract void methodeA();
}

class produitB1 extends produitB {
    public void methodeA() {
        System.out.println("Je suis B1");
    }
}

class produitB2 extends produitB {
    public void methodeA() {
        System.out.println("Je suis B2");
    }
}
