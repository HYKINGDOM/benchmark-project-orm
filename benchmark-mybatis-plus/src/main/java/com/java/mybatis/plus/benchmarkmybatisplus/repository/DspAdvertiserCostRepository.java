package com.java.mybatis.plus.benchmarkmybatisplus.repository;


import com.java.mybatis.plus.benchmarkmybatisplus.module.domain.DspAdvertiserCost;

import java.util.List;

public interface DspAdvertiserCostRepository {

    List<DspAdvertiserCost> queryDspAdvertiserCost(List<Long> advertiserIds);
}
