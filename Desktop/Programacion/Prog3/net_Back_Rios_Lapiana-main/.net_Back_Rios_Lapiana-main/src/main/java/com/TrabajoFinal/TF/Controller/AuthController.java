package com.TrabajoFinal.TF.Controller;


import com.TrabajoFinal.TF.entity.Usuario;
import com.TrabajoFinal.TF.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin (origins = "http://localhost:5173") // frontend Vite
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;
    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<Usuario> register(@RequestBody Usuario usuario) {
       Usuario registeredUser= authService.register(usuario);
       registeredUser.setContrasena(null);
       return ResponseEntity.status(201).body(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {
        Usuario loginUser= authService.login(usuario);
        loginUser.setContrasena(null);
        return ResponseEntity.status(201).body(registeredUser);
    }
    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers(){

    }
}

