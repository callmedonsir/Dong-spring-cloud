package com.entity;

import java.io.Serializable;
import java.util.Date;

public class SchJobExecution implements Serializable {
    private Integer id;

    private String jobId;

    private String planExeId;

    private String jobExeId;

    private String preJobId;

    private String jobName;

    private Byte jobLevel;

    private String jobServiceName;

    private String status;

    private Date startTime;

    private Date endTime;

    private Byte elapsedTime;

    private String jobNodeIp;

    private String jobInstanceId;

    private Byte jobNodePort;

    private Byte retrySeq;

    private Date createTime;

    private Date updateTime;

    private Boolean isSubJob;

    private Boolean isWait;

    private String jobExeParam;

    private String jobExeMessage;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    public String getPlanExeId() {
        return planExeId;
    }

    public void setPlanExeId(String planExeId) {
        this.planExeId = planExeId == null ? null : planExeId.trim();
    }

    public String getJobExeId() {
        return jobExeId;
    }

    public void setJobExeId(String jobExeId) {
        this.jobExeId = jobExeId == null ? null : jobExeId.trim();
    }

    public String getPreJobId() {
        return preJobId;
    }

    public void setPreJobId(String preJobId) {
        this.preJobId = preJobId == null ? null : preJobId.trim();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public Byte getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(Byte jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getJobServiceName() {
        return jobServiceName;
    }

    public void setJobServiceName(String jobServiceName) {
        this.jobServiceName = jobServiceName == null ? null : jobServiceName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Byte getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Byte elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String getJobNodeIp() {
        return jobNodeIp;
    }

    public void setJobNodeIp(String jobNodeIp) {
        this.jobNodeIp = jobNodeIp == null ? null : jobNodeIp.trim();
    }

    public String getJobInstanceId() {
        return jobInstanceId;
    }

    public void setJobInstanceId(String jobInstanceId) {
        this.jobInstanceId = jobInstanceId == null ? null : jobInstanceId.trim();
    }

    public Byte getJobNodePort() {
        return jobNodePort;
    }

    public void setJobNodePort(Byte jobNodePort) {
        this.jobNodePort = jobNodePort;
    }

    public Byte getRetrySeq() {
        return retrySeq;
    }

    public void setRetrySeq(Byte retrySeq) {
        this.retrySeq = retrySeq;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsSubJob() {
        return isSubJob;
    }

    public void setIsSubJob(Boolean isSubJob) {
        this.isSubJob = isSubJob;
    }

    public Boolean getIsWait() {
        return isWait;
    }

    public void setIsWait(Boolean isWait) {
        this.isWait = isWait;
    }

    public String getJobExeParam() {
        return jobExeParam;
    }

    public void setJobExeParam(String jobExeParam) {
        this.jobExeParam = jobExeParam == null ? null : jobExeParam.trim();
    }

    public String getJobExeMessage() {
        return jobExeMessage;
    }

    public void setJobExeMessage(String jobExeMessage) {
        this.jobExeMessage = jobExeMessage == null ? null : jobExeMessage.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SchJobExecution other = (SchJobExecution) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getJobId() == null ? other.getJobId() == null : this.getJobId().equals(other.getJobId()))
            && (this.getPlanExeId() == null ? other.getPlanExeId() == null : this.getPlanExeId().equals(other.getPlanExeId()))
            && (this.getJobExeId() == null ? other.getJobExeId() == null : this.getJobExeId().equals(other.getJobExeId()))
            && (this.getPreJobId() == null ? other.getPreJobId() == null : this.getPreJobId().equals(other.getPreJobId()))
            && (this.getJobName() == null ? other.getJobName() == null : this.getJobName().equals(other.getJobName()))
            && (this.getJobLevel() == null ? other.getJobLevel() == null : this.getJobLevel().equals(other.getJobLevel()))
            && (this.getJobServiceName() == null ? other.getJobServiceName() == null : this.getJobServiceName().equals(other.getJobServiceName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getElapsedTime() == null ? other.getElapsedTime() == null : this.getElapsedTime().equals(other.getElapsedTime()))
            && (this.getJobNodeIp() == null ? other.getJobNodeIp() == null : this.getJobNodeIp().equals(other.getJobNodeIp()))
            && (this.getJobInstanceId() == null ? other.getJobInstanceId() == null : this.getJobInstanceId().equals(other.getJobInstanceId()))
            && (this.getJobNodePort() == null ? other.getJobNodePort() == null : this.getJobNodePort().equals(other.getJobNodePort()))
            && (this.getRetrySeq() == null ? other.getRetrySeq() == null : this.getRetrySeq().equals(other.getRetrySeq()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsSubJob() == null ? other.getIsSubJob() == null : this.getIsSubJob().equals(other.getIsSubJob()))
            && (this.getIsWait() == null ? other.getIsWait() == null : this.getIsWait().equals(other.getIsWait()))
            && (this.getJobExeParam() == null ? other.getJobExeParam() == null : this.getJobExeParam().equals(other.getJobExeParam()))
            && (this.getJobExeMessage() == null ? other.getJobExeMessage() == null : this.getJobExeMessage().equals(other.getJobExeMessage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getJobId() == null) ? 0 : getJobId().hashCode());
        result = prime * result + ((getPlanExeId() == null) ? 0 : getPlanExeId().hashCode());
        result = prime * result + ((getJobExeId() == null) ? 0 : getJobExeId().hashCode());
        result = prime * result + ((getPreJobId() == null) ? 0 : getPreJobId().hashCode());
        result = prime * result + ((getJobName() == null) ? 0 : getJobName().hashCode());
        result = prime * result + ((getJobLevel() == null) ? 0 : getJobLevel().hashCode());
        result = prime * result + ((getJobServiceName() == null) ? 0 : getJobServiceName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getElapsedTime() == null) ? 0 : getElapsedTime().hashCode());
        result = prime * result + ((getJobNodeIp() == null) ? 0 : getJobNodeIp().hashCode());
        result = prime * result + ((getJobInstanceId() == null) ? 0 : getJobInstanceId().hashCode());
        result = prime * result + ((getJobNodePort() == null) ? 0 : getJobNodePort().hashCode());
        result = prime * result + ((getRetrySeq() == null) ? 0 : getRetrySeq().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsSubJob() == null) ? 0 : getIsSubJob().hashCode());
        result = prime * result + ((getIsWait() == null) ? 0 : getIsWait().hashCode());
        result = prime * result + ((getJobExeParam() == null) ? 0 : getJobExeParam().hashCode());
        result = prime * result + ((getJobExeMessage() == null) ? 0 : getJobExeMessage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", jobId=").append(jobId);
        sb.append(", planExeId=").append(planExeId);
        sb.append(", jobExeId=").append(jobExeId);
        sb.append(", preJobId=").append(preJobId);
        sb.append(", jobName=").append(jobName);
        sb.append(", jobLevel=").append(jobLevel);
        sb.append(", jobServiceName=").append(jobServiceName);
        sb.append(", status=").append(status);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", elapsedTime=").append(elapsedTime);
        sb.append(", jobNodeIp=").append(jobNodeIp);
        sb.append(", jobInstanceId=").append(jobInstanceId);
        sb.append(", jobNodePort=").append(jobNodePort);
        sb.append(", retrySeq=").append(retrySeq);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isSubJob=").append(isSubJob);
        sb.append(", isWait=").append(isWait);
        sb.append(", jobExeParam=").append(jobExeParam);
        sb.append(", jobExeMessage=").append(jobExeMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}