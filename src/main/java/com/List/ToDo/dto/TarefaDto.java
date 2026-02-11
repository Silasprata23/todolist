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
    private long User_id;


    public TarefaDto(Long id, String nome, String descricao, Status status, LocalDate dtInicio, LocalDate dtFim, long user_id) {
        Id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        User_id = user_id;
    }

    public long getUser_id() {
        return User_id;
    }

    public void setUser_id(long user_id) {
        User_id = user_id;
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
