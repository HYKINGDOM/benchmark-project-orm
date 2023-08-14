package com.java.flex.benchmarkflex.repository;



import com.java.flex.benchmarkflex.module.domain.DspAdvertiserCost;
import com.mybatisflex.core.service.IService;

import java.util.List;

/**
 * @author kscs
 */
public interface DspAdvertiserCostRepository extends IService<DspAdvertiserCost> {

    List<DspAdvertiserCost> queryDspAdvertiserCost(List<Long> advertiserIds);
}
