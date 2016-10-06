package com.elitedentalgroup.mybatis.handler;


import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.elitedentalgroup.util.DateTimeUtils;
/**
 * 
 * @author chanpov
 *
 */
public class DateLongTypeHandler implements TypeHandler<Date> {
	
	/**
	 * @param ps
	 * @param parameter
	 * @param i
	 * @param jdbcType
	 * this method was used when insert or update operation from java into db
	 */
	public void setParameter(PreparedStatement ps, int i, Date parameter,
			JdbcType jdbcType) throws SQLException {
		if (parameter != null) {
			Long datetime = DateTimeUtils.getLongOfDate(parameter);
			ps.setLong(i, datetime);
		}else{
			ps.setNull(i, jdbcType.TYPE_CODE);
		}
	}

	/**
	 * @param rs
	 * @param columnName
	 * this method was used when get result from db to java
	 * 
	 */
	public Date getResult(ResultSet rs, String columnName) throws SQLException {
		return DateTimeUtils.parseDateTime(String.valueOf(rs.getLong(columnName)));
	}

	/**
	 * @param rs
	 * @param columnIndex
	 * this method was used when get result from db to java by columnIndex
	 * 
	 */
	public Date getResult(ResultSet rs, int columnIndex) throws SQLException {
		return DateTimeUtils.parseDateTime(String.valueOf(rs.getLong(columnIndex)));
	}

	/**
	 * @param cs
	 * @param columnIndex
	 * this method was used when get result from db to java by columnIndex
	 * 
	 */
	public Date getResult(CallableStatement cs, int columnIndex) throws SQLException {
		return DateTimeUtils.parseDateTime(String.valueOf(cs.getLong(columnIndex)));
	}
}
