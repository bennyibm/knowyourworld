package businesslighthouse.tech.knowyourworld.model;

import javax.persistence.*;

@Entity
public class Pays extends Emplacement {

    private StandardClass.PaysRoyaume formePays;
    private StandardClass.RegimeGouvernemental regime;

    public Pays() {
        super();
    }

    public Pays(int id, int idParent, String nom, int superficie, int budget, int nombreHabitant, String chief, StandardClass.TypeEmplacement typeEmplacement, int idCulture, StandardClass.PaysRoyaume formePays, StandardClass.RegimeGouvernemental regime) {
        super(id, idParent, nom, superficie, budget, nombreHabitant, chief, typeEmplacement, idCulture);
        this.formePays = formePays;
        this.regime = regime;
    }

    public StandardClass.PaysRoyaume getFormePays() {
        return formePays;
    }

    public Pays setFormePays(StandardClass.PaysRoyaume formePays) {
        this.formePays = formePays;
        return this;
    }

    public StandardClass.RegimeGouvernemental getRegime() {
        return regime;
    }

    public Pays setRegime(StandardClass.RegimeGouvernemental regime) {
        this.regime = regime;
        return this;
    }

}
