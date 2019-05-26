package com.generator_example.demo.model.expense;

import java.util.Date;
import javax.persistence.*;

public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 月份
     */
    private Date month;

    /**
     * 花销额
     */
    @Column(name = "total_pay")
    private Float totalPay;

    /**
     * 谁的花销
     */
    @Column(name = "from_who")
    private String fromWho;

    /**
     * 备注信息
     */
    private String info;

    /**
     * 交通花费
     */
    @Column(name = "traffic_pay")
    private Float trafficPay;

    /**
     * 交通备注
     */
    @Column(name = "traffic_info")
    private String trafficInfo;

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
     * 获取月份
     *
     * @return month - 月份
     */
    public Date getMonth() {
        return month;
    }

    /**
     * 设置月份
     *
     * @param month 月份
     */
    public void setMonth(Date month) {
        this.month = month;
    }

    /**
     * 获取花销额
     *
     * @return total_pay - 花销额
     */
    public Float getTotalPay() {
        return totalPay;
    }

    /**
     * 设置花销额
     *
     * @param totalPay 花销额
     */
    public void setTotalPay(Float totalPay) {
        this.totalPay = totalPay;
    }

    /**
     * 获取谁的花销
     *
     * @return from_who - 谁的花销
     */
    public String getFromWho() {
        return fromWho;
    }

    /**
     * 设置谁的花销
     *
     * @param fromWho 谁的花销
     */
    public void setFromWho(String fromWho) {
        this.fromWho = fromWho;
    }

    /**
     * 获取备注信息
     *
     * @return info - 备注信息
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置备注信息
     *
     * @param info 备注信息
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取交通花费
     *
     * @return traffic_pay - 交通花费
     */
    public Float getTrafficPay() {
        return trafficPay;
    }

    /**
     * 设置交通花费
     *
     * @param trafficPay 交通花费
     */
    public void setTrafficPay(Float trafficPay) {
        this.trafficPay = trafficPay;
    }

    /**
     * 获取交通备注
     *
     * @return traffic_info - 交通备注
     */
    public String getTrafficInfo() {
        return trafficInfo;
    }

    /**
     * 设置交通备注
     *
     * @param trafficInfo 交通备注
     */
    public void setTrafficInfo(String trafficInfo) {
        this.trafficInfo = trafficInfo;
    }
}