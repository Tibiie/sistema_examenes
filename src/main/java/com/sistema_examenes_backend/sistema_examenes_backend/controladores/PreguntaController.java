package com.sistema_examenes_backend.sistema_examenes_backend.controladores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Examen;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Pregunta;
import com.sistema_examenes_backend.sistema_examenes_backend.servicios.ExamenService;
import com.sistema_examenes_backend.sistema_examenes_backend.servicios.PreguntaService;

@RestController
@RequestMapping("api/v1/pregunta")
@CrossOrigin("*")
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;

    @Autowired
    private ExamenService examenService;

    @PostMapping("/agregarPregunta")
      public ResponseEntity<Pregunta> guardarPregunta(@RequestBody Pregunta pregunta){
        Pregunta preguntaGuardada = preguntaService.agregarPregunta(pregunta);
        return ResponseEntity.ok(preguntaGuardada);
    }

    @PutMapping("/actualizarPregunta")
    public Pregunta actualizarPregunta(@RequestBody Pregunta pregunta){
        return preguntaService.actualizarPregunta(pregunta);
    }

    @GetMapping("/examen/PreguntasDelExamen/{examenId}")
    public ResponseEntity <?> ListarPreguntasDelExamen(@PathVariable("examenId") Long examenId){
        Examen examen = examenService.obtenerExamen(examenId);
        Set<Pregunta> preguntas = examen.getPreguntas();

        List examenes = new ArrayList(preguntas);
        if (examenes.size() > Integer.parseInt(examen.getNumeroDePreguntas())) {
            examenes = examenes.subList(0, Integer.parseInt(examen.getNumeroDePreguntas() + 1));
        }

        Collections.shuffle(examenes);
        return ResponseEntity.ok(examenes);
    }

    @GetMapping("buscarPregunta/{preguntaId}")
    public Pregunta listarPreguntaPorId(@PathVariable("preguntaId") Long preguntaId){
        return preguntaService.obtenerPregunta(preguntaId);
    }

    @DeleteMapping("/eliminarPregunta/{preguntaId}")
    public void eliminarPregunta(@PathVariable("preguntaId") Long preguntaId){
        preguntaService.eliminarPregunta(preguntaId);
    }
}
