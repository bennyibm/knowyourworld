package businesslighthouse.tech.knowyourworld.Dao;

import businesslighthouse.tech.knowyourworld.model.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaysDao extends JpaRepository<Pays, Integer> {

    Pays findById(int id);
    Pays findByNom(String nom);
    List<Pays> findBySuperficieGreaterThan(int minSuperficie);
    List<Pays> findBySuperficieLessThan(int maxSuperficie);
    List<Pays> findBySuperficieBetween(int minSuperficie, int maxSuperficie);
    List<Pays> findByNombreHabitantGreaterThan(long minPopulation);
    List<Pays> findByNombreHabitantLessThan(long maxPopulation);
    List<Pays> findByNombreHabitantBetween(long minPopulation, long maxPopulation);
    List<Pays> findByBudgetGreaterThan(long minBudget);
    List<Pays> findByBudgetLessThan(long maxBudget);
    List<Pays> findByBudgetBetween(long minBudget, long maxBudget);
}
