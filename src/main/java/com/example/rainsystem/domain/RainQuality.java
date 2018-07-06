package com.example.rainsystem.domain;

import java.sql.Date;

public class RainQuality {
    private Integer id;
    private String districtname;
    private Date monitortime;
    private  Integer rain;
    private  String monitoringstation;
    private String monitoringaddress;

    public RainQuality() {
    }

    public RainQuality(String districtname, Date monitortime, Integer rain, String monitoringstation, String monitoringaddress) {
        this.districtname = districtname;
        this.monitortime = monitortime;
        this.rain = rain;
        this.monitoringstation = monitoringstation;
        this.monitoringaddress = monitoringaddress;
    }

    public RainQuality(Integer id, String districtname, Date monitortime, Integer rain, String monitoringstation, String monitoringaddress) {
        this.id = id;
        this.districtname = districtname;
        this.monitortime = monitortime;
        this.rain = rain;
        this.monitoringstation = monitoringstation;
        this.monitoringaddress = monitoringaddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    public Date getMonitortime() {
        return monitortime;
    }

    public void setMonitortime(Date monitortime) {
        this.monitortime = monitortime;
    }

    public Integer getRain() {
        return rain;
    }

    public void setRain(Integer rain) {
        this.rain = rain;
    }

    public String getMonitoringstation() {
        return monitoringstation;
    }

    public void setMonitoringstation(String monitoringstation) {
        this.monitoringstation = monitoringstation;
    }

    public String getMonitoringaddress() {
        return monitoringaddress;
    }

    public void setMonitoringaddress(String monitoringaddress) {
        this.monitoringaddress = monitoringaddress;
    }

    @Override
    public String toString() {
        return "RainQuality{" +
                "id=" + id +
                ", districtname='" + districtname + '\'' +
                ", monitortime=" + monitortime +
                ", rain=" + rain +
                ", monitoringstation='" + monitoringstation + '\'' +
                ", monitoringaddress='" + monitoringaddress + '\'' +
                '}';
    }
}
