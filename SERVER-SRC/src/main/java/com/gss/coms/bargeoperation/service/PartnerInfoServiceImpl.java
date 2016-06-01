package com.gss.coms.bargeoperation.service;
// Generated Apr 8, 2016 2:55:17 PM by Hibernate Tools 4.3.1.Final

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gss.coms.AbstractDao;
import com.gss.coms.AbstractServiceImpl;
import com.gss.coms.bargeoperation.dao.PartnerInfoDao;
import com.gss.coms.bargeoperation.model.PartnerInfo;

/**
 * Home object for domain model class PartnerInfo.
 * 
 * @see com.gss.coms.bargeoperation.dao.PartnerInfo
 * @author Hibernate Tools
 */
@Service("partnerInfoService")
public class PartnerInfoServiceImpl extends AbstractServiceImpl<PartnerInfo, String> implements PartnerInfoService {

	private static final Log log = LogFactory.getLog(PartnerInfoServiceImpl.class);
	private PartnerInfoDao dao;

	public PartnerInfoServiceImpl() {
	}

	@Autowired
	public PartnerInfoServiceImpl(@Qualifier("partnerInfoDao") AbstractDao<PartnerInfo, String> abstractDao) {
		super(abstractDao);
		this.dao = (PartnerInfoDao) abstractDao;
	}
}
