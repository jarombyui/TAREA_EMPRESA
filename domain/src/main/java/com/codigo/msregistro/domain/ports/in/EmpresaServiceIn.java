package com.codigo.msregistro.domain.ports.in;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.RequestEmpresa;

import java.util.List;
import java.util.Optional;

public interface EmpresaServiceIn {  /// Una implemebntacion que esta en DOMAIN
/// estos son los metodos de mi negocio
    EmpresaDTO crearEmpresaIn(RequestEmpresa requestEmpresa);// aqui trabajo con DTO y recibo parametros
    Optional<EmpresaDTO> obtenerEmpresaIn(Long id);
    List<EmpresaDTO> obtenerTodosIn();
    EmpresaDTO actualizarIn(Long id, RequestEmpresa requestEmpresa);
    EmpresaDTO deleteIn(Long id);
}
