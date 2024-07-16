package com.ivanstudent.literatura.model;

public enum Categoria {
    ACCION("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    FICCION ("Fiction"),
    CRIMEN("Crime"),
    AVENTURA ("Adventure"),
    DESCONOCIDO("Desconocido");

    private String categoria;
    Categoria(String categoriaApi){
        this.categoria = categoriaApi;
    }

    public static Categoria fromString(String text){
        for (Categoria categoriaEnum: Categoria.values()) {
            if (categoriaEnum.categoria.equals(text)){
                return categoriaEnum;
            }
        }
        return Categoria.DESCONOCIDO;
    }
}
