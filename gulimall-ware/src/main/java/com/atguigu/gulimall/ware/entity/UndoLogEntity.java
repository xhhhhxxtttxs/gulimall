package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;


/**
 * @author xhh
 * @email 2929836729@qq.com
 * @date 2022-03-24 15:59:03
 */
@Data
@TableName("undo_log")
public class UndoLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Long id;
    /**
     *
     */
    private Long branchId;
    /**
     *
     */
    private String xid;
    /**
     *
     */
    private String context;
    /**
     *
     */
//	private Longblob rollbackInfo;
    /**
     *
     */
    private Integer logStatus;
    /**
     *
     */
    private Date logCreated;
    /**
     *
     */
    private Date logModified;
    /**
     *
     */
    private String ext;

}
