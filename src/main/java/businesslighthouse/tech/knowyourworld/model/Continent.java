package businesslighthouse.tech.knowyourworld.model;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Continent extends Emplacement{

    private StandardClass.RACE_HOMME raceHomme;

    public Continent() {
    }

    /**
     *
     * @param id l'id unique du continent
     * @param nom le nom du continent que l'on crée
     * @param superficie 'la superficie en Km2
     * @param nombreHabitant 'le nombre des personnes qui reseident dans ce continent
     */
    public Continent(int id, String nom, int superficie, int nombreHabitant, StandardClass.RACE_HOMME raceHomme, int idCulture) {
        super();
        this.setId(id);
        this.setNom(nom);
        this.setSuperficie(superficie);
        this.setNombreHabitant(nombreHabitant);

        this.setIdParent(-1); //pour dire que le cntinent n'a pas de parent
        this.setTypeEmplacement(StandardClass.TypeEmplacement.CONTINENT); // on sait que c'est un continent

        this.raceHomme = raceHomme;
    }

    public StandardClass.RACE_HOMME getRaceHomme() {
        return raceHomme;
    }

    public void setRaceHomme(StandardClass.RACE_HOMME raceHomme) {
        this.raceHomme = raceHomme;
    }
}
