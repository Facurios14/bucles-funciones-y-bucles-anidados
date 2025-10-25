package com.TrabajoFinal.TF.entity.mapper;

import com.TrabajoFinal.TF.entity.DTO.UserResponseDto;
import com.TrabajoFinal.TF.entity.Usuario;

public class UserMapper {
    private UserMapper(){

    }
    public static UserResponseDto toResponseDto(Usuario usuario){
        UserResponseDto dto = new UserResponseDto();
        dto.setId(usuario.getId());
        dto.setNombre(usuario.getNombre());
        dto.setApellido(usuario.getApellido());
        dto.setMail(usuario.getMail());
        dto.setCelular(usuario.getCelular());
        dto.setRol(usuario.getRol());
        return dto;
    }
}
