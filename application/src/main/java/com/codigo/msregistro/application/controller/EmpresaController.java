package com.codigo.msregistro.application.controller;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.RequestEmpresa;
import com.codigo.msregistro.domain.ports.in.EmpresaServiceIn;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/empresa")
@RequiredArgsConstructor
public class EmpresaController {
    private final EmpresaServiceIn empresaServiceIn; ///  esta tiene impl asi que usaran su impl

    @PostMapping
    public ResponseEntity<EmpresaDTO> registrar(@RequestBody RequestEmpresa requestEmpresa)
    {
        return ResponseEntity.
                status(HttpStatus.CREATED).
                body(empresaServiceIn.crearEmpresaIn(requestEmpresa));
    }

    @GetMapping
    public ResponseEntity<List<EmpresaDTO>> obtenerTodos() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(empresaServiceIn.obtenerTodosIn());
    }

}
