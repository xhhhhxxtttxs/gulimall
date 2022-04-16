package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author xhh
 * @email 2929836729@qq.com
 * @date 2022-03-24 14:25:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
