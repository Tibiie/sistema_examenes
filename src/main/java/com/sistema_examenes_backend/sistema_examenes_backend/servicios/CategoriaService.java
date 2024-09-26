package com.sistema_examenes_backend.sistema_examenes_backend.servicios;

import java.util.Set;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Categoria;

public interface CategoriaService {
    Categoria agregarCategoria(Categoria categoria);

    Categoria actualizarCategoria(Categoria categoria);

    Set<Categoria> obtenerCategorias();

    Categoria obtenerCategoria(Long categoriaId);

    void eliminarCategoria(Long categoriaId);

}
