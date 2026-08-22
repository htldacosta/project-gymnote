package br.com.gymnote.gym.controller;


import br.com.gymnote.gym.entity.Medicao;
import br.com.gymnote.gym.service.MedicaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/medicoes")
public class MedicaoController {

    private final MedicaoService medicaoService;

    public MedicaoController(MedicaoService medicaoService) {
        this.medicaoService = medicaoService;
    }

    @PostMapping
    public ResponseEntity<Medicao> registrar(@RequestBody Medicao medicaoBruta) {
        Medicao medicaoSalva = medicaoService.registrarMedicao(medicaoBruta);

        return ResponseEntity.status(HttpStatus.CREATED).body(medicaoSalva);
    }

    @GetMapping
    public ResponseEntity<List<Medicao>> listarHistorico() {
        List<Medicao> historico = medicaoService.listarHistorico();

        return ResponseEntity.ok(historico);
    }


}
