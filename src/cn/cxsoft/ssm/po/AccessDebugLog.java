package cn.cxsoft.ssm.po;

import java.util.Date;

public class AccessDebugLog {
	
    private String uniqueId;

    private String clientIp;

    private String command;

    private String debugType;

    private Date gbReceiveRepTime;

    private Date gbReceiveReqTime;

    private Date receiveRepTime;

    private Date receiveReqTime;

    private String sn;

    private String vin;

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId == null ? null : uniqueId.trim();
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public String getDebugType() {
        return debugType;
    }

    public void setDebugType(String debugType) {
        this.debugType = debugType == null ? null : debugType.trim();
    }

    public Date getGbReceiveRepTime() {
        return gbReceiveRepTime;
    }

    public void setGbReceiveRepTime(Date gbReceiveRepTime) {
        this.gbReceiveRepTime = gbReceiveRepTime;
    }

    public Date getGbReceiveReqTime() {
        return gbReceiveReqTime;
    }

    public void setGbReceiveReqTime(Date gbReceiveReqTime) {
        this.gbReceiveReqTime = gbReceiveReqTime;
    }

    public Date getReceiveRepTime() {
        return receiveRepTime;
    }

    public void setReceiveRepTime(Date receiveRepTime) {
        this.receiveRepTime = receiveRepTime;
    }

    public Date getReceiveReqTime() {
        return receiveReqTime;
    }

    public void setReceiveReqTime(Date receiveReqTime) {
        this.receiveReqTime = receiveReqTime;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }
}