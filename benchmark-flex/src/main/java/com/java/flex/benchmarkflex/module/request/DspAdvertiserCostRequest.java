package com.java.flex.benchmarkflex.module.request;

import lombok.Data;

/**
 * @author kscs
 */
public class DspAdvertiserCostRequest {

    /** 代理商名称 */
    private String advertiserId;


    public String getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
    }
}
