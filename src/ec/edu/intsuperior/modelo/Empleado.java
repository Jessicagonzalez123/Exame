/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Windows 10
 */
public class Empleado {
    private String sueldo_bruto;

    public Empleado(String sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public String getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(String sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
      
}
