package com.TrabajoFinal.TF.service;

import com.TrabajoFinal.TF.entity.Usuario;
import com.TrabajoFinal.TF.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Usuario register(String username, String password, String role) {
        Optional<Usuario> existingUser = userRepository.findByMail(username);
        if (existingUser.isPresent()) {
            throw new RuntimeException("El usuario ya existe");
        }

        String hashedPassword = passwordEncoder.encode(password);

        Usuario usuario = Usuario.builder()
                .username(username)
                .password(hashedPassword)
                .role(role)
                .build();

        return userRepository.save(usuario);
    }

    public Usuario login(String username, String password) {
        Usuario usuario = userRepository.findByMail(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        if (!passwordEncoder.matches(password, usuario.getPassword())) {
            throw new RuntimeException("Contraseña incorrecta");
        }

        return usuario;
    }
}

