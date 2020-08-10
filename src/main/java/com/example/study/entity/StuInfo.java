package com.example.study.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author caorongwu
 * @since 2020-08-11
 */
public class StuInfo extends Model<StuInfo> {

    private static final long serialVersionUID=1L;

    private Long stuId;

    private String stuName;


    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "StuInfo{" +
        "stuId=" + stuId +
        ", stuName=" + stuName +
        "}";
    }
}
