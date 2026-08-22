package br.com.gymnote.gym.entity;

import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "tb_medicao")
public class Medicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_registro", nullable = false)
    private LocalDateTime dataRegistro;

    @Column(name = "peso_kg", nullable = false)
    private Double pesoKg;

    @Column(name = "altura_cm", nullable = false)
    private Double alturaCm;

    @Column(name = "pescoco_cm",nullable = false)
    private Double pescocoCm;

    @Column(name = "cintura_umbigo_cm")
    private Double cinturaUmbigoCm;

    @Column(name = "cintura_cinto_cm")
    private Double cinturaCintoCm;

    @Column(name = "peitoral_cm")
    private Double peitoralCm;

    @Column(name = "biceps_contraido_cm")
    private Double bicepsContraidoCm;

    @Column(name = "coxas_cm")
    private Double coxasCm;

    @Column(name = "panturrilhas_cm")
    private Double panturrilhasCm;

    @Column(name = "bf_percentual")
    private Double bfPercentual;

    @Column(name = "massa_magra_kg")
    private Double massaMagraKg;

    public Medicao() {
    }

    @PrePersist
    protected void onCreate() {
        this.dataRegistro = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(Double alturaCm) {
        this.alturaCm = alturaCm;
    }

    public Double getPescocoCm() {
        return pescocoCm;
    }

    public void setPescocoCm(Double pescocoCm) {
        this.pescocoCm = pescocoCm;
    }

    public Double getCinturaUmbigoCm() {
        return cinturaUmbigoCm;
    }

    public void setCinturaUmbigoCm(Double cinturaUmbigoCm) {
        this.cinturaUmbigoCm = cinturaUmbigoCm;
    }

    public Double getCinturaCintoCm() {
        return cinturaCintoCm;
    }

    public void setCinturaCintoCm(Double cinturaCintoCm) {
        this.cinturaCintoCm = cinturaCintoCm;
    }

    public Double getPeitoralCm() {
        return peitoralCm;
    }

    public void setPeitoralCm(Double peitoralCm) {
        this.peitoralCm = peitoralCm;
    }

    public Double getBicepsContraidoCm() {
        return bicepsContraidoCm;
    }

    public void setBicepsContraidoCm(Double bicepsContraidoCm) {
        this.bicepsContraidoCm = bicepsContraidoCm;
    }

    public Double getCoxasCm() {
        return coxasCm;
    }

    public void setCoxasCm(Double coxasCm) {
        this.coxasCm = coxasCm;
    }

    public Double getPanturrilhasCm() {
        return panturrilhasCm;
    }

    public void setPanturrilhasCm(Double panturrilhasCm) {
        this.panturrilhasCm = panturrilhasCm;
    }

    public Double getBfPercentual() {
        return bfPercentual;
    }

    public void setBfPercentual(Double bfPercentual) {
        this.bfPercentual = bfPercentual;
    }

    public Double getMassaMagraKg() {
        return massaMagraKg;
    }

    public void setMassaMagraKg(Double massaMagraKg) {
        this.massaMagraKg = massaMagraKg;
    }
}
