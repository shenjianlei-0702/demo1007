package com.kgc.controller;

import com.kgc.pojo.Bills;
import com.kgc.pojo.Billtype;
import com.kgc.service.BillService;
import com.kgc.service.BillTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BillController {
    @Resource
    BillTypeService billTypeService;
    @Resource
    BillService billService;

    @RequestMapping("/index")
    public String selectAll(Model model,Integer typeId){
        List<Bills> bills = billService.selectAll();
        List<Billtype> billtypes = billTypeService.selectAll();
        model.addAttribute("billtypes",billtypes);
        model.addAttribute("bills",bills);
        return "index";
    }

    @RequestMapping("/add")
    public String add(Bills bills,Integer typeid,String billtime,Integer price,String explains,String title){
        billService.add(bills);
        return "redirect:selectAll";
    }
}

