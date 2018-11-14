package com.itany.zshop.service;

import com.itany.zshop.pojo.ProductType;

import java.util.List;

/**
 * Created by 李纪慰 on 2018/11/10.
 */
public interface ProductTypeService {
    /**
     * 查找所有商品类型信息
     * @return
     */
    public List<ProductType> findAll();
}
