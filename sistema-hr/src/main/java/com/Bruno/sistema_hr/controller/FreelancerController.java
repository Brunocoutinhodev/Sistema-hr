
package com.Bruno.sistema_hr.controller;

import com.Bruno.sistema_hr.model.Freelancer;
import com.Bruno.sistema_hr.service.FreelancerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/freelancer")

public class FreelancerController {
    
@Autowired
private FreelancerService service;

@PostMapping
public Freelancer Cadastrar(@RequestBody Freelancer freelancer){
    return service.CadastrarFreelancer(freelancer);
}

@GetMapping
public List <Freelancer> ListarTodos(){
    return service.ListarTodos();
}

    
}


