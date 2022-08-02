package com.argprom.portfolio.serviciosCrud;

import com.argprom.portfolio.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioImplement implements UsuarioService{

    @Autowired
    private UsuarioRepository repositorioUser;

    @Override
    public List<Usuario> getUsuario() {
        return repositorioUser.findAll();
    }

    @Override
    public Usuario getUsuarioById(Long id) {
        return repositorioUser.findOne(id);
    }

    @Override
    public Usuario createUsuario(Usuario user) {
        return repositorioUser.save(user);
    }

    @Override
    public Usuario updateUsuario(Usuario user) {
        return null;
    }

    @Override
    public void deleteUsuarioById(Long id) {
    }
}
