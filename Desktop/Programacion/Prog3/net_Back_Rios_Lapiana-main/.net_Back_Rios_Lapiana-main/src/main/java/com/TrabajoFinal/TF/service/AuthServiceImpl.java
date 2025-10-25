package com.TrabajoFinal.TF.service;

import com.TrabajoFinal.TF.Rol;
import com.TrabajoFinal.TF.config.Sha256Util;
import com.TrabajoFinal.TF.entity.Usuario;
import com.TrabajoFinal.TF.repository.UserRepository;

public class AuthServiceImpl {
    private final UserRepository userRepository;
    public AuthServiceImpl (UserRepository userRepository){
        this.userRepository= userRepository;
    }
    @Override
    public Usuario register(Usuario usuario){
        String hashedPassword = Sha256Util.hash(usuario.getContrasena());
        usuario.setContrasena(hashedPassword);
        if (usuario.getRol()==null){
            usuario.setRol(Rol.USUARIO);
        }
        return userRepository.save(usuario);
    }
    @Override
    public Usuario login(Usuario usuario){
        String hashedPassword = Sha256Util.hash(usuario.getContrasena());
        usuario.setContrasena(hashedPassword);
        if (usuario.getRol()==null){
            usuario.setRol(Rol.USUARIO);
        }
        return userRepository.save(usuario);
    }
}
