package com.itany.zshop.backend.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itany.zshop.commont.constant.PaginationConstant;
import com.itany.zshop.pojo.ProductType;
import com.itany.zshop.service.ProductTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 李纪慰 on 2018/11/9.
 */
@Controller
@RequestMapping("/backend/productType")
public class ProductController {
    @Autowired
    private ProductTypeService productTypeService;
    @RequestMapping("/findAll")
    public String findAll(Integer pageNum,Model model){
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum= PaginationConstant.PAGE_NUM;
        }
        //设置分页
        PageHelper.startPage(pageNum,PaginationConstant.PAGE_SIZE);
        //查找商品所有的类型
        List<ProductType> productTypes=productTypeService.findAll();
        //将查找出的结果封装到PageInfo对象中
        PageInfo<ProductType> pageInfo=new PageInfo<ProductType>(productTypes);
//        pageInfo.getPageNum();
//        pageInfo.getPages();
//        pageInfo.getNextPage();
//        pageInfo.getPrePage();
//        pageInfo.getList();
        model.addAttribute("pageInfo",pageInfo);
        return "productTypeManager";
    }
}
