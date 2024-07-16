package com.ivanstudent.literatura.records;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ivanstudent.literatura.model.DatosLibro;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RespuestaApi {
    @JsonAlias("result")
    List<DatosLibro> resultadoLibros;
    public List<DatosLibro> getResultadoLibros() {
        return resultadoLibros;
    }

    public void setResultadoLibros(List<DatosLibro> resultadoLibros) {
        this.resultadoLibros = resultadoLibros;
    }
}
