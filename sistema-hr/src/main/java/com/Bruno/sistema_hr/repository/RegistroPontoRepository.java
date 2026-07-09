
package com.Bruno.sistema_hr.repository;

import com.Bruno.sistema_hr.model.Freelancer;
import com.Bruno.sistema_hr.model.RegistroPonto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RegistroPontoRepository extends JpaRepository <RegistroPonto,Long>{
    
    List<RegistroPonto> findByFreelancer(Freelancer freelancer);
}
