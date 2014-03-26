package com.nbbi.nbbiweb.controller;

import java.util.ArrayList;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nbbi.nbbiweb.beans.MolInfo;
import com.nbbi.nbbiweb.dao.MolInfoDao;


@Controller
public class MolListController {

	@Autowired private MolInfoDao molInfoDao;
	
	/**
	 * Simply selects the Molecule List view to render by returning its name.
	 */
	@RequestMapping(value = "/MolList", method = RequestMethod.GET)
	public String getMolList(Locale locale, Model model) {
		MolInfo molInfo = new MolInfo();
		model.addAttribute("molInfoList", (ArrayList<MolInfo>)molInfoDao.getMolInfoList(molInfo));

		return "MolList";
	}
	
}
