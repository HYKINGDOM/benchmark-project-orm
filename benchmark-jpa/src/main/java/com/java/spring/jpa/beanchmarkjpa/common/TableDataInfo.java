package com.java.spring.jpa.beanchmarkjpa.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author kscs
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableDataInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long total;
    private long currentPage;
    private long nextPage;
    private long totalPage;
    private long prePage;
    private long pageSize;

}
