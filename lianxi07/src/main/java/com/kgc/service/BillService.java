package com.kgc.service;

import com.kgc.pojo.Bills;

import java.util.List;

public interface BillService {
    List<Bills> selectAll();
    int add(Bills bills);
}
