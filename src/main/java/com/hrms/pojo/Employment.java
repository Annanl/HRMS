package com.hrms.pojo;

public class Employment {
    private Integer eid;

    private Integer sid;

    private Integer employStatus;

    private Integer departmentId;

    private String position;

    private String username;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getEmployStatus() {
        return employStatus;
    }

    public void setEmployStatus(Integer employStatus) {
        this.employStatus = employStatus;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Override
    public String toString() {
        return "Employment{" +
                "eid=" + eid +
                ", sid=" + sid +
                ", employStatus=" + employStatus +
                ", departmentId=" + departmentId +
                ", position='" + position + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}