package com.java.spring.jpa.beanchmarkjpa.service.impl;

import com.java.spring.jpa.beanchmarkjpa.module.domain.DspAdvertiserCost;
import com.java.spring.jpa.beanchmarkjpa.repository.DspAdvertiserCostRepository;
import com.java.spring.jpa.beanchmarkjpa.service.DspAdvertiserCostService;
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
