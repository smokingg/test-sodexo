package app.registeruser.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.registeruser.apirest.model.Favoritos;

public interface FavoritosRepository extends JpaRepository<Favoritos,Long>{

}
