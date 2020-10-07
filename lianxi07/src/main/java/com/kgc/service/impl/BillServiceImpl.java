package com.kgc.service.impl;

import com.kgc.mapper.BillsMapper;
import com.kgc.pojo.Bills;
import com.kgc.pojo.BillsExample;
import com.kgc.pojo.Billtype;
import com.kgc.service.BillService;
import com.kgc.service.BillTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("billService")
public class BillServiceImpl implements BillService {
    @Resource
    BillsMapper billsMapper;
    @Resource
    BillTypeService billTypeService;

    @Override
    public List<Bills> selectAll() {
        List<Bills> bills=billsMapper.selectByExample(null);
        for(Bills bills1:bills){
            if(bills1.getTypeid()!=null){
                List<Billtype> billtypes = billTypeService.selectType(bills1.getTypeid());
                bills1.setTypename(billtypes.get(0).getName());
            }
        }
        return bills;
    }

    @Override
    public int add(Bills bills) {
        return billsMapper.insertSelective(bills);
    }
}
