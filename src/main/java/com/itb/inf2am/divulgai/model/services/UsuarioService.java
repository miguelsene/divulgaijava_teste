package com.itb.inf2am.divulgai.model.services;


import com.itb.inf2am.divulgai.model.entity.Usuario;
import com.itb.inf2am.divulgai.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired       // Injeção de dependência
    private UsuarioRepository usuarioRepository;

    // Método responsável em listar todos os Usuarios cadastrados no banco de dados

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();

    }

    // Método responsável em Criar o Usuario no banco de dados

    public Usuario save(Usuario usuario) {
        usuario.setStatusUsuario(true);
        return usuarioRepository.save(usuario);
    }
}
