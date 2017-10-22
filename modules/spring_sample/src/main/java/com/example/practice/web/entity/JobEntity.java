package com.example.practice.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 職業を表すEntityオブジェクト
 * @since 2017/10/22
 */
@Entity
@Table(name = "jobs", schema = "DRAQUE")
public class JobEntity {

    /** 職業ID */
    @Id
    @Column(name = "job_id")
    private int jobId;

    /** 職業名 */
    @Column(name = "job_name")
    private String jobName;

    /** 備考 */
    @Column
    private String memo;

    public int getJobId() {
        return jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public String getMemo() {
        return memo;
    }

    public void setJobId(final int jobId) {
        this.jobId = jobId;
    }

    public void setJobName(final String jobName) {
        this.jobName = jobName;
    }

    public void setMemo(final String memo) {
        this.memo = memo;
    }
}
