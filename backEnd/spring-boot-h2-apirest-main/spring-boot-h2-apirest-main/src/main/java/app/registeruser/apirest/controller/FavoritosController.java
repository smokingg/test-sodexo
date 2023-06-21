package app.registeruser.apirest.controller;

import app.registeruser.apirest.FavoritosService;
import app.registeruser.apirest.model.Favoritos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/favorites")
@CrossOrigin(origins = "http://localhost:4200")
public class FavoritosController {

    @Autowired
    private FavoritosService favoritosrService;

    @PostMapping
    public Favoritos createFavoritos(@RequestBody Favoritos favoritos){
        return favoritosrService.createFavoritos(favoritos);
    }

    @GetMapping
    public List<Favoritos> getAllUsers(){
        return favoritosrService.getAllFavoritos();
    }

    @GetMapping("{id}")
    public Favoritos searchFavoritosById(@PathVariable("id") Long id){
        return favoritosrService.getFavoritosById(id);
    }
    @DeleteMapping("{id}")
    public void deleteFavoritosById(@PathVariable("id") Long id){
    	favoritosrService.deleteFavoritos(id);
    }

}
