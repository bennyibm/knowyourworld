package businesslighthouse.tech.knowyourworld.controler;

import businesslighthouse.tech.knowyourworld.Dao.VilleDao;
import businesslighthouse.tech.knowyourworld.model.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VilleControler {

    @Autowired
    VilleDao villes;

    @GetMapping(value = "/Ville")
    public List<Ville> toutVille()
    {
        return this.villes.findAll();
    }

    @GetMapping(value = "/Ville/id/{idVille}")
    public Ville VilleParId(@PathVariable int idVille)
    {
        return  this.villes.findById(idVille);
    }

    @GetMapping(value = "/Ville/nom/{nomVille}")
    public Ville VilleParNom(@PathVariable String nomVille)
    {
        return  this.villes.findByNom(nomVille.toUpperCase());
    }

    @PostMapping(value = "/Ville/enregistrer/")
    public boolean enregistrer(@RequestBody Ville Ville)
    {
        Ville.setNom(Ville.getNom().toUpperCase());
        Ville.setChief(Ville.getChief().toUpperCase());
        return !(this.villes.save(Ville) == null);
    }
}
