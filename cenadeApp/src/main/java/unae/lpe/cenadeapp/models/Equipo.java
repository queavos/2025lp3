/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unae.lpe.cenadeapp.models;

/**
 *
 * @author ossva
 */
import jakarta.persistence.*;

/**
 *
 * @author ossva
 */
@Entity
@Table(name = "equiposs")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,
            length = 191)
    private String descripcion;
    @Column(nullable = false,
            length = 191)
    private String marca;
    @Column(nullable = false,
            length = 191)
    private String modelo;
    @Column(nullable = false,

            length = 191)
    private String numeroSerie;
    @Column(nullable = false,

            length = 191)
    private String direccionMAC;
    @Column(nullable = false,
            length = 191)
    private String nombreRed;
    @Column(nullable = false,

            length = 191)
    private String sitemaOperativo;
    @Column(nullable = false,

            length = 191)
    private String imagen;
    @Column(columnDefinition = "TEXT")
    private String estadoEquipo;
    @Column(columnDefinition = "TEXT")
    private String observaciones;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sala_id",
            nullable = false)
    private Sala sala;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tequipo_id",
            nullable = false)
    private TipoEquipos tequipo;

    public Equipo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getDireccionMAC() {
        return direccionMAC;
    }

    public void setDireccionMAC(String direccionMAC) {
        this.direccionMAC = direccionMAC;
    }

    public String getNombreRed() {
        return nombreRed;
    }

    public void setNombreRed(String nombreRed) {
        this.nombreRed = nombreRed;
    }

    public String getSitemaOperativo() {
        return sitemaOperativo;
    }

    public void setSitemaOperativo(String sitemaOperativo) {
        this.sitemaOperativo = sitemaOperativo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstadoEquipo() {
        return estadoEquipo;
    }

    public void setEstadoEquipo(String estadoEquipo) {
        this.estadoEquipo = estadoEquipo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public TipoEquipos getTequipo() {
        return tequipo;
    }

    public void setTequipo(TipoEquipos tequipo) {
        this.tequipo = tequipo;
    }

}
