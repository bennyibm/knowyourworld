package businesslighthouse.tech.knowyourworld.controler;


import businesslighthouse.tech.knowyourworld.Dao.ProvinceDao;
import businesslighthouse.tech.knowyourworld.model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ProvinceControler {

    @Autowired
    ProvinceDao province;

    @GetMapping(value = "/Province")
    public List<Province> toutProvince()
    {
        return this.province.findAll();
    }

    @GetMapping(value = "/Province/id/{idProvince}")
    public Province ProvinceParId(@PathVariable int idProvince)
    {
        return  this.province.findById(idProvince);
    }

    @GetMapping(value = "/Province/nom/{nomProvince}")
    public Province ProvinceParNom(@PathVariable String nomProvince)
    {
        return  this.province.findByNom(nomProvince.toUpperCase());
    }

    @PostMapping(value = "/Province/enregistrer/")
    public boolean enregistrer(@RequestBody Province Province)
    {
        Province.setNom(Province.getNom().toUpperCase());
        Province.setChief(Province.getChief().toUpperCase());
        return !(this.province.save(Province) == null);
    }
}
