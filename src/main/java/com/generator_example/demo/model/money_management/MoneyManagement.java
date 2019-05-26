package com.generator_example.demo.model.money_management;

import java.util.Date;
import javax.persistence.*;

@Table(name = "money_management")
public class MoneyManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 开始日期
     */
    @Column(name = "begin_date")
    private Date beginDate;

    /**
     * 理财平台
     */
    private String platform;

    /**
     * 理财产品名称
     */
    private String name;

    /**
     * 利率
     */
    @Column(name = "rate_of_return")
    private Float rateOfReturn;

    /**
     * 本金
     */
    @Column(name = "capital_sum")
    private Float capitalSum;

    /**
     * 锁定时间
     */
    @Column(name = "locking_date")
    private Date lockingDate;

    /**
     * 财主
     */
    private String belong;

    /**
     * 到期利息
     */
    private Float interest;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取开始日期
     *
     * @return begin_date - 开始日期
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 设置开始日期
     *
     * @param beginDate 开始日期
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取理财平台
     *
     * @return platform - 理财平台
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 设置理财平台
     *
     * @param platform 理财平台
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * 获取理财产品名称
     *
     * @return name - 理财产品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置理财产品名称
     *
     * @param name 理财产品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取利率
     *
     * @return rate_of_return - 利率
     */
    public Float getRateOfReturn() {
        return rateOfReturn;
    }

    /**
     * 设置利率
     *
     * @param rateOfReturn 利率
     */
    public void setRateOfReturn(Float rateOfReturn) {
        this.rateOfReturn = rateOfReturn;
    }

    /**
     * 获取本金
     *
     * @return capital_sum - 本金
     */
    public Float getCapitalSum() {
        return capitalSum;
    }

    /**
     * 设置本金
     *
     * @param capitalSum 本金
     */
    public void setCapitalSum(Float capitalSum) {
        this.capitalSum = capitalSum;
    }

    /**
     * 获取锁定时间
     *
     * @return locking_date - 锁定时间
     */
    public Date getLockingDate() {
        return lockingDate;
    }

    /**
     * 设置锁定时间
     *
     * @param lockingDate 锁定时间
     */
    public void setLockingDate(Date lockingDate) {
        this.lockingDate = lockingDate;
    }

    /**
     * 获取财主
     *
     * @return belong - 财主
     */
    public String getBelong() {
        return belong;
    }

    /**
     * 设置财主
     *
     * @param belong 财主
     */
    public void setBelong(String belong) {
        this.belong = belong;
    }

    /**
     * 获取到期利息
     *
     * @return interest - 到期利息
     */
    public Float getInterest() {
        return interest;
    }

    /**
     * 设置到期利息
     *
     * @param interest 到期利息
     */
    public void setInterest(Float interest) {
        this.interest = interest;
    }
}