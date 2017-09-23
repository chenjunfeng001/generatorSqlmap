package com.brh.p2p.admin.entity;

public class UserAccountRelationKey {
    private String userid;

    private String acctno;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno == null ? null : acctno.trim();
    }
}