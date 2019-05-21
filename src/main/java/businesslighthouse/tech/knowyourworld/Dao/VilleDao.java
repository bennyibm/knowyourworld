package businesslighthouse.tech.knowyourworld.Dao;

import businesslighthouse.tech.knowyourworld.model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VilleDao extends JpaRepository<Ville, Integer> {

    Ville findById(int id);
    Ville findByNom(String nom);
    List<Ville> findBySuperficieGreaterThan(int minSuperficie);
    List<Ville> findBySuperficieLessThan(int maxSuperficie);
    List<Ville> findBySuperficieBetween(int minSuperficie, int maxSuperficie);
    List<Ville> findByNombreHabitantGreaterThan(long minPopulation);
    List<Ville> findByNombreHabitantLessThan(long maxPopulation);
    List<Ville> findByNombreHabitantBetween(long minPopulation, long maxPopulation);
    List<Ville> findByBudgetGreaterThan(long minBudget);
    List<Ville> findByBudgetLessThan(long maxBudget);
    List<Ville> findByBudgetBetween(long minBudget, long maxBudget);
}
