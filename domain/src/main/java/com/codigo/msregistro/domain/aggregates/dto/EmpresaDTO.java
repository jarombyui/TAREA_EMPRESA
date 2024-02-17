package com.codigo.msregistro.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
/// no usan constructores
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)//esta anotacion para no serializar(usar) los numeros nulos cuando los tengamos
public class EmpresaDTO {

    private Long idEmpresa;

    private String numDocu;

    private String razonSocial;

    private String nomComercial;
    private int estado;

    private String usuaCrea;

    private Timestamp dateCreate;

    private String usuaModif;

    private Timestamp dateModif;

    private String usuaDelet;
    private Timestamp dateDelet;
    private int id_tipo_documento;

}
