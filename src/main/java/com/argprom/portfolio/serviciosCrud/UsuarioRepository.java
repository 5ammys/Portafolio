package com.argprom.portfolio.serviciosCrud;

import com.argprom.portfolio.models.Usuario;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UsuarioRepository extends Repository<Usuario,Long> {
    List<Usuario>findAll();
    Usuario findOne(Long id);
    Usuario save(Usuario user);
    Usuario update(Long id);
    void delete(Usuario user);

}
