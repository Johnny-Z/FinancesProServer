package com.generator_example.demo.service.impl;

import com.generator_example.demo.dao.MoneyManagementMapper;
import com.generator_example.demo.model.money_management.MoneyManagement;
import com.generator_example.demo.service.MoneyManagementService;
import com.generator_example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
* Class Description: xxx
* @author Johnny-Z
* @date 2019/05/26.
*/
@Service
@Transactional
public class MoneyManagementServiceImpl extends AbstractService<MoneyManagement> implements MoneyManagementService {
    @Resource
    private MoneyManagementMapper moneyManagementMapper;

}
