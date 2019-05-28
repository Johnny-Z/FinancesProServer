package com.generator_example.demo.service;
import com.generator_example.demo.model.expense.Expense;
import com.generator_example.demo.core.Service;

/**
* Class Description: xxx
* @author Johnny-Z
* @date 2019/05/26.
*/
public interface ExpenseService extends Service<Expense> {
    Expense selectByFromWho(String fromWho);
}
