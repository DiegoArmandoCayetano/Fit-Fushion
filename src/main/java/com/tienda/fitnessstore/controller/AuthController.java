package com.tienda.fitnessstore.controller;

import com.tienda.fitnessstore.model.dto.LoginDTO;
import com.tienda.fitnessstore.model.dto.RegistroUsuarioDTO;
import com.tienda.fitnessstore.model.entity.Usuario;
import com.tienda.fitnessstore.service.interfaces.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.view.RedirectView;
import com.tienda.fitnessstore.model.dto.LoginDTO;

@Controller
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

    @PostMapping("/register-form")
    public RedirectView registerForm(RegistroUsuarioDTO dto) {

        try {
            usuarioService.registrarUsuario(dto);
            return new RedirectView("/login?success");
        } catch (IllegalArgumentException e) {
            return new RedirectView("/auth/register-form?error=" + e.getMessage());
        }
    }

    @GetMapping("/register-form")
    public String showRegisterForm() {
        return "register-form";
    }

}