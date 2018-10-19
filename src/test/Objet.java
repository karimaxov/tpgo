package test;

/**
 * Created by Karim on 17/10/2018.
 */
public class Objet {
    private String name;
    private int cout;
    private int poids;

    public Objet(String name, int cout, int poids) {
        this.name = name;
        this.cout = cout;
        this.poids = poids;
    }

    public String getName() {
        return name;
    }

    public int getCout() {
        return cout;
    }

    public int getPoids() {
        return poids;
    }
}
