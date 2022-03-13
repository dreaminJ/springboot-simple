package com.sample.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Using an SqlSession
@Component
public class CommonDao {
	@Autowired
	private SqlSession sqlSession;

	public String getDual() {
		return this.sqlSession.selectOne("sample.getDual", "");
		//아래의 경우도 동작함 
		//return this.sqlSession.selectOne("getDual", "");
	}
}