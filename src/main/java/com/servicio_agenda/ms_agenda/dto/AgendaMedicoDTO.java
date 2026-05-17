package com.servicio_agenda.ms_agenda.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AgendaMedicoDTO {
    private Long idMedico;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private String estado;
}