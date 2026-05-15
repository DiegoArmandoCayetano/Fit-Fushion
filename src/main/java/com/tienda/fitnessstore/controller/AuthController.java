package com.tienda.fitnessstore.controller;

import com.tienda.fitnessstore.model.dto.LoginDTO;
import com.tienda.fitnessstore.model.dto.RegistroUsuarioDTO;
import com.tienda.fitnessstore.model.entity.Usuario;
import com.tienda.fitnessstore.service.interfaces.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.tienda.fitnessstore.model.dto.LoginDTO;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UsuarioService usuarioService;

    @PostMapping("/register")
    public Usuario registrar(@RequestBody RegistroUsuarioDTO dto) {
        return usuarioService.registrarUsuario(dto);
    }
    @PostMapping("/login")
    public Usuario login(@RequestBody LoginDTO dto) {
        return usuarioService.login(dto);
    }

}