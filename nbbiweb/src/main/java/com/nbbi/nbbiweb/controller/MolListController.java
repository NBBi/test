package com.nbbi.nbbiweb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		ArrayList<MolInfo> molList = (ArrayList<MolInfo>)molInfoDao.getMolInfoList(molInfo);
		model.addAttribute("molInfoList", molList);
		System.out.println(molList.get(0).getStandard_inchi());

		return "MolList";
	}
	
	@RequestMapping(value = "/exactSearch", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String exactSearch(Model model,
			@RequestParam(value="smiles",required=true) String smiles) {
		System.out.println(smiles);
		MolInfo molInfo = new MolInfo();
		molInfo.setCanonical_smiles(smiles);
		
		List<MolInfo> molList = (ArrayList<MolInfo>)molInfoDao.selectExactMolList(molInfo);
		model.addAttribute("molInfoList", molList);
		
		return "MolList";
	}
	
	@RequestMapping(value = "/chemblSearch", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String chemblSearch(Model model,
			@RequestParam(value="chembl_id",required=true) String chemblID) {
		System.out.println(chemblID);
		MolInfo molInfo = new MolInfo();
		molInfo.setChembl_id(chemblID);
		
		List<MolInfo> molList = (ArrayList<MolInfo>)molInfoDao.selectExactMolList(molInfo);
		model.addAttribute("molInfoList", molList);
		
		return "MolList";
	}
	
}
