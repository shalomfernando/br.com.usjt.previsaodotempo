package br.com.ccp3anmcaprevisaodotempo.repository;

import br.com.ccp3anmcaprevisaodotempo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Usuario findOneByLoginAndSenha (String login, String senha);
}
