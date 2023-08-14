package com.java.spring.jpa.beanchmarkjpa.repository;

import com.java.spring.jpa.beanchmarkjpa.module.domain.DspAdvertiserCost;

import java.util.List;

public interface DspAdvertiserCostRepository {

    List<DspAdvertiserCost> queryDspAdvertiserCost(List<Long> advertiserIds);


    void randomSaveDspAdvertiserCost(List<DspAdvertiserCost> advertiserCosts);
}
