/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca2025;

import java.time.LocalDate;

/**
 *
 * @author alu05d
 */
public class Prestamo {
    private Libro LibroPrest;
    private Usuario UsuarioPrest;
    private LocalDate fechaPrest;
    private LocalDate fechaDev;

    public Prestamo(Libro LibroPrest, Usuario UsuarioPrest, LocalDate fechaPrest, LocalDate fechaDev) {
        this.LibroPrest = LibroPrest;
        this.UsuarioPrest = UsuarioPrest;
        this.fechaPrest = fechaPrest;
        this.fechaDev = fechaDev;
    }

    
    
    public Libro getLibroPrest() {
        return LibroPrest;
    }
    public Usuario getUsuarioPrest() {
        return UsuarioPrest;
    }
    public LocalDate getFechaPrest() {
        return fechaPrest;
    }
    public LocalDate getFechaDev() {
        return fechaDev;
    }

    
    
    
    public void setLibroPrest(Libro LibroPrest) {
        this.LibroPrest = LibroPrest;
    }
    public void setUsuarioPrest(Usuario UsuarioPrest) {
        this.UsuarioPrest = UsuarioPrest;
    }
    public void setFechaPrest(LocalDate fechaPrest) {
        this.fechaPrest = fechaPrest;
    }
    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

       
    @Override
    public String toString() {
        return  LibroPrest + "-" + UsuarioPrest + "-" + fechaPrest + "-" + fechaDev ;
    }
}
