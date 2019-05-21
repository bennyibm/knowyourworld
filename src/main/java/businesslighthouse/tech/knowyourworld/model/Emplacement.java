package businesslighthouse.tech.knowyourworld.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * A basic and standard place where population can live
 */
@MappedSuperclass
public abstract class Emplacement {

    @Id
    private int id;

    private int idParent;

    private String nom;

    private int superficie;

    private int budget;

    //@Column(name = "population")
    private int nombreHabitant;

    private String chief;
    private StandardClass.TypeEmplacement typeEmplacement;
    private StandardClass.ChiefAppalation titreChef;

    private int idCulture;

    public Emplacement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCulture() {
        return idCulture;
    }

    public void setIdCulture(int idCulture) {
        this.idCulture = idCulture;
    }

    public int getIdParent() {
        return idParent;
    }

    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }

    public Emplacement(int id, int idParent, String nom, int superficie, int budget, int nombreHabitant, String chief, StandardClass.TypeEmplacement typeEmplacement, int idCulture) {
        this.id = id;
        this.idParent = idParent;
        this.nom = nom;
        this.superficie = superficie;
        this.budget = budget;
        this.nombreHabitant = nombreHabitant;
        this.chief = chief;
        this.typeEmplacement = typeEmplacement;
        this.idCulture = idCulture;
        setTitreChief();
    }

    private void setTitreChief()
    {
        StandardClass.ChiefAppalation response = null;

        switch(this.getTypeEmplacement())
        {
            case VILLE:
                response = StandardClass.ChiefAppalation.MAIRE;
                break;
            case PROVINCE:
                response = StandardClass.ChiefAppalation.GOUVERNEUR;
                break;
            case PAYS:
                response = StandardClass.ChiefAppalation.AUTRES;
                break;
        }

        this.titreChef = response;
    }

    protected  void setTitreChief(StandardClass.ChiefAppalation titreChef)
    {
        this.titreChef = titreChef;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public long getNombreHabitant() {
        return nombreHabitant;
    }

    public void setNombreHabitant(int nombreHabitant) {
        this.nombreHabitant = nombreHabitant;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public StandardClass.TypeEmplacement getTypeEmplacement() {
        return typeEmplacement;
    }

    public void setTypeEmplacement(StandardClass.TypeEmplacement typeEmplacement) {
        this.typeEmplacement = typeEmplacement;
    }

    public StandardClass.ChiefAppalation getChiefAppalation()
    {
        return this.titreChef;
    }

}
