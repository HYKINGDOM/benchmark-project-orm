package com.java.spring.jpa.beanchmarkjpa.repository.dao;

import com.java.spring.jpa.beanchmarkjpa.module.domain.DspAdvertiserCost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DspAdvertiserCostDao extends JpaRepository<DspAdvertiserCost, Long> {

    @Query(
        value = "\tSELECT id, agent_id, agent_name, advertiser_id, advertiser_name, first_industry, second_industry, " +
            "account_source, company_name, audit_pass_time, account_status, register_time, cost, cash_cost, bid_cost," +
            " brand_cost, grants_cost, cpc_cost, cpm_cost, ocpc_cost, cpa_cost, ocpm_cost, cpv_cost, cpt_cost, " +
            "gd_cost, `show`, cpm, click, ctr, cpc, transfer_count, today_cost, transfer_amount, history_cost, " +
            "register_days, first_cost_time, cash_balance, rant_balance, `year`, `month`, `day`, `date`, is_sync, " +
            "native_province_cost, out_province_cost, out_province_ids, is_sync_native, first_recharge_amount, " +
            "first_recharge_time, last_renew_time, total_renew_number, total_balance, valid_balance, is_sycn_actual, " +
            "saler_user_id, saler_user_name, saler_dept_id, saler_dept_name, oper_user_id, oper_user_name, " +
            "oper_dept_id, oper_dept_name, create_time, create_user, update_time, update_user, remark, del_flag FROM " +
            "dsp_advertiser_cost dac WHERE dac.advertiser_id  IN :advertiserIds and advertiser_id is not NULL GROUP " +
            "BY advertiser_id ORDER BY dac.cost, dac.advertiser_name DESC",
        nativeQuery = true)
    List<DspAdvertiserCost> queryDspAdvertiserCost(@Param("advertiserIds") List<Long> advertiserIds);
}
