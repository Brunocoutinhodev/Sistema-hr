package com.Bruno.sistema_hr.controller;

import com.Bruno.sistema_hr.model.Freelancer;
import com.Bruno.sistema_hr.model.RegistroPonto;
import com.Bruno.sistema_hr.service.RegistroPontoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/registro_ponto")
public class RegistroPontoController {

    @Autowired
    private RegistroPontoService service;

    @PostMapping
    public RegistroPonto salvarPonto(@RequestBody RegistroPonto registro) {
        return service.salvarPonto(registro);
    }

    @GetMapping
    public List<RegistroPonto> ListarTodos() {
        return service.ListarTodos();
    }

    @GetMapping("/freelancer/{id}")
    public List<RegistroPonto> listarPorFreelancer(@PathVariable Long id) {
        Freelancer freelancerBusca = new Freelancer();
        freelancerBusca.setId(id);

        return service.ListarFreelancer(freelancerBusca);
    }
    @DeleteMapping("/{id}")
    public void deletarPonto (@PathVariable Long id){
        service.DeletePonto(id);
       
                }

    
}
