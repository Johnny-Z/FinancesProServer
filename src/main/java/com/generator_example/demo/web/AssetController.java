package com.generator_example.demo.web;
import com.generator_example.demo.core.Result;
import com.generator_example.demo.core.ResultGenerator;
import com.generator_example.demo.model.asset.Asset;
import com.generator_example.demo.service.AssetService;
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
@RequestMapping("/asset")
public class AssetController {
    @Resource
    private AssetService assetService;

    @PostMapping("/add")
    public Result add(@RequestBody @NotNull Asset asset) {
        assetService.save(asset);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        assetService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody @NotNull Asset asset) {
        assetService.update(asset);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam @NotNull Integer id) {
        Asset asset = assetService.findById(id);
        return ResultGenerator.genSuccessResult(asset);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Asset> list = assetService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
