package com.java.mybatis.plus.benchmarkmybatisplus.service;

import com.java.mybatis.plus.benchmarkmybatisplus.module.domain.DspAdvertiserCost;

import java.util.List;

/**
 * @author kscs
 */
public interface DspAdvertiserCostService {



    List<DspAdvertiserCost> queryDspAdvertiserCost(List<Long> advertiserIds);
}
