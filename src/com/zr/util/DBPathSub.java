package com.zr.util;

/** 
 * 
 * @author zhurun
 * @date 2018-9-5
 * 连接数据库url 处理类：主要截取出数据库�?
 *
 */
public interface DBPathSub {
	public String getDataBaseName(String dbPath);

	String getServer(String dbPath);
}
