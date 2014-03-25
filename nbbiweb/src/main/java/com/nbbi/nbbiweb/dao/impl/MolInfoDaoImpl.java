package com.nbbi.nbbiweb.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.nbbi.nbbiweb.beans.MolInfo;
import com.nbbi.nbbiweb.dao.MolInfoDao;

@Repository("MolInfoDaoImpl")
public class MolInfoDaoImpl extends SqlSessionDaoSupport implements MolInfoDao {

	@Override
	public List<MolInfo> getMolInfoList(MolInfo molInfo) {
		return getSqlSession().selectList("molInfo.getMolInfoList", molInfo);
	}

}
