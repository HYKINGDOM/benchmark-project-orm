package com.java.spring.jpa.beanchmarkjpa.repository.impl;

import com.java.spring.jpa.beanchmarkjpa.module.domain.DspAdvertiserCost;
import com.java.spring.jpa.beanchmarkjpa.repository.DspAdvertiserCostRepository;
import com.java.spring.jpa.beanchmarkjpa.repository.dao.DspAdvertiserCostDao;
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
        return dspAdvertiserCostDao.queryDspAdvertiserCost(advertiserIds);
    }

    @Override
    public void randomSaveDspAdvertiserCost(List<DspAdvertiserCost> advertiserCosts) {
        dspAdvertiserCostDao.saveAll(advertiserCosts);

    }
}
