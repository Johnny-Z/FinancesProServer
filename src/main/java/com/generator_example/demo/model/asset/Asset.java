package com.generator_example.demo.model.asset;

import java.util.Date;
import javax.persistence.*;

public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 记录日期
     */
    @Column(name = "recod_date")
    private Date recodDate;

    /**
     * 支付宝
     */
    private Float alipay;

    /**
     * 腾讯理财通
     */
    private Float tenpay;

    /**
     * 广大银行
     */
    private Float ceb;

    /**
     * 浙江农信
     */
    private Float zjrc;

    /**
     * 其他银行
     */
    @Column(name = "other_bank")
    private Float otherBank;

    /**
     * 活期
     */
    private Float current;

    /**
     * 老公私房钱
     */
    @Column(name = "dad_money")
    private Float dadMoney;

    /**
     * 现金
     */
    private Float cash;

    /**
     * 其他
     */
    private Float others;

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
     * 获取记录日期
     *
     * @return recod_date - 记录日期
     */
    public Date getRecodDate() {
        return recodDate;
    }

    /**
     * 设置记录日期
     *
     * @param recodDate 记录日期
     */
    public void setRecodDate(Date recodDate) {
        this.recodDate = recodDate;
    }

    /**
     * 获取支付宝
     *
     * @return alipay - 支付宝
     */
    public Float getAlipay() {
        return alipay;
    }

    /**
     * 设置支付宝
     *
     * @param alipay 支付宝
     */
    public void setAlipay(Float alipay) {
        this.alipay = alipay;
    }

    /**
     * 获取腾讯理财通
     *
     * @return tenpay - 腾讯理财通
     */
    public Float getTenpay() {
        return tenpay;
    }

    /**
     * 设置腾讯理财通
     *
     * @param tenpay 腾讯理财通
     */
    public void setTenpay(Float tenpay) {
        this.tenpay = tenpay;
    }

    /**
     * 获取广大银行
     *
     * @return ceb - 广大银行
     */
    public Float getCeb() {
        return ceb;
    }

    /**
     * 设置广大银行
     *
     * @param ceb 广大银行
     */
    public void setCeb(Float ceb) {
        this.ceb = ceb;
    }

    /**
     * 获取浙江农信
     *
     * @return zjrc - 浙江农信
     */
    public Float getZjrc() {
        return zjrc;
    }

    /**
     * 设置浙江农信
     *
     * @param zjrc 浙江农信
     */
    public void setZjrc(Float zjrc) {
        this.zjrc = zjrc;
    }

    /**
     * 获取其他银行
     *
     * @return other_bank - 其他银行
     */
    public Float getOtherBank() {
        return otherBank;
    }

    /**
     * 设置其他银行
     *
     * @param otherBank 其他银行
     */
    public void setOtherBank(Float otherBank) {
        this.otherBank = otherBank;
    }

    /**
     * 获取活期
     *
     * @return current - 活期
     */
    public Float getCurrent() {
        return current;
    }

    /**
     * 设置活期
     *
     * @param current 活期
     */
    public void setCurrent(Float current) {
        this.current = current;
    }

    /**
     * 获取老公私房钱
     *
     * @return dad_money - 老公私房钱
     */
    public Float getDadMoney() {
        return dadMoney;
    }

    /**
     * 设置老公私房钱
     *
     * @param dadMoney 老公私房钱
     */
    public void setDadMoney(Float dadMoney) {
        this.dadMoney = dadMoney;
    }

    /**
     * 获取现金
     *
     * @return cash - 现金
     */
    public Float getCash() {
        return cash;
    }

    /**
     * 设置现金
     *
     * @param cash 现金
     */
    public void setCash(Float cash) {
        this.cash = cash;
    }

    /**
     * 获取其他
     *
     * @return others - 其他
     */
    public Float getOthers() {
        return others;
    }

    /**
     * 设置其他
     *
     * @param others 其他
     */
    public void setOthers(Float others) {
        this.others = others;
    }
}