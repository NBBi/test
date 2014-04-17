package com.nbbi.nbbiweb.dao;

import java.util.List;

import com.nbbi.nbbiweb.beans.MolInfo;

public interface MolInfoDao {

	public List<MolInfo> getMolInfoList(MolInfo molInfo);
	public List<MolInfo> selectExactMolList(MolInfo molInfo);
}
