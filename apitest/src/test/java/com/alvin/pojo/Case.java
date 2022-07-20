package com.alvin.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Case {
	// 用例编号
	@Excel(name = "用例编号")
	private int id;
	// 用例描述
	@Excel(name = "用例描述")
	private String desc;
	// 参数
	@Excel(name = "参数")
	private String params;
	// 接口编号
	@Excel(name = "接口编号")
	private String apiId;

	public Case(int id, String desc, String params, String apiId) {
		super();
		this.id = id;
		this.desc = desc;
		this.params = params;
		this.apiId = apiId;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public Case() {
		super();
	}
}
