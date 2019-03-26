package br.com.ccp3anmcaprevisaodotempo.Service;

import br.com.ccp3anmcaprevisaodotempo.model.Usuario;
import br.com.ccp3anmcaprevisaodotempo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    UsuarioRepository usuarioRepo;
    public boolean logar (Usuario usuario) {
        return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),
                usuario.getSenha()) != null;
    }
}
