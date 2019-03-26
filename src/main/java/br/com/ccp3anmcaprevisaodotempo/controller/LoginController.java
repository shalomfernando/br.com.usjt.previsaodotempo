package br.com.ccp3anmcaprevisaodotempo.controller;

import br.com.ccp3anmcaprevisaodotempo.Service.LoginService;
import br.com.ccp3anmcaprevisaodotempo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @GetMapping(value = {"/login", "/"})
    public ModelAndView login () {
        ModelAndView mv = new ModelAndView ("login");
        mv.addObject(new Usuario());
        return mv;
    }
    @PostMapping ("/fazerLogin")
    public String fazerLogin (HttpServletRequest request,
                              Usuario usuario) {
        if (loginService.logar(usuario)) {
            request.getSession().setAttribute("usuarioLogado",
                    usuario);
            return "redirect:previsao";
        }
        else {
            return "login";
        }
    }

}
