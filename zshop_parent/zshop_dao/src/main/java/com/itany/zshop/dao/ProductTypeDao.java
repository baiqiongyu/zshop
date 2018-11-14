package com.itany.zshop.dao;

import com.itany.zshop.pojo.ProductType;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 李纪慰 on 2018/11/9.
 */
@Component
public interface  ProductTypeDao {
    public List<ProductType> selectAll();
}
