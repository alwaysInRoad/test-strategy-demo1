package com.zr.util;

//import org.springframework.util.StringUtils;


/**
 * mysql鏁版嵁搴撹繛鎺rl鍏蜂綋澶勭悊绫�
 * @author zhurun
 * @date 2018-9-5
 *
 */
public class mysqlDBPathSub implements DBPathSub {

	@Override
	public String getDataBaseName(String dbPath) {
		if(dbPath != null){
		    if(dbPath.contains("?")){
                return dbPath.substring(dbPath.lastIndexOf("/")+1, dbPath.indexOf("?"));
            }else {
                return dbPath.substring(dbPath.lastIndexOf("/")+1, dbPath.length());
            }
		}
		return null;
	}

	@Override
	public String getServer(String dbPath) {
		if(dbPath != null){
			return dbPath.substring(dbPath.indexOf("/")+2,dbPath.lastIndexOf("/"));
		}
		return null;
	}

}
