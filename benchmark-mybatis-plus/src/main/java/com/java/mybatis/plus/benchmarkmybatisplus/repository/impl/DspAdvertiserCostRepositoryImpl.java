package com.java.mybatis.plus.benchmarkmybatisplus.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.java.mybatis.plus.benchmarkmybatisplus.module.domain.DspAdvertiserCost;
import com.java.mybatis.plus.benchmarkmybatisplus.repository.DspAdvertiserCostRepository;
import com.java.mybatis.plus.benchmarkmybatisplus.repository.dao.DspAdvertiserCostDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class DspAdvertiserCostRepositoryImpl implements DspAdvertiserCostRepository {

    private final DspAdvertiserCostDao dspAdvertiserCostDao;

    @Override
    public List<DspAdvertiserCost> queryDspAdvertiserCost(List<Long> advertiserIds) {
        LambdaQueryWrapper<DspAdvertiserCost> dspAdvertiserCostQueryWrapper = Wrappers.lambdaQuery();
        dspAdvertiserCostQueryWrapper.in(DspAdvertiserCost::getAdvertiserId, advertiserIds);
        dspAdvertiserCostQueryWrapper.isNotNull(DspAdvertiserCost::getAdvertiserId);
        dspAdvertiserCostQueryWrapper.groupBy(DspAdvertiserCost::getAdvertiserId);
        dspAdvertiserCostQueryWrapper.orderByDesc(DspAdvertiserCost::getCost);
        dspAdvertiserCostQueryWrapper.orderByDesc(DspAdvertiserCost::getAdvertiserName);
        return dspAdvertiserCostDao.selectList(dspAdvertiserCostQueryWrapper);
    }
}
