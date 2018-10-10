package com.zr.util;

import com.zr.strategy.DBPathSubStrategy;

public class Test {
	//��ǰ��·��  com.zr.util.Test
	private  String clazz = this.getClass().getName();
	
	public static void main(String[] args){
		Test test = new Test();
		try {
			String sql = test.getSql();
			System.out.println(sql);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	public String getSql() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		String dbPath = "jdbc:mysql://192.168.0.00:3306/baidu";
		String dbType = "mysql";
		//��ȡ��ѯ�����������ݿ��url����ȡ���е����ݿ���   ��ͨ�����䴴����
		Class<?> forName = Class.forName(clazz.subSequence(0, clazz.lastIndexOf(".")+1)+dbType.toLowerCase()+"DBPathSub");
		Object obj = forName.newInstance();
		DBPathSubStrategy dbPathSubStrategy = new DBPathSubStrategy((DBPathSub) obj);
		String dataBaseNameNew = dbPathSubStrategy.getDataBaseName(dbPath);
		String sql= "show tables from "+ dataBaseNameNew;
		return sql;
	}
	
}
