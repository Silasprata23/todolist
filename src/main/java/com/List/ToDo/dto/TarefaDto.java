package com.List.ToDo.dto;

import com.List.ToDo.entities.Status;
import com.List.ToDo.entities.Usuario;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class TarefaDto {

    private Long Id;

    @NotBlank
    private String nome;

    @NotBlank
    private String descricao;
    private Status status;
    private LocalDate dtInicio;
    private LocalDate dtFim;
    private Usuario tarefa_id;

    public TarefaDto(String nome, String descricao, Status status, LocalDate dtInicio, LocalDate dtFim, Usuario tarefa_id) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.tarefa_id = tarefa_id;
    }

    public Usuario getTarefa_id() {
        return tarefa_id;
    }

    public void setTarefa_id(Usuario tarefa_id) {
        this.tarefa_id = tarefa_id;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

}
