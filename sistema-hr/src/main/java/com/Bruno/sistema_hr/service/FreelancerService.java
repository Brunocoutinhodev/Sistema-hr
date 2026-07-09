
package com.Bruno.sistema_hr.service;

import com.Bruno.sistema_hr.model.Freelancer;
import com.Bruno.sistema_hr.repository.FreelancerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class FreelancerService {
   
    @Autowired
    private FreelancerRepository repository;
    
    public Freelancer CadastrarFreelancer(Freelancer freelancer){
        return repository.save(freelancer);
    }
   public List <Freelancer> ListarTodos(){
       return repository.findAll();
   }
}
