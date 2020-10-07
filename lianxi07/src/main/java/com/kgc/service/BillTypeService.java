package com.kgc.service;

import com.kgc.pojo.Billtype;

import java.util.List;

public interface BillTypeService {
    List<Billtype> selectType(Integer id);
    List<Billtype> selectAll();
}
