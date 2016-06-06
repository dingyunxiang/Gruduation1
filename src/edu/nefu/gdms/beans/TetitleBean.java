package edu.nefu.gdms.beans;

import edu.nefu.gdms.domain.Tetitle;

/**
 * Created by dingyunxiang on 16/6/6.
 */
public class TetitleBean {
    private String id;
    private String teid;
    private String tid;
    private String rs;
    private String advise;


    public TetitleBean() {
    }

    public TetitleBean(Tetitle title){
        this.id = title.getId();
        this.teid = title.getTeacher().getTeid();
        this.tid = title.getTitle().getTid();
        this.rs = title.getRs();
        this.advise = title.getAdvise();
    }

    public TetitleBean(String id, String teid, String tid, String rs, String advise) {
        this.id = id;
        this.teid = teid;
        this.tid = tid;
        this.rs = rs;
        this.advise = advise;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeid() {
        return teid;
    }

    public void setTeid(String teid) {
        this.teid = teid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise;
    }
}
