package com.tianzhen.service.impl;

import com.tianzhen.dao.DeptDao;
import com.tianzhen.pojo.Dept;
import com.tianzhen.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptDao deptDao;


    @Override
    public Dept findById(Long id) {
        return deptDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.selectAll();
    }

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.insertSelective(dept)==1;
    }
}
