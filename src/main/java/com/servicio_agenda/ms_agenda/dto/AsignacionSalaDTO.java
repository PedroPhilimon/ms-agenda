package com.servicio_agenda.ms_agenda.dto;

import lombok.Data;

@Data
public class AsignacionSalaDTO {
    private Long idSala;
    private String motivoBloqueo;
    private Long idAgenda;
}