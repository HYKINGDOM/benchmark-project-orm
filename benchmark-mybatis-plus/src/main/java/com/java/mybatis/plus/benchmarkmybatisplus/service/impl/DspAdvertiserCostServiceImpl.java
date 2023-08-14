package com.java.mybatis.plus.benchmarkmybatisplus.service.impl;

import com.java.mybatis.plus.benchmarkmybatisplus.module.domain.DspAdvertiserCost;
import com.java.mybatis.plus.benchmarkmybatisplus.service.DspAdvertiserCostService;
import com.java.mybatis.plus.benchmarkmybatisplus.repository.DspAdvertiserCostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kscs
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class DspAdvertiserCostServiceImpl implements DspAdvertiserCostService {


    private final DspAdvertiserCostRepository dspAdvertiserCostRepository;

    @Override
    public List<DspAdvertiserCost> queryDspAdvertiserCost(List<Long> advertiserIds) {
        return dspAdvertiserCostRepository.queryDspAdvertiserCost(advertiserIds);
    }



}
