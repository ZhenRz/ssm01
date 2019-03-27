package com.hwua.service;

import com.hwua.entity.Goods;

import java.util.List;

public interface GoodsService {
    public List<Goods> selectAllGoods();
    //分页查询
    public List<Goods> selectAllGoodsForpage(int pageNumber,int pageSize);
}
