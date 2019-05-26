package com.generator_example.demo.web;
import com.generator_example.demo.core.Result;
import com.generator_example.demo.core.ResultGenerator;
import com.generator_example.demo.model.expense.Expense;
import com.generator_example.demo.service.ExpenseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
* Class Description: xxx
* @author Johnny-Z
* @date 2019/05/26.
*/
@RestController
@RequestMapping("/expense")
public class ExpenseController {
    @Resource
    private ExpenseService expenseService;

    @PostMapping("/add")
    public Result add(@RequestBody @NotNull Expense expense) {
        expenseService.save(expense);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        expenseService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody @NotNull Expense expense) {
        expenseService.update(expense);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam @NotNull Integer id) {
        Expense expense = expenseService.findById(id);
        return ResultGenerator.genSuccessResult(expense);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Expense> list = expenseService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
