package com.java.flex.benchmarkflex.repository.impl;

import com.java.flex.benchmarkflex.module.domain.DspAdvertiserCost;
import com.java.flex.benchmarkflex.module.domain.table.DspAdvertiserCostTableDef;
import com.java.flex.benchmarkflex.repository.DspAdvertiserCostRepository;
import com.java.flex.benchmarkflex.repository.mapper.DspAdvertiserCostDao;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kscs
 */
@Slf4j
@Repository
@RequiredArgsConstructor
public class DspAdvertiserCostRepositoryImpl extends ServiceImpl<DspAdvertiserCostDao,DspAdvertiserCost> implements DspAdvertiserCostRepository {

    private final DspAdvertiserCostDao dspAdvertiserCostDao;
    @Override
    public List<DspAdvertiserCost> queryDspAdvertiserCost(List<Long> advertiserIds) {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select(DspAdvertiserCostTableDef.DSP_ADVERTISER_COST.ALL_COLUMNS)
            .where(DspAdvertiserCostTableDef.DSP_ADVERTISER_COST.ADVERTISER_ID.in(advertiserIds))
            .and(DspAdvertiserCostTableDef.DSP_ADVERTISER_COST.ADVERTISER_ID.isNotNull())
            .groupBy(DspAdvertiserCostTableDef.DSP_ADVERTISER_COST.ADVERTISER_ID)
            .orderBy(DspAdvertiserCostTableDef.DSP_ADVERTISER_COST.COST.desc(),
                DspAdvertiserCostTableDef.DSP_ADVERTISER_COST.ADVERTISER_NAME.desc());
        List<DspAdvertiserCost> dspAdvertiserCosts = dspAdvertiserCostDao.selectListByQuery(queryWrapper);

        saveBatch(dspAdvertiserCosts);
        return dspAdvertiserCostDao.selectListByQuery(queryWrapper);
    }
}
