/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class Estudiante  {
	private String codigo;
	private String nombre;
	private FEcha fecNac;
	private double cuota;
	
	public Estudiante() {
		this(null,null,null, 0);
	}
	public Estudiante(String codigo, String nombre, FEcha fecnac, double cuota ) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.fecNac = fecnac;
		this.cuota = cuota;
	}
	
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public FEcha getFechaNac() {
		return fecNac;
	}
	public void setFecNac(FEcha fecNac) {
		this.fecNac = fecNac;
	}
	@Override
    public String toString() {
        return String.format("Codigo: %s \tNombre: %20s \tFecha de Nacimiento: %s \tCuota: %.2f",
        		this.codigo,this.nombre,this.fecNac.toString(),this.cuota);
    }
	public int obtenerEdad() {
		int longFecNac = this.fecNac.toString().length();
		String anio = this.fecNac.toString().substring(longFecNac-4,longFecNac);
		return 2022 - Integer.parseInt(anio);
	}
}
