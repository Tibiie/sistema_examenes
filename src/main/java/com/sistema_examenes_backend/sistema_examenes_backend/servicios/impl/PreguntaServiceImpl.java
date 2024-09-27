package com.sistema_examenes_backend.sistema_examenes_backend.servicios.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Examen;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Pregunta;
import com.sistema_examenes_backend.sistema_examenes_backend.repositorios.PreguntaRepository;
import com.sistema_examenes_backend.sistema_examenes_backend.servicios.PreguntaService;

@Service
public class PreguntaServiceImpl implements PreguntaService{

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Override
    public Pregunta actualizarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    @Override
    public Pregunta agregarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);

    }

    @Override
    public void eliminarPregunta(Long preguntaId) {
        Pregunta pregunta = new Pregunta();
        pregunta.setPreguntaId(preguntaId);
        preguntaRepository.delete(pregunta); 
    }

    @Override
    public Pregunta obtenerPregunta(Long preguntaId) {
        return preguntaRepository.findById(preguntaId).get();
    }

    @Override
    public Set<Pregunta> obtenerPreguntas() {
        return new LinkedHashSet<>(preguntaRepository.findAll());
    }

    @Override
    public Set<Pregunta> obtenerPreguntasDelExamen(Examen examen) {
        return preguntaRepository.findByExamen(examen);
    }

    @Override
    public Pregunta listarPregunta(Long preguntaId) {
        throw new UnsupportedOperationException("Unimplemented method 'listarPregunta'");
    }

}
