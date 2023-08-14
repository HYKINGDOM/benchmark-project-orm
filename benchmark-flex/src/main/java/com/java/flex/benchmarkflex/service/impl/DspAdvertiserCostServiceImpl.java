package com.java.flex.benchmarkflex.service.impl;

import com.java.flex.benchmarkflex.module.domain.DspAdvertiserCost;
import com.java.flex.benchmarkflex.repository.DspAdvertiserCostRepository;
import com.java.flex.benchmarkflex.service.DspAdvertiserCostService;
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
