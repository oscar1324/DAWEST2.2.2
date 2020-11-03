/**
 * 
 */
package com.example.demo.Negocios;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Datos.IDatos;
import com.example.demo.Datos.*;


@Component
public class Negocio implements INegocio {
	
	@Autowired
	IDatos datos;
	@Override
	public double calculoMasa(String nombre) throws IOException {
		
		
		double peso;
		double altura;
		peso = Double.parseDouble(datos.consultaDatos(nombre).split("-")[1]);
		altura = Double.parseDouble(datos.consultaDatos(nombre).split("-")[2]);
		return peso/altura*100;
	}
}
