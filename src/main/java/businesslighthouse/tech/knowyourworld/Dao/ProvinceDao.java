package businesslighthouse.tech.knowyourworld.Dao;

import businesslighthouse.tech.knowyourworld.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceDao extends JpaRepository<Province, Integer> {
    Province findById(int id);
    Province findByNom(String nom);
    List<Province> findBySuperficieGreaterThan(int minSuperficie);
    List<Province> findBySuperficieLessThan(int maxSuperficie);
    List<Province> findBySuperficieBetween(int minSuperficie, int maxSuperficie);
    List<Province> findByNombreHabitantGreaterThan(long minPopulation);
    List<Province> findByNombreHabitantLessThan(long maxPopulation);
    List<Province> findByNombreHabitantBetween(long minPopulation, long maxPopulation);
    List<Province> findByBudgetGreaterThan(long minBudget);
    List<Province> findByBudgetLessThan(long maxBudget);
    List<Province> findByBudgetBetween(long minBudget, long maxBudget);
}
