package com.java.spring.jpa.beanchmarkjpa.service;

import com.java.spring.jpa.beanchmarkjpa.module.domain.DspAdvertiserCost;

import java.util.List;

public interface DspAdvertiserCostService {



    List<DspAdvertiserCost> queryDspAdvertiserCost (List<Long> advertiserIds);
}
