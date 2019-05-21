package businesslighthouse.tech.knowyourworld.model;

import javax.persistence.Entity;

@Entity
public class Ville extends Emplacement {

    private  int truc;
    public Ville() {
    }

    public Ville(int id, int idParent, String nom, int superficie, int budget, int nombreHabitant, String chief, StandardClass.TypeEmplacement typeEmplacement, int idCulture, int truc) {
        super(id, idParent, nom, superficie, budget, nombreHabitant, chief, typeEmplacement, idCulture);
        this.truc = truc;
    }

    public int getTruc() {
        return truc;
    }

    public void setTruc(int truc) {
        this.truc = truc;
    }
}
