package com.Bruno.sistema_hr.service;

import com.Bruno.sistema_hr.model.Freelancer;
import com.Bruno.sistema_hr.model.RegistroPonto;
import com.Bruno.sistema_hr.repository.RegistroPontoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroPontoService {

    @Autowired
    private RegistroPontoRepository ponto;

    public RegistroPonto salvarPonto(RegistroPonto registro) {
        return ponto.save(registro);
    }

    public List<RegistroPonto> ListarTodos() {
        return ponto.findAll();
    }

    public List<RegistroPonto> ListarFreelancer(Freelancer registrosUnicos) {
        return ponto.findByFreelancer(registrosUnicos);
    }

    public void DeletePonto(Long id) {
        ponto.deleteById(id);
    }
    public RegistroPonto atualizarPonto(Long id,RegistroPonto novosDados){
            RegistroPonto pontoExistente = ponto.findById(id).get();
            pontoExistente.setData_dia(novosDados.getData_dia());
            pontoExistente.setTipo(novosDados.getTipo());
            return ponto.save(pontoExistente);
    }
}
