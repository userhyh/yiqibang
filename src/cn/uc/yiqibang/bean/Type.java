package cn.uc.yiqibang.bean;
/**
 * �������� ʵ����
 * @author tshuo
 *
 */
public class Type {

	private Integer id;
	/**
	 * ��������
	 */
	private String t_name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", t_name=" + t_name + "]";
	}
	
	
}
