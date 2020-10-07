package com.kgc.service.impl;

import com.kgc.mapper.BilltypeMapper;
import com.kgc.pojo.Billtype;
import com.kgc.pojo.BilltypeExample;
import com.kgc.service.BillTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("billTypeService")
public class BillTypeServiceImpl implements BillTypeService {
    @Resource
    BilltypeMapper billtypeMapper;

    @Override
    public List<Billtype> selectType(Integer id) {
        BilltypeExample billtypeExample=new BilltypeExample();
        BilltypeExample.Criteria criteria = billtypeExample.createCriteria();
        if(id!=null){
            criteria.andIdEqualTo(id);
        }
        return billtypeMapper.selectByExample(billtypeExample);
    }

    @Override
    public List<Billtype> selectAll() {
        return billtypeMapper.selectByExample(null);
    }
}
