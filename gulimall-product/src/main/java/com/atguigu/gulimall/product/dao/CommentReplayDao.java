package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author xhh
 * @email 2929836729@qq.com
 * @date 2022-03-23 22:26:35
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
