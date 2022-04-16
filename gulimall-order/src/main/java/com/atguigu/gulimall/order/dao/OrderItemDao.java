package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author xhh
 * @email 2929836729@qq.com
 * @date 2022-03-24 14:45:48
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
