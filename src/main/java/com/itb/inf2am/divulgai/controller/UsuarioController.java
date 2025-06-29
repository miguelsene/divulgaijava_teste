package com.itb.inf2am.divulgai.controller;

import com.itb.inf2am.divulgai.model.entity.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusUsuario;
// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/usuario")

public class UsuarioController {
 List<Usuario> usuarios = new ArrayList<>();
 @GetMapping
    public List<Usuario> findAll() {
     Usuario u1 = new Usuario();
     u1.setId(1L);
     u1.setNome("Fulano da Silva");
     u1.setEmail("fulano@gmail.com");
     u1.setSenha("MTIzNDU2Nzg=");
     u1.setNivelAcesso("ADMIN");
     u1.setFoto(null);
     u1.setDataCadastro(LocalDateTime.now());
     u1.setStatusUsuario("ATIVO");

  Usuario u2 = new Usuario();
  u2.setId(2L);
  u2.setNome("Beltrana de Sá");
  u2.setEmail("beltrana@gmail.com");
  u2.setSenha("MTIzNDU2Nzg=");
  u2.setNivelAcesso("USER");
  u2.setFoto(null);
  u2.setDataCadastro(LocalDateTime.now());
  u2.setStatusUsuario("INATIVO");


  Usuario u3 = new Usuario();
  u3.setId(3L);
  u3.setNome("Sicrana de Oliveira");
  u3.setEmail("sicrana@gmail.com");
  u3.setSenha("MTIzNDU2Nzg=");
  u3.setNivelAcesso("PRESTADOR");
  u3.setFoto(null);
  u3.setDataCadastro(LocalDateTime.now());
  u3.setStatusUsuario("ATIVO");

  Usuario u4 = new Usuario();
  u4.setId(4L);
  u4.setNome("Ordnael Zurc");
  u4.setEmail("ordnael@gmail.com");
  u4.setSenha("MTIzNDU2Nzg=");
  u4.setNivelAcesso("USER");
  u4.setFoto(null);
  u4.setDataCadastro(LocalDateTime.now());
  u4.setStatusUsuario("TROCAR_SENHA");

  // Adicionando o produto
     usuarios.add(u1);
  usuarios.add(u2);
  usuarios.add(u3);
          usuarios.add(u4);


  return usuarios;
 }
}
