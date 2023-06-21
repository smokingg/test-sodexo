package app.registeruser.apirest;

import app.registeruser.apirest.model.Favoritos;
import app.registeruser.apirest.repository.FavoritosRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class FavoritosService {
    @Autowired
    private FavoritosRepository favoritesRepository;

    public Favoritos createFavoritos(Favoritos favorites){
        return favoritesRepository.save(favorites);
    }

    public Favoritos getFavoritosById(Long id){
        Optional<Favoritos> optionalFavoritos = favoritesRepository.findById(id);
        return optionalFavoritos.get();
    }
    public List<Favoritos> getAllFavoritos(){
        return favoritesRepository.findAll();
    }

    public void deleteFavoritos(Long id){
    	favoritesRepository.deleteById(id);
    }
}
