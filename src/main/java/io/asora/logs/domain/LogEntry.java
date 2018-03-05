package io.asora.logs.domain;

import java.util.Date;

public class LogEntry {

    private String cat;
    private D0 d0;
    private String d1;
    private String d2;
    private String d3;
    private String d4;
    private String tab;
    private Date tstamp;

    public LogEntry() {
    }

    public LogEntry(String cat, D0 d0, String d1, String d2, String d3, String d4, String tab, Date tstamp) {
        this.cat = cat;
        this.d0 = d0;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.tab = tab;
        this.tstamp = tstamp;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public D0 getD0() {
        return d0;
    }

    public void setD0(D0 d0) {
        this.d0 = d0;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getD4() {
        return d4;
    }

    public void setD4(String d4) {
        this.d4 = d4;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public Date getTstamp() {
        return tstamp;
    }

    public void setTstamp(Date tstamp) {
        this.tstamp = tstamp;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "cat='" + cat + '\'' +
                ", d0=" + d0.toString() +
                ", d1='" + d1 + '\'' +
                ", d2='" + d2 + '\'' +
                ", d3='" + d3 + '\'' +
                ", d4='" + d4 + '\'' +
                ", tab='" + tab + '\'' +
                ", tstamp=" + tstamp +
                '}';
    }
}

class D0 {

    private String raw;
    private String source;

    public D0(String raw) {
        this.raw = raw;
    }

    public D0(String raw, String source) {
        this.raw = raw;
        this.source = source;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "D0{" +
                "raw='" + raw + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
