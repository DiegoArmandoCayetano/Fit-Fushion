package com.tienda.fitnessstore.service.interfaces;

import com.tienda.fitnessstore.model.dto.LoginDTO;
import com.tienda.fitnessstore.model.dto.RegistroUsuarioDTO;
import com.tienda.fitnessstore.model.entity.Usuario;

public interface UsuarioService {

    Usuario registrarUsuario(RegistroUsuarioDTO dto);

    Usuario login(LoginDTO dto);
    
}