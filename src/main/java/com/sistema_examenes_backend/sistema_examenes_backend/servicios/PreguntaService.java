package com.sistema_examenes_backend.sistema_examenes_backend.servicios;

import java.util.Set;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Pregunta;

public interface PreguntaService {
    Pregunta agregarPregunta(Pregunta pregunta);

    Pregunta actualizarPregunta(Pregunta pregunta);

    Set<Pregunta> obtenerPreguntas();

    Pregunta obtenerPregunta(Long preguntaId);

    void eliminarPregunta(Long preguntaId);

}
