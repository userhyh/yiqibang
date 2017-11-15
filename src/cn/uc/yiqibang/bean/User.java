package cn.uc.yiqibang.bean;

import java.io.Serializable;
/**
 * �û���JavaBean
 * @author ҶԶ��
 *
 */
import java.util.Date;


public class User implements Serializable{
	/**
	 * ����id
	 */
	private Integer id;
	/**
	 * �û�����
	 */
	private String userName;
	/**
	 * �û��ǳ�
	 */
	private String nickName;
	/**
	 * �û�����
	 */
	private String password;
	/**
	 * �û��Ա�
	 */
	private Boolean sex;
	/**
	 * �û��󶨵��ֻ���
	 */
	private String bindtel;
	/**
	 * �û�����
	 */
	private String email;
	/**
	 * �û�ͷ��
	 */
	private String headimg;
	/**
	 * �û�״̬
	 */
	private Boolean state;
	/**
	 * �û�����ʱ��
	 */
	private Date createtime;
	/**
	 * �û�����
	 */
	private Date birthday;
	/**
	 * �û�����
	 */
	private String remark;
	/**
	 * �û�����
	 */
	private Date update;
	/**
	 * �û��ĵ�ַʡ�������
	 */
	private Integer provinceId;
	/**
	 * �û��ĵ�ַ���е�����
	 */
	private Integer cityId;
	/**
	 * �û���ַ�����������
	 */
	private Integer areaId;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public String getBindtel() {
		return bindtel;
	}
	public void setBindtel(String bindtel) {
		this.bindtel = bindtel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHeadimg() {
		return headimg;
	}
	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getUpdate() {
		return update;
	}
	public void setUpdate(Date update) {
		this.update = update;
	}
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", nickName=" + nickName + ", password=" + password
				+ ", sex=" + sex + ", bindtel=" + bindtel + ", email=" + email + ", headimg=" + headimg + ", state="
				+ state + ", createtime=" + createtime + ", birthday=" + birthday + ", remark=" + remark + ", update="
				+ update + ", provinceId=" + provinceId + ", cityId=" + cityId + ", areaId=" + areaId + "]";
	}	
	
}