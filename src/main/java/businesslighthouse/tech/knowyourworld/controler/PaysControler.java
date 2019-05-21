package businesslighthouse.tech.knowyourworld.controler;

import businesslighthouse.tech.knowyourworld.Dao.PaysDao;
import businesslighthouse.tech.knowyourworld.model.Pays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaysControler {
    @Autowired
    PaysDao pays;

    @GetMapping(value = "/pays")
    public List<Pays> toutPays()
    {
        return this.pays.findAll();
    }

    @GetMapping(value = "/pays/id/{idPays}")
    public Pays paysParId(@PathVariable int idPays)
    {
        return  this.pays.findById(idPays);
    }

    @GetMapping(value = "/pays/nom/{nomPays}")
    public Pays paysParNom(@PathVariable String nomPays)
    {
        return  this.pays.findByNom(nomPays.toUpperCase());
    }

    @PostMapping(value = "/pays/enregistrer/")
    public boolean enregistrer(@RequestBody Pays pays)
    {
        pays.setNom(pays.getNom().toUpperCase());
        pays.setChief(pays.getChief().toUpperCase());
        return !(this.pays.save(pays) == null);
    }



}
