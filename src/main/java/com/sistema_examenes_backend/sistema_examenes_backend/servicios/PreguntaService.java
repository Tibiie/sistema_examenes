package com.sistema_examenes_backend.sistema_examenes_backend.servicios;

import java.util.Set;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Examen;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Pregunta;

public interface PreguntaService {
    Pregunta agregarPregunta(Pregunta pregunta);

    Pregunta actualizarPregunta(Pregunta pregunta);

    Set<Pregunta> obtenerPreguntas();

    Pregunta obtenerPregunta(Long preguntaId);

    Set<Pregunta> obtenerPreguntasDelExamen(Examen examen);

    void eliminarPregunta(Long preguntaId);

    Pregunta listarPregunta(Long preguntaId);

}
