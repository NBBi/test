package com.nbbi.nbbiweb.beans;

public class MolInfo {

	private String standard_inchi;
	private String standard_inchi_key;
	private String canonical_smiles;
	private String chembl_id;
	
	public MolInfo() {
		
	}

	public String getStandard_inchi() {
		return standard_inchi;
	}

	public void setStandard_inchi(String standard_inchi) {
		this.standard_inchi = standard_inchi;
	}

	public String getStandard_inchi_key() {
		return standard_inchi_key;
	}

	public void setStandard_inchi_key(String standard_inchi_key) {
		this.standard_inchi_key = standard_inchi_key;
	}

	public String getCanonical_smiles() {
		return canonical_smiles;
	}

	public void setCanonical_smiles(String canonical_smiles) {
		this.canonical_smiles = canonical_smiles;
	}

	public String getChembl_id() {
		return chembl_id;
	}

	public void setChembl_id(String chembl_id) {
		this.chembl_id = chembl_id;
	}
	
	
}
