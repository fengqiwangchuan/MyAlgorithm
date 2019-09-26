package test;

import java.util.Date;

public class MedicalCase {
    private String orgcode;//医疗机构组织机构代码
    private String number;//门急诊号
    private String office;//科室名称
    private String name;//患者姓名
    private int sex;//1 男 0 女
    private Date birthdate;//出生日期
    private int age;//年龄
    private int isgm;//1 true 0 false
    private String gmhistory;//过敏史
    private Date jzdate;//就诊日期时间
    private int isfirst;//1 初诊 0 不是
    private String zhusu;//主诉
    private String xbs;//现病史
    private String jws;//既往史
    private String tgjc;//体格检查
    private String zysz;//中医四诊
    private String fzjcproject;//辅助检查项目
    private String fzjcresult;//辅助检查结果
    private String xyzdcode;//西医诊断编码
    private String xyzdname;//西医诊断名称
    private String zyzdcode;//中医诊断编码
    private String zyzdname;//中医诊断名称
    private String bzcode;//辩证分型代码
    private String bzname;//辩证分型名称
    private String bzbase;//辩证依据
    private String zhizezhifa;//治则治法
    private int yizhucode;//医嘱项目类型代码
    private String yizhuproject;//医嘱项目
    private String yizhuremark;//医嘱备注信息
    private Date yizhudate;//医嘱开立日期时间
    private String yizhuname;//医嘱开立者签名
    private String yizhukeshi;//医嘱开立科室
    private String charge;//收费项目
    private String yizhuchecker;//医嘱审核人签名
    private Date checkdate;//审核日期时间
    private Date yizhuexecute;//医嘱执行日期时间
    private String zhixingyizhuname;//执行医嘱者签名
    private String zhixingkeshi;//医嘱执行科室
    private String yizhustate;//医嘱执行状态
    private Date yizhucancel;//医嘱取消日期时间
    private String yizhucancelname;//取消医嘱者签名
    private String elecnumber;//电子申请单编号
    private String doctor;//医师签名

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIsgm() {
        return isgm;
    }

    public void setIsgm(int isgm) {
        this.isgm = isgm;
    }

    public String getGmhistory() {
        return gmhistory;
    }

    public void setGmhistory(String gmhistory) {
        this.gmhistory = gmhistory;
    }

    public Date getJzdate() {
        return jzdate;
    }

    public void setJzdate(Date jzdate) {
        this.jzdate = jzdate;
    }

    public int getIsfirst() {
        return isfirst;
    }

    public void setIsfirst(int isfirst) {
        this.isfirst = isfirst;
    }

    public String getZhusu() {
        return zhusu;
    }

    public void setZhusu(String zhusu) {
        this.zhusu = zhusu;
    }

    public String getXbs() {
        return xbs;
    }

    public void setXbs(String xbs) {
        this.xbs = xbs;
    }

    public String getJws() {
        return jws;
    }

    public void setJws(String jws) {
        this.jws = jws;
    }

    public String getTgjc() {
        return tgjc;
    }

    public void setTgjc(String tgjc) {
        this.tgjc = tgjc;
    }

    public String getZysz() {
        return zysz;
    }

    public void setZysz(String zysz) {
        this.zysz = zysz;
    }

    public String getFzjcproject() {
        return fzjcproject;
    }

    public void setFzjcproject(String fzjcproject) {
        this.fzjcproject = fzjcproject;
    }

    public String getFzjcresult() {
        return fzjcresult;
    }

    public void setFzjcresult(String fzjcresult) {
        this.fzjcresult = fzjcresult;
    }

    public String getXyzdcode() {
        return xyzdcode;
    }

    public void setXyzdcode(String xyzdcode) {
        this.xyzdcode = xyzdcode;
    }

    public String getXyzdname() {
        return xyzdname;
    }

    public void setXyzdname(String xyzdname) {
        this.xyzdname = xyzdname;
    }

    public String getZyzdcode() {
        return zyzdcode;
    }

    public void setZyzdcode(String zyzdcode) {
        this.zyzdcode = zyzdcode;
    }

    public String getZyzdname() {
        return zyzdname;
    }

    public void setZyzdname(String zyzdname) {
        this.zyzdname = zyzdname;
    }

    public String getBzcode() {
        return bzcode;
    }

    public void setBzcode(String bzcode) {
        this.bzcode = bzcode;
    }

    public String getBzname() {
        return bzname;
    }

    public void setBzname(String bzname) {
        this.bzname = bzname;
    }

    public String getBzbase() {
        return bzbase;
    }

    public void setBzbase(String bzbase) {
        this.bzbase = bzbase;
    }

    public String getZhizezhifa() {
        return zhizezhifa;
    }

    public void setZhizezhifa(String zhizezhifa) {
        this.zhizezhifa = zhizezhifa;
    }

    public int getYizhucode() {
        return yizhucode;
    }

    public void setYizhucode(int yizhucode) {
        this.yizhucode = yizhucode;
    }

    public String getYizhuproject() {
        return yizhuproject;
    }

    public void setYizhuproject(String yizhuproject) {
        this.yizhuproject = yizhuproject;
    }

    public String getYizhuremark() {
        return yizhuremark;
    }

    public void setYizhuremark(String yizhuremark) {
        this.yizhuremark = yizhuremark;
    }

    public Date getYizhudate() {
        return yizhudate;
    }

    public void setYizhudate(Date yizhudate) {
        this.yizhudate = yizhudate;
    }

    public String getYizhuname() {
        return yizhuname;
    }

    public void setYizhuname(String yizhuname) {
        this.yizhuname = yizhuname;
    }

    public String getYizhukeshi() {
        return yizhukeshi;
    }

    public void setYizhukeshi(String yizhukeshi) {
        this.yizhukeshi = yizhukeshi;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getYizhuchecker() {
        return yizhuchecker;
    }

    public void setYizhuchecker(String yizhuchecker) {
        this.yizhuchecker = yizhuchecker;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Date getYizhuexecute() {
        return yizhuexecute;
    }

    public void setYizhuexecute(Date yizhuexecute) {
        this.yizhuexecute = yizhuexecute;
    }

    public String getZhixingyizhuname() {
        return zhixingyizhuname;
    }

    public void setZhixingyizhuname(String zhixingyizhuname) {
        this.zhixingyizhuname = zhixingyizhuname;
    }

    public String getZhixingkeshi() {
        return zhixingkeshi;
    }

    public void setZhixingkeshi(String zhixingkeshi) {
        this.zhixingkeshi = zhixingkeshi;
    }

    public String getYizhustate() {
        return yizhustate;
    }

    public void setYizhustate(String yizhustate) {
        this.yizhustate = yizhustate;
    }

    public Date getYizhucancel() {
        return yizhucancel;
    }

    public void setYizhucancel(Date yizhucancel) {
        this.yizhucancel = yizhucancel;
    }

    public String getYizhucancelname() {
        return yizhucancelname;
    }

    public void setYizhucancelname(String yizhucancelname) {
        this.yizhucancelname = yizhucancelname;
    }

    public String getElecnumber() {
        return elecnumber;
    }

    public void setElecnumber(String elecnumber) {
        this.elecnumber = elecnumber;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "MedicalCase{" +
                "orgcode='" + orgcode + '\'' +
                ", number='" + number + '\'' +
                ", office='" + office + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", age=" + age +
                ", isgm=" + isgm +
                ", gmhistory='" + gmhistory + '\'' +
                ", jzdate=" + jzdate +
                ", isfirst=" + isfirst +
                ", zhusu='" + zhusu + '\'' +
                ", xbs='" + xbs + '\'' +
                ", jws='" + jws + '\'' +
                ", tgjc='" + tgjc + '\'' +
                ", zysz='" + zysz + '\'' +
                ", fzjcproject='" + fzjcproject + '\'' +
                ", fzjcresult='" + fzjcresult + '\'' +
                ", xyzdcode='" + xyzdcode + '\'' +
                ", xyzdname='" + xyzdname + '\'' +
                ", zyzdcode='" + zyzdcode + '\'' +
                ", zyzdname='" + zyzdname + '\'' +
                ", bzcode='" + bzcode + '\'' +
                ", bzname='" + bzname + '\'' +
                ", bzbase='" + bzbase + '\'' +
                ", zhizezhifa='" + zhizezhifa + '\'' +
                ", yizhucode=" + yizhucode +
                ", yizhuproject='" + yizhuproject + '\'' +
                ", yizhuremark='" + yizhuremark + '\'' +
                ", yizhudate=" + yizhudate +
                ", yizhuname='" + yizhuname + '\'' +
                ", yizhukeshi='" + yizhukeshi + '\'' +
                ", charge='" + charge + '\'' +
                ", yizhuchecker='" + yizhuchecker + '\'' +
                ", checkdate=" + checkdate +
                ", yizhuexecute=" + yizhuexecute +
                ", zhixingyizhuname='" + zhixingyizhuname + '\'' +
                ", zhixingkeshi='" + zhixingkeshi + '\'' +
                ", yizhustate='" + yizhustate + '\'' +
                ", yizhucancel=" + yizhucancel +
                ", yizhucancelname='" + yizhucancelname + '\'' +
                ", elecnumber='" + elecnumber + '\'' +
                ", doctor='" + doctor + '\'' +
                '}';
    }
}
