package com.TrabajoFinal.TF.service;

import com.TrabajoFinal.TF.entity.DTO.UserRegisterDto;
import com.TrabajoFinal.TF.entity.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    Usuario register(UserRegisterDto dto);
}
