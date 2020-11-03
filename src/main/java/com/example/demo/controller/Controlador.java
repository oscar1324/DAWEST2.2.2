/**
 * 
 */
package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Negocios.*;

@Controller
public class Controlador {
	
	@Autowired
	INegocio calculo;
	
	@RequestMapping("calculo")
	public String calcularNumeroCoches(@RequestParam("nombre") String n, ModelMap model)  {
			
			double imc;
			try {
				imc = calculo.calculoMasa(n);
				model.addAttribute("dd", imc);
				return "dd";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return "calculo";
		}
	
}