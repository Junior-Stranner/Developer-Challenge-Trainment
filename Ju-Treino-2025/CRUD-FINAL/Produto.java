package org.example.CRUD;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private String segmento;
    private String marca;
    private double valor;

    public boolean filtraPorMarcaOuSegmento(String marcaFiltro, String segmentoFiltro) {
        return this.marca.equalsIgnoreCase(marcaFiltro) || this.segmento.equalsIgnoreCase(segmentoFiltro);
    }

    public Produto() {
    }

    public Produto(String nome, String segmento, String marca, double valor) {
        this.nome = nome;
        this.segmento = segmento;
        this.marca = marca;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", segmento='" + segmento + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                '}';
    }
}
