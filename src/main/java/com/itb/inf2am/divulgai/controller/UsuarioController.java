/* package com.itb.inf2am.divulgai.controller;

import com.itb.inf2am.divulgai.model.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  // Adicionando o Usuario
     usuarios.add(u1);
  usuarios.add(u2);
  usuarios.add(u3);
          usuarios.add(u4);


  return usuarios;
 }
}
*/

package com.itb.inf2am.divulgai.controller;


// No spring é comum adicionarmos anotações (annotation) em classes, atributos e métodos
// Uma annotation é uma forma de adicionar informações (metadados) ao seu código que podem
// ser interpretadas pelo compilador ou em tempo de execução por ferramentas e frameworks
// como o Spring
// Uma annotation é uma palavra iniciada com '@' que você coloca acima de uma class, método,
// atributo ou parâmetro, para dar instruções extras ao Java ou a algum framework sobre como
// aquele elemento deve ser tratado.

import com.itb.inf2am.divulgai.model.entity.Usuario;
import com.itb.inf2am.divulgai.model.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Usuario")
public class UsuarioController {

 @Autowired
 private UsuarioService UsuarioService;

 @GetMapping
 public ResponseEntity<List<Usuario>> findAll() {

  return ResponseEntity.ok(UsuarioService.findAll());
 }

 // @RequestBody : Corpo da Requisição ( Recebendo um objeto JSON )
 // RespondeEntity: Toda resposta HTTP (status, cabeçalhos e corpo), aqui temos mais controle sobre o que é devolvido para o cliente
 // 1. Status HTTP ( 200 ok, 201 CREATED, 404 NOT FOUND etc...)
 // 2. Headers: ( cabeçalhos extras, como Location, Authorization etc...)
 // 3. Body: ( o objeto que será convertido em JSON/XML para o cliente )

 @PostMapping
 public ResponseEntity<Usuario> save(@RequestBody Usuario Usuario) {

  Usuario newUsuario = UsuarioService.save(Usuario);
  return ResponseEntity.status(HttpStatus.CREATED).body(newUsuario);
 }

}
