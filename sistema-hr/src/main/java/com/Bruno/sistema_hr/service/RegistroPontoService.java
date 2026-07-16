package com.Bruno.sistema_hr.service;

import com.Bruno.sistema_hr.model.Freelancer;
import com.Bruno.sistema_hr.model.RegistroPonto;
import com.Bruno.sistema_hr.model.TipoRegistro;
import com.Bruno.sistema_hr.repository.RegistroPontoRepository;
import java.time.Duration;
import java.time.LocalDateTime;
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

    public RegistroPonto atualizarPonto(Long id, RegistroPonto novosDados) {
        RegistroPonto pontoExistente = ponto.findById(id).get();
        pontoExistente.setData_dia(novosDados.getData_dia());
        pontoExistente.setTipo(novosDados.getTipo());
        return ponto.save(pontoExistente);
    }

    public String calcularHoras(Long id, LocalDateTime data_dia) {
        List<RegistroPonto> listaDePontos = ponto.findByFreelancerId(id);
        LocalDateTime horaEntrada = null;
        LocalDateTime horaSaida = null;

        for (RegistroPonto p : listaDePontos) {
            if (p.getTipo().equals("ENTRADA") && p.getData_dia().toLocalDate().equals(data_dia.toLocalDate())) {
                horaEntrada = p.getData_dia();
            }

            if (p.getTipo().equals("SAIDA") && p.getData_dia().toLocalDate().equals(data_dia.toLocalDate())) {
                horaSaida = p.getData_dia();
             }
        }
        
        if (horaEntrada != null && horaSaida != null) {
            Duration duracao = Duration.between(horaEntrada, horaSaida);
            long horas = duracao.toHours();
            long minutos = duracao.toMinutesPart();
            return horas + "H" + minutos + "min";
        }
        return "Ponto incompleto";

    }
}
