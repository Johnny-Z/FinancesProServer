package com.generator_example.demo.dao;

import com.generator_example.demo.core.Mapper;
import com.generator_example.demo.model.expense.Expense;
import org.apache.ibatis.annotations.Param;

public interface ExpenseMapper extends Mapper<Expense> {
    Expense selectByFromWho(@Param("fromWho") String fromWho);
}