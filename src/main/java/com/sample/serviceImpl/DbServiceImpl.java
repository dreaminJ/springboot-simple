package com.sample.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.CommonDao;
import com.sample.service.DbService;



@Service("dbService")
public class DbServiceImpl implements DbService{

    @Autowired
    CommonDao commonDAO;
 
    /* select dual */
    public String getDual() throws Exception{
        return commonDAO.getDual();
    }


}
