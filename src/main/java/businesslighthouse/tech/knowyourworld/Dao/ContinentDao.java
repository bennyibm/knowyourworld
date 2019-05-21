package businesslighthouse.tech.knowyourworld.Dao;

import businesslighthouse.tech.knowyourworld.model.Continent;
import businesslighthouse.tech.knowyourworld.model.Continent;
import businesslighthouse.tech.knowyourworld.model.StandardClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContinentDao {

    /*
    Continent findById(int id);
    Continent findByNom(String nom);
    List<Continent> findBySuperficieGreaterThan(int minSuperficie);
    List<Continent> findBySuperficieLessThan(int maxSuperficie);
    List<Continent> findBySuperficieBetween(int minSuperficie, int maxSuperficie);
    List<Continent> findByNombreHabitantGreaterThan(long minPopulation);
    List<Continent> findByNombreHabitantLessThan(long maxPopulation);
    List<Continent> findByNombreHabitantBetween(long minPopulation, long maxPopulation);
     */

    private static   List<Continent> continents =new ArrayList<>();
    static
    {
        Continent afrique = new Continent(1, "Afrique", 1000, 3000000, StandardClass.RACE_HOMME.COULEUR_NOIRE, /*culture*/ 1);
        Continent amerique = new Continent(2, "Amérique", 1000, 3000000, StandardClass.RACE_HOMME.BLANC, 1);
        Continent europe = new Continent(3, "Europe", 1000,3000000, StandardClass.RACE_HOMME.BLANC, 2);
        Continent asie = new Continent(4, "Asie", 1000,3000000, StandardClass.RACE_HOMME.COULEUR_JAUNE , 1);
        Continent oceanie = new Continent(5, "Océanie", 3000000, 3000000, StandardClass.RACE_HOMME.BLANC, 1);

        continents.add(afrique);
        continents.add(amerique);
        continents.add(europe);
        continents.add(asie );
        continents.add(oceanie);
    }

    public  List<Continent> findAll()
    {
        return continents;
    }

    public List<Continent> findBySuperfieiGreaterThan(int superficieMin)
    {
        return  null;
    }

    public List<Continent> findBySuperficieLessThan(int superficieMax)
    {
        return null;
    }

    public List<Continent> findBySuperficieBetween(int superficieMin, int superficieMax)
    {
        return null;
    }

    public Continent findById(int idContinent)
    {
        return null;
    }

    public Continent findByNom(String nomContinent)
    {
        return null;
    }

    public boolean save(Continent continent) {
       return continents.add(continent);
    }
}
