package com.zr.strategy;

import com.zr.util.DBPathSub;

/**
 * 鏁版嵁搴撹〃鏄庢埅鍙栫瓥鐣ョ被
 * @author zhurun
 * @date 2018-9-5
 *
 */
public class DBPathSubStrategy {
	//鎸佹湁鐨勫叿浣撶瓥鐣ョ殑瀵硅薄
	private DBPathSub dbPathSub;
	/**
     * 鏋勯�犲嚱鏁帮紝浼犲叆涓�涓叿浣撶瓥鐣ュ璞�
     * @param dbPathSub    鍏蜂綋绛栫暐瀵硅薄
     */
	public DBPathSubStrategy(DBPathSub dbPathSub) {
		super();
		this.dbPathSub = dbPathSub;
	}
	 /**
     * 绛栫暐鏂规硶
     */
	public String getDataBaseName(String dbPath){
		return dbPathSub.getDataBaseName(dbPath);
	}

	public String getServer(String dbPath){
		return dbPathSub.getServer(dbPath);
	}
}
