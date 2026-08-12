package br.com.gymnote.gym.entity;

import jakarta.persistence.*;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;

import java.time.LocalDateTime;

@Entity
@Table(name = "medicao")
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
}
