package cn.uc.yiqibang.bean;

import java.io.Serializable;
/**
 * 用户的JavaBean
 * @author 叶远青
 *
 */
import java.util.Date;


public class User implements Serializable{
	/**
	 * 主键id
	 */
	private Integer id;
	/**
	 * 用户姓名
	 */
	private String userName;
	/**
	 * 用户昵称
	 */
	private String nickName;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 用户性别
	 */
	private Boolean sex;
	/**
	 * 用户绑定的手机号
	 */
	private String bindtel;
	/**
	 * 用户邮箱
	 */
	private String email;
	/**
	 * 用户头像
	 */
	private String headimg;
	/**
	 * 用户状态
	 */
	private Boolean state;
	/**
	 * 用户创建时间
	 */
	private Date createtime;
	/**
	 * 用户生日
	 */
	private Date birthday;
	/**
	 * 用户评论
	 */
	private String remark;
	/**
	 * 用户更新
	 */
	private Date update;
	/**
	 * 用户的地址省会的主键
	 */
	private Integer provinceId;
	/**
	 * 用户的地址城市的主键
	 */
	private Integer cityId;
	/**
	 * 用户地址的区域的主键
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
