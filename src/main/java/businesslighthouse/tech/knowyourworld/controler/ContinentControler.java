package businesslighthouse.tech.knowyourworld.controler;

import businesslighthouse.tech.knowyourworld.Dao.ContinentDao;
import businesslighthouse.tech.knowyourworld.model.Continent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public class ContinentControler {

    @Autowired
    ContinentDao continent;

    @GetMapping(value = "/continent")
    public List<Continent> toutContinent()
    {
        return this.continent.findAll();
    }

    @GetMapping(value = "/continent/id/{idContinent}")
    public Continent ContinentParId(@PathVariable int idContinent)
    {
        return  this.continent.findById(idContinent);
    }

    @GetMapping(value = "/continent/nom/{nomContinent}")
    public Continent ContinentParNom(@PathVariable String nomContinent)
    {
        return  this.continent.findByNom(nomContinent.toUpperCase());
    }

    @PostMapping(value = "/continent/enregistrer/")
    public boolean enregistrer(@RequestBody Continent Continent)
    {
        Continent.setNom(Continent.getNom().toUpperCase());
        Continent.setChief(Continent.getChief().toUpperCase());
        return this.continent.save(Continent) ;
    }
}
