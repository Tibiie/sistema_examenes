package com.sistema_examenes_backend.sistema_examenes_backend.servicios;

import java.util.List;
import java.util.Set;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Categoria;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Examen;

public interface ExamenService {
    Examen agregarExamen(Examen examen);

    Examen actualizarExamen(Examen examen);

    Set<Examen> obtenerExamenes();

    Examen obtenerExamen(Long examenId);

    void eliminarExamen(Long examenId);

    List<Examen> listarExamenesDeUnaCategoria(Categoria categoria);

    List<Examen> obtenerExamenesActivos();

    List<Examen> obtenerExamenesActivosDeUnaCategoria(Categoria categoria);
}
