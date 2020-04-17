package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@Accessors(chain=true)
public class Dept implements Serializable{

	private Long 	deptno;
	private String 	dname;
	private String 	db_source;
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
}
