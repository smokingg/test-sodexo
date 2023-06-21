package app.registeruser.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.registeruser.apirest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
