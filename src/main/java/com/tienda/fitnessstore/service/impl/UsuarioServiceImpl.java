package com.tienda.fitnessstore.service.impl;

import com.tienda.fitnessstore.model.dto.RegistroUsuarioDTO;
import com.tienda.fitnessstore.model.entity.Usuario;
import com.tienda.fitnessstore.model.enums.RolUsuario;
import com.tienda.fitnessstore.repository.UsuarioRepository;
import com.tienda.fitnessstore.service.interfaces.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.tienda.fitnessstore.model.dto.LoginDTO;
import org.springframework.security.authentication.BadCredentialsException;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
public Usuario registrarUsuario(RegistroUsuarioDTO dto) {

    if (usuarioRepository.findByEmail(dto.getEmail()).isPresent()) {
        throw new IllegalArgumentException("El email ya está registrado");
    }

    Usuario usuario = Usuario.builder()
            .nombre(dto.getNombre())
            .email(dto.getEmail())
            .password(passwordEncoder.encode(dto.getPassword()))
            .rol(RolUsuario.CLIENTE)
            .build();

    return usuarioRepository.save(usuario);
}

    @Override
    public Usuario login(LoginDTO dto) {

        Usuario usuario = usuarioRepository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new BadCredentialsException("Email incorrecto"));

        boolean passwordCorrecta = passwordEncoder.matches(
                dto.getPassword(),
                usuario.getPassword()
        );

        if (!passwordCorrecta) {
            throw new BadCredentialsException("Contraseña incorrecta");
        }

        return usuario;
    }
}