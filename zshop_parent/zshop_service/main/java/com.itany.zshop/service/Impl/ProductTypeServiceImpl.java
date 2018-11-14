package com.itany.zshop.service.Impl;

import com.itany.zshop.dao.ProductTypeDao;
import com.itany.zshop.pojo.ProductType;
import com.itany.zshop.service.ProductTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 李纪慰 on 2018/11/10.
 */
@Service()
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeDao productTypeDao;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<ProductType> findAll() {
        return productTypeDao.selectAll();
    }
}
