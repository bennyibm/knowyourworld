package businesslighthouse.tech.knowyourworld.model;

import javax.persistence.Entity;

@Entity
public class Province extends Emplacement {

    private int idVilleChefLieu;
    public Province() {
    }

    public Province(int id, int idParent, String nom, int superficie, int budget, int nombreHabitant, String chief, StandardClass.TypeEmplacement typeEmplacement, int idCulture, int idVilleChefLieu) {
        super(id, idParent, nom, superficie, budget, nombreHabitant, chief, typeEmplacement, idCulture);
        this.idVilleChefLieu = idVilleChefLieu;
    }

    public int getIdVilleChefLieu() {
        return idVilleChefLieu;
    }

    public void setIdVilleChefLieu(int idVilleChefLieu) {
        this.idVilleChefLieu = idVilleChefLieu;
    }
}
