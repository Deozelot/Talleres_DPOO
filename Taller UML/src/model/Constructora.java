package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Constructora {
	
	private String archivo;

	public Constructora(String archivo) {
		super();
		this.archivo = archivo;
	}
	
	public void abrir(String pNombreArchivo) {
		
		
	}
	
	public void crearParte(String pTipoParte, BufferedReader pLector){
		
		
		
	}
	
	public void crearParte(String pTipoParte, int pX, int pY, Color pColorParte){
		
		
		
	}
	
	public ArrayList<Parte> darTipos(){
		
		ArrayList<Parte> listaTipos = new ArrayList<Parte>();	
		return listaTipos;
		
	}
	
	public ArrayList<Parte> darPartes(){
		
		ArrayList<Parte> listaPartes = new ArrayList<Parte>();	
		return listaPartes;
		
	}
	
	public void agregarParte(IParte pF){
		
		
	}
	
	public void reiniciar() {
		
		
	}
	
	public String darNombreArchivo() {
	
	String nombre = new String();
	nombre = "archivo";
	return nombre;	
	}
	
	public void salvar() {
		
		
	}
	
	public void salvar(String pNombreArchivo) {
		
		
	}
	
	public void pintarPartes(Graphics2D Graphics) {
		
		
	}
	
	public void eliminarParte(int pX, int pY, String pTipo) {


	}
	
	public void cambiarPosicionParte(int pX, int pY, String pTipo, int pNuevoX, int pNuevoY) {
		
		
	}
	
	public IParte buscarParte(int pX, int pY) {
		
		return null;
	}
	
	public void verificarVariante() {
		
		
	}
	
	public String metodo1() {
		
		String nombre = new String();
		nombre = "archivo";
		return nombre;		
	}
	
public String metodo2() {
		
		String nombre = new String();
		nombre = "archivo";
		return nombre;		
	}
	
}
