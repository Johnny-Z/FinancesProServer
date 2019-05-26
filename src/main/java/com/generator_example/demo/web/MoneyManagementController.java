package com.generator_example.demo.web;
import com.generator_example.demo.core.Result;
import com.generator_example.demo.core.ResultGenerator;
import com.generator_example.demo.model.money_management.MoneyManagement;
import com.generator_example.demo.service.MoneyManagementService;
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
@RequestMapping("/money/management")
public class MoneyManagementController {
    @Resource
    private MoneyManagementService moneyManagementService;

    @PostMapping("/add")
    public Result add(@RequestBody @NotNull MoneyManagement moneyManagement) {
        moneyManagementService.save(moneyManagement);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        moneyManagementService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody @NotNull MoneyManagement moneyManagement) {
        moneyManagementService.update(moneyManagement);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam @NotNull Integer id) {
        MoneyManagement moneyManagement = moneyManagementService.findById(id);
        return ResultGenerator.genSuccessResult(moneyManagement);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MoneyManagement> list = moneyManagementService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
