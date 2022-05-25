package com.api.code.controller;

import com.api.code.dominio.Responsavel;
import com.api.code.repository.ResponsavelRepository;
import com.api.code.service.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/responsavel")
public class ResponsavelController {

    @Autowired
    ResponsavelRepository reponsavelRepository;

    @Autowired
    ResponsavelService responsavelService;


    @GetMapping("list")
    @ResponseBody
        public List<Responsavel> listar() {

        return reponsavelRepository.findAll();

    }

    @PostMapping("inclusao")
    public ResponseEntity<Responsavel> inclusao(@Valid @RequestBody Responsavel responsavel) {

        reponsavelRepository.save(responsavel);

        return new ResponseEntity<>(responsavel, HttpStatus.CREATED);
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> remosao(@PathVariable Long id) {
        Optional<Responsavel> optional = reponsavelRepository.findById(id);
        if (optional.isPresent()) {

            reponsavelRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("atualizar/{id}")
    @ResponseBody
    public Responsavel atualizar(@PathVariable Long id, @RequestBody @Valid Responsavel responsavel) {

        Responsavel responsavelAtualizado = responsavelService.atualizar(id, responsavel);

        return reponsavelRepository.save(responsavelAtualizado);
    }


}
