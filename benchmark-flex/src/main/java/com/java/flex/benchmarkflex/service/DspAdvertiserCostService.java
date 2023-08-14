package com.java.flex.benchmarkflex.service;


import com.java.flex.benchmarkflex.module.domain.DspAdvertiserCost;

import java.util.List;

/**
 * @author kscs
 */
public interface DspAdvertiserCostService {



    List<DspAdvertiserCost> queryDspAdvertiserCost(List<Long> advertiserIds);
}
