package com.nbbi.nbbiweb.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MolListController {

	
	/**
	 * Simply selects the Molecule List view to render by returning its name.
	 */
	@RequestMapping(value = "/MolList", method = RequestMethod.GET)
	public String getMolList(Locale locale, Model model) {
		

		return "MolList";
	}
	
}
