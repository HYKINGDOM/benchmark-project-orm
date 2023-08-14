package com.java.mybatis.plus.benchmarkmybatisplus.module.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author kscs
 */
@Data
public class DspAdvertiserCostEntity {

    /** id */
    private Long id;

    /** 代理商 ID */
    private Long agentId;

    /** 代理商名称 */
    private String agentName;

    /** 广告主ID */
    private Long advertiserId;

    /** 广告主名称 */
    private String advertiserName;

    /** 广告主账户类型 */
    private String accountSource;

    /** 广告主账号的过审时间 */
    private String auditPassTime;

    /** 广告主的账户状态 */
    private String accountStatus;

    /** 一级行业 */
    private String firstIndustry;

    /** 二级行业 */
    private String secondIndustry;

    /** 广告主所属公司名称 */
    private String companyName;

    /** 广告主账户的注册时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registerTime;

    /** 总消耗 */
    private Double cost;

    /** 现金消耗 */
    private Double cashCost;

    /** 竞价现金消耗 */
    private Double bidCost;

    /** 品牌现金消耗 */
    private Double brandCost;

    /** 赠款消耗 */
    private Double grantsCost;

    /** CPC消耗 */
    private Double cpcCost;

    /** CPM消耗 */
    private Double cpmCost;

    /** oCPC消耗 */
    private Double ocpcCost;

    /** CPA消耗 */
    private Double cpaCost;

    /** oCPM消耗 */
    private Double ocpmCost;

    /** CPV消耗 */
    private Double cpvCost;

    /** CPT消耗 */
    private Double cptCost;

    /** GD消耗 */
    private Double gdCost;

    /** 展示量 */
    private Integer show;

    /** 平均千次展示价格 */
    private Double cpm;

    /** 点击量 */
    private Integer click;

    /** 点击率(单位:%) */
    private Double ctr;

    /** 平均点击价格 */
    private Double cpc;

    /** 转账总次数 */
    private Integer transferCount;

    /** 今日总消耗 */
    private Double todayCost;

    /** 转账金额 */
    private Double transferAmount;

    /** 历史总消耗 */
    private Double historyCost;

    /** 广告主开户天数 */
    private Double registerDays;

    /** 首消时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date firstCostTime;

    /** 现金余额 */
    private Double cashBalance;

    /** 赠款余额 */
    private Double rantBalance;

    /** 归属年 */
    private String year;

    /** 归属月 */
    private Integer month;

    /** 归属天 */
    private Integer day;

    /** 归属年月日 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    /** 是否同步 */
    private Integer isSync;

    /** 归属年月日开始 */
    private Date dateBegin;

    /** 归属年月日结束 */
    private Date dateEnd;

    /** 本省消耗 */
    private Double nativeProvinceCost;

    /** 外省消耗 */
    private Double outProvinceCost;

    /** 省外消耗省份 */
    private String outProvinceIds;

    /** 是否同步本省消耗 */
    private Integer isSyncNative;

    /** 首充金额 */
    private Double firstRechargeAmount;

    /** 首次充值时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date firstRechargeTime;

    /** 最近续费时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastRenewTime;

    /** 续费总次数 */
    private Double totalRenewNumber;

    /** 总余额 */
    private Double totalBalance;

    /** 总可用余额 */
    private Double validBalance;

    /** 是否同步本省消耗 */
    private Integer isSyncActual;

    /** 归属销售id */
    private Long salerUserId;

    /** 归属销售姓名 */
    private String salerUserName;

    /** 销售部门id */
    private Long salerDeptId;

    /** 销售部门名称 */
    private String salerDeptName;

    /** 归属运营id */
    private Long operUserId;

    /** 归属运营姓名 */

    private String operUserName;

    /** 归属运营部门id */
    private Long operDeptId;

    /** 归属运营部门名称 */
    private String operDeptName;

    /**
     * 创建者
     */
    private String createUser;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新者
     */
    private String updateUser;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 删除标识
     */
    private String delFlag;

    /**
     * 备注
     */
    private String remark;
}
