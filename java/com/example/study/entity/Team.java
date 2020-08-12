package com.example.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author caorongwu
 * @since 2020-08-11
 */
public class Team extends Model<Team> {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "team_id", type = IdType.AUTO)
    private Long teamId;

    /**
     * 团队名称
     */
    private String teamName;

    /**
     * 管理员ID
     */
    private Long adminId;

    /**
     * 队长ID
     */
    private Long leaderId;

    /**
     * 队长名称
     */
    private String leaderName;

    /**
     * 团队描述
     */
    private String teamDescribe;

    /**
     * 团队类型
     */
    private String teamType;

    /**
     * 团队范围（校内、校外）
     */
    private String teamScope;

    /**
     * 团队当前人数
     */
    private Integer teamNumber;

    /**
     * 团队计划人数
     */
    private Integer sumNumber;

    /**
     * 团队创建日期
     */
    private LocalDate teamDate;

    /**
     * 团队状态(0表示发起组队，1表示管理员审核通过、2表示完成组队)
     */
    private Integer status;

    /**
     * 人员类型
     */
    private String staff;

    /**
     * 团队性质
     */
    private String teamNature;

    /**
     * 团队标签
     */
    private String teamLabel;

    /**
     * 查看人数
     */
    private Integer seeNum;


    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getTeamDescribe() {
        return teamDescribe;
    }

    public void setTeamDescribe(String teamDescribe) {
        this.teamDescribe = teamDescribe;
    }

    public String getTeamType() {
        return teamType;
    }

    public void setTeamType(String teamType) {
        this.teamType = teamType;
    }

    public String getTeamScope() {
        return teamScope;
    }

    public void setTeamScope(String teamScope) {
        this.teamScope = teamScope;
    }

    public Integer getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(Integer teamNumber) {
        this.teamNumber = teamNumber;
    }

    public Integer getSumNumber() {
        return sumNumber;
    }

    public void setSumNumber(Integer sumNumber) {
        this.sumNumber = sumNumber;
    }

    public LocalDate getTeamDate() {
        return teamDate;
    }

    public void setTeamDate(LocalDate teamDate) {
        this.teamDate = teamDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getTeamNature() {
        return teamNature;
    }

    public void setTeamNature(String teamNature) {
        this.teamNature = teamNature;
    }

    public String getTeamLabel() {
        return teamLabel;
    }

    public void setTeamLabel(String teamLabel) {
        this.teamLabel = teamLabel;
    }

    public Integer getSeeNum() {
        return seeNum;
    }

    public void setSeeNum(Integer seeNum) {
        this.seeNum = seeNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.teamId;
    }

    @Override
    public String toString() {
        return "Team{" +
        "teamId=" + teamId +
        ", teamName=" + teamName +
        ", adminId=" + adminId +
        ", leaderId=" + leaderId +
        ", leaderName=" + leaderName +
        ", teamDescribe=" + teamDescribe +
        ", teamType=" + teamType +
        ", teamScope=" + teamScope +
        ", teamNumber=" + teamNumber +
        ", sumNumber=" + sumNumber +
        ", teamDate=" + teamDate +
        ", status=" + status +
        ", staff=" + staff +
        ", teamNature=" + teamNature +
        ", teamLabel=" + teamLabel +
        ", seeNum=" + seeNum +
        "}";
    }
}
