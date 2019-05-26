package com.generator_example.demo.service.impl;

import com.generator_example.demo.dao.AssetMapper;
import com.generator_example.demo.model.asset.Asset;
import com.generator_example.demo.service.AssetService;
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
public class AssetServiceImpl extends AbstractService<Asset> implements AssetService {
    @Resource
    private AssetMapper assetMapper;

}
