package com.argprom.portfolio.serviciosCrud;

import com.argprom.portfolio.models.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario>getUsuario();
    Usuario getUsuarioById(Long id);
    Usuario createUsuario(Usuario user);
    Usuario updateUsuario(Usuario user);
    void deleteUsuarioById(Long id);
}
