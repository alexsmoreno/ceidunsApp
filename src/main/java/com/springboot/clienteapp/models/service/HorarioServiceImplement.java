
package com.springboot.clienteapp.models.service;

import com.springboot.clienteapp.models.entity.Horario;
import com.springboot.clienteapp.models.repository.HorarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
public class HorarioServiceImplement implements IHorarioService {
     @Autowired
    private HorarioRepository horarioReoisitory;

    @Override
    public List<Horario> listarHorario() {
        return (List<Horario>) horarioReoisitory.findAll();
    }

    @Override
    public void guardar(Horario horario) {
       horarioReoisitory.save(horario);
    }

    @Override
    public Horario buscarPorId(Long id) {
        return horarioReoisitory.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        horarioReoisitory.deleteById(id);
    }
    

  
    
}
