package com.java.flex.benchmarkflex.controller;

import com.java.flex.benchmarkflex.common.Result;
import com.java.flex.benchmarkflex.module.request.DspAdvertiserCostRequest;
import com.java.flex.benchmarkflex.service.DspAdvertiserCostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kscs
 */
@RequestMapping("/mf")
@RestController
@RequiredArgsConstructor
public class DspAdvertiserCostController {

    private final DspAdvertiserCostService dspAdvertiserCostService;

    @GetMapping("/query-dsp-advertiser-cost")
    public Result<?> queryDspAdvertiserCost(@RequestBody DspAdvertiserCostRequest dspAdvertiserCostRequest) {
        String[] split = dspAdvertiserCostRequest.getAdvertiserId().split(",");
        List<Long> collect = Arrays.stream(split).map(Long::valueOf).collect(Collectors.toList());
        return Result.success(dspAdvertiserCostService.queryDspAdvertiserCost(collect));
    }
}
