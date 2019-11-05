package com.tianzhen.service;

import com.tianzhen.pojo.Dept;

import java.util.List;

public interface DeptService {
    Dept findById(Long id);

    List<Dept> findAll();

    boolean addDept(Dept dept);
}
