package businesslighthouse.tech.knowyourworld.model;

import javax.persistence.*;

public class StandardClass {

    @Entity
    public class Culture {

        @Id
        private  long id;

        private String nomCulture;
        @Column
        private String langue;
        @Column
        private StyleMusique musique;
        @Column
        private Alimentation alimentation;

        public Culture() {
        }

        public Culture(long id,String nomCulture, String langue, StyleMusique musique, Alimentation alimentation) {
            this.id = id;
            this.nomCulture = nomCulture;
            this.langue = langue;
            this.musique = musique;
            this.alimentation = alimentation;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNomCulture() {
            return nomCulture;
        }

        public void setNomCulture(String nomCulture) {
            this.nomCulture = nomCulture;
        }

        public StyleMusique getMusique() {
            return musique;
        }

        public void setMusique(StyleMusique musique) {
            this.musique = musique;
        }

        public Alimentation getAlimentation() {
            return alimentation;
        }

        public void setAlimentation(Alimentation alimentation) {
            this.alimentation = alimentation;
        }

        public String getLangue() {
            return langue;
        }

        public void setLangue(String langue) {
            this.langue = langue;
        }

       /* /**
         *
         * @return envoi la liste complete de toute les langues parlées dans cette culture
        @Override
        public String toString() {
            StringBuilder toutLangue = new StringBuilder();
            toutLangue.append("Culture{langues parlées = [");
            for (String langue : this.getLanguage()) {
                toutLangue.append(langue);
                toutLangue.append(" | ");
            }

            //o supprime le dernier caractère de séparartion inséré |
            toutLangue.deleteCharAt(toutLangue.length()-1);

            toutLangue.append("]\n");

            //on commence avec la partie
            toutLangue.append("langue principale = ");

            //on ajoute la langue préférée
            toutLangue.append(this.getLanguePrincipal());

            //on return la description
            return toutLangue.toString();
        }*/
    }

    public enum ChiefAppalation
    {
        MAIRE,
        GOUVERNEUR,
        PRESIDENT,
        ROI_REINE,
        CHANCELIER,
        AUTRES;
    }

    public enum TypeEmplacement
    {
        VILLAGE,
        TERRITOIRE,
        VILLE,
        PROVINCE,
        PAYS,
        CONTINENT
    }

    public enum RACE_HOMME
    {
        BLANC("EUROPEEN, AMERCAIN, OCEANIE"),
        COULEUR_NOIRE("AFRICAIN"),
        COULEUR_JAUNE("ASIATIQUE"),
        COULEUR_ROUGE("INDIEN");


        RACE_HOMME(String texte) {

        }
    }

    public enum StyleMusique
    {
        REGAE,
        RUMBA,
        COUPE_DECALE,
        SALSA,
        LONGITIMA,
        SAMBO,
        AUTRES
    }

    public enum Alimentation
    {
        SEC ("Poison salé et chikwang"),
        COMPLET("Alimentation bien saine et compléte"),
        AUTRES("je ne sais pas du tout");

        private String nom;

        Alimentation(String nom)
        {
            this.nom = nom;
        }

        public String getNom(){
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        @Override
        public String toString() {
            return "Alimentation{" +
                    "nom='" + nom + '\'' +
                    '}';
        }
    }

    public  enum RegimeGouvernemental
    {
        PRESIDENTIEL, SEMI_PRESIDENTIEL,AUTRES
    }

    public enum PaysRoyaume
    {
        PAYS, ROYAUME
    }


}


