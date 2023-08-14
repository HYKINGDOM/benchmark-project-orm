package com.java.spring.jpa.beanchmarkjpa.module.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author kscs
 */
@Entity
@Table(name = "dsp_advertiser_cost")
@Data
public class DspAdvertiserCost {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date auditPassTime;

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
    private BigDecimal cost;

    /** 现金消耗 */
    private BigDecimal cashCost;

    /** 竞价现金消耗 */
    private BigDecimal bidCost;

    /** 品牌现金消耗 */
    private BigDecimal brandCost;

    /** 赠款消耗 */
    private BigDecimal grantsCost;

    /** CPC消耗 */
    private BigDecimal cpcCost;

    /** CPM消耗 */
    private BigDecimal cpmCost;

    /** oCPC消耗 */
    private BigDecimal ocpcCost;

    /** CPA消耗 */
    private BigDecimal cpaCost;

    /** oCPM消耗 */
    private BigDecimal ocpmCost;

    /** CPV消耗 */
    private BigDecimal cpvCost;

    /** CPT消耗 */
    private BigDecimal cptCost;

    /** GD消耗 */
    private BigDecimal gdCost;

    /** 展示量 */
    private Integer show;

    /** 平均千次展示价格 */
    private BigDecimal cpm;

    /** 点击量 */
    private Integer click;

    /** 点击率(单位:%) */
    private BigDecimal ctr;

    /** 平均点击价格 */
    private BigDecimal cpc;

    /** 转账总次数 */
    private Integer transferCount;

    /** 今日总消耗 */
    private BigDecimal todayCost;

    /** 转账金额 */
    private BigDecimal transferAmount;

    /** 历史总消耗 */
    private BigDecimal historyCost;

    /** 广告主开户天数 */
    private BigDecimal registerDays;

    /** 首消时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date firstCostTime;

    /** 现金余额 */
    private BigDecimal cashBalance;

    /** 赠款余额 */
    private BigDecimal rantBalance;

    /** 归属年 */
    private Integer year;

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

    /** 本省消耗 */
    private BigDecimal nativeProvinceCost;

    /** 外省消耗 */
    private BigDecimal outProvinceCost;

    /** 省外消耗省份 */
    private String outProvinceIds;

    /** 是否同步本省消耗 */
    private Integer isSyncNative;

    /** 首充金额 */
    private BigDecimal firstRechargeAmount;

    /** 首次充值时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date firstRechargeTime;

    /** 最近续费时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastRenewTime;

    /** 续费总次数 */
    private BigDecimal totalRenewNumber;

    /** 总余额 */
    private BigDecimal totalBalance;

    /** 总可用余额 */
    private BigDecimal validBalance;

    /** 归属销售id */
    private Integer salerUserId;

    /** 归属销售姓名 */
    private String salerUserName;

    /** 销售部门id */
    private Integer salerDeptId;

    /** 销售部门名称 */
    private String salerDeptName;

    /** 归属运营id */
    private Integer operUserId;

    /** 归属运营姓名 */

    private String operUserName;

    /** 归属运营部门id */
    private Integer operDeptId;

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
    private Integer delFlag;

    /**
     * 备注
     */
    private String remark;
}
