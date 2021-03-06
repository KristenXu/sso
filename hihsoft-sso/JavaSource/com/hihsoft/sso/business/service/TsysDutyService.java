/**
 * Copyright (c) 2013-2015 www.javahih.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.hihsoft.sso.business.service;

import java.util.*;

import org.hibernate.criterion.DetachedCriteria;

import com.hihframework.exception.ServiceException;
import com.hihsoft.baseclass.service.BaseService;
import com.hihsoft.sso.business.model.*;

/**
 * Title:岗位服务 Description: Copyright: Copyright (c) 2013 Company:hihsoft.co.,ltd
 * 
 * @author hihsoft.co.,ltd
 * @version 1.0
 */

public interface TsysDutyService extends BaseService {

	/**
	 * 新增、修改TsysDuty信息
	 * 
	 * @param tsysDuty
	 * @throws DataAccessException
	 */
	public void saveOrUpdateTsysDuty(TsysDuty tsysDuty) throws ServiceException;

	/**
	 * 删除TsysDuty信息
	 * 
	 * @param id
	 * @throws DataAccessException
	 */
	public void deleteTsysDuty(String id) throws ServiceException;

	/**
	 * 通过HQL构造查询条件来查询符合条件的TsysDuty信息
	 * 
	 * @param hql
	 * @return List
	 * @throws DataAccessException
	 */
	public List<?> getTsysDutyByHQL(String hql) throws ServiceException;

	/**
	 * 查询所有的TsysDuty信息
	 * 
	 * @param hql
	 * @return List
	 * @throws DataAccessException
	 */
	public List<?> getAllTsysDuty() throws ServiceException;

	/**
	 * 根据主键查询TsysDuty信息明细
	 * 
	 * @param id
	 * @throws DataAccessException
	 */
	public TsysDuty getTsysDutyById(String id) throws ServiceException;

	/**
	 * 把查询条件构造成数组来查询TsysDuty信息
	 * 
	 * @param Object
	 *            [] filter
	 * @return List
	 * @throws DataAccessException
	 */
	public List<?> getTsysDutyByArray(Object[] filter) throws ServiceException;

	/**
	 * 取得分页总数
	 * 
	 * @param hql
	 * @param filter
	 * @return
	 * @throws DataAccessException
	 */

	public int getTsysDutyDataTotalNum(Object[] filter) throws ServiceException;

	/**
	 * 把查询条件构造成MAP来查询TsysDuty信息
	 * 
	 * @param Map
	 *            filter
	 * @return List
	 * @throws DataAccessException
	 */
	public List<?> getTsysDutyByMap(Map<String, Object> filter)
			throws ServiceException;

	/**
	 * 分页查询
	 * 
	 * @param hql
	 * @param object
	 * @param page_size
	 * @param pageNo
	 * @return
	 * @throws DataAccessException
	 */

	public List<?> getTsysDutyPageDataByArray(Object[] filter, int page_size,
			int pageNo) throws ServiceException;

	/**
	 * 分页查询。
	 * 
	 * @param hql
	 * @param obj
	 *            ：MAP条件构造
	 * @param page_size
	 * @param pageNo
	 * @return
	 * @throws DataAccessException
	 */
	public List<?> getTsysDutyPageDataByMap(Map<String, Object> filter,
			int page_size, int pageNo) throws ServiceException;

	/**
	 * 利用SQL数组条件来查询记录
	 * 
	 * @param sql
	 * @param object
	 * @return
	 * @throws DataAccessException
	 */
	public List<?> getTsysDutyValueObjectWithSQLByArray(Object[] filter)
			throws ServiceException;

	/**
	 * 通过配置SQL来执行查询带多个参数的情况 包括SQL语句、存储过程等
	 * 
	 * @param queryName
	 * @param object
	 * @return
	 * @throws DataAccessException
	 */
	public List<?> getTsysDutyValueObjectByNameQuery(String queryName,
			Object[] filter) throws ServiceException;

	/**
	 * 动态构造HQL参数
	 * 
	 * @param detachedCriteria
	 * @return
	 * @throws ServiceException
	 */
	public List<?> getTsysDutyValueObjectByDetachedCriteria(
			DetachedCriteria detachedCriteria) throws ServiceException;

	/**
	 * 动态构造HQL参数
	 * 
	 * @param detachedCriteria
	 * @return
	 * @throws ServiceException
	 */
	public List<?> getTsysDutyValueObjectByDetachedCriterias(
			DetachedCriteria detachedCriteria, int arg1, int arg2)
			throws ServiceException;

	/**
	 * 根据岗位ID获取该岗位下面的所有用户
	 * 
	 * @param dutyid
	 * @return
	 * @throws ServiceException
	 */
	public List<TaclDutyuser> getUserAllByDutyId(String dutyid)
			throws ServiceException;

	/**
	 * 根据岗位ID 获取岗位用户对应
	 * 
	 * @param dutyid
	 * @return
	 * @throws ServiceException
	 */
	public List<TaclDutyuser> getTaclDutyuserByDutyid(final String dutyid)
			throws ServiceException;
}
