package com.entity;

import java.util.*;

/*
 * ÿ���ڵ㶼�߱��������ԣ�
id���ڵ�ID���Լ���Զ�����ݺ���Ҫ��
text����ʾ�ڵ��ı���
state���ڵ�״̬��'open' �� 'closed'��Ĭ�ϣ�'open'�����Ϊ'closed'��ʱ�򣬽����Զ�չ���ýڵ㡣
checked����ʾ�ýڵ��Ƿ�ѡ�С�
attributes: ����ӵ��ڵ���Զ������ԡ�
children: һ���ڵ��������������ɽڵ㡣
iconCls:ͼ��
 */
public class TreeData {
	
	private Integer id;
	private String text;
    private String state;
    private Boolean checked;
    private Map<String,Object> attributes;
    private String iconCls;
    private List<TreeData> children ;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public Map<String, Object> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	public List<TreeData> getChildren() {
		return children;
	}
	public void setChildren(List<TreeData> children) {
		this.children = children;
	}
    
}
