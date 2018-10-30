package com.lzy.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseModel implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id;
    @TableField(value = "create_date")
    private Date createDate;
    @TableField(value = "operate_date")
    private Date operateDate;
    @TableField(value = "operate_user_id")
    private Long operateUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public Long getOperateUserId() {
        return operateUserId;
    }

    public void setOperateUserId(Long operateUserId) {
        this.operateUserId = operateUserId;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", operateDate=" + operateDate +
                ", operateUserId=" + operateUserId +
                '}';
    }
}
