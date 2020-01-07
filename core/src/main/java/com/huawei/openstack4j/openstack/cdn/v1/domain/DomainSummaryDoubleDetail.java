package com.huawei.openstack4j.openstack.cdn.v1.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.ModelEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("domain_summary_detail")
public class DomainSummaryDoubleDetail implements ModelEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("start_time")
    private Long startTime;

    @JsonProperty("end_time")
    private Long endTime;

    private Integer interval;

    @JsonProperty("stat_type")
    private String statType;

    private List<Double> values;

    @JsonProperty("service_area")
    private String serviceArea;
}
