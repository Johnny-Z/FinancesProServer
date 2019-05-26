package com.generator_example.demo.service.impl;

import com.generator_example.demo.dao.ExpenseMapper;
import com.generator_example.demo.model.expense.Expense;
import com.generator_example.demo.service.ExpenseService;
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
public class ExpenseServiceImpl extends AbstractService<Expense> implements ExpenseService {
    @Resource
    private ExpenseMapper expenseMapper;

}
