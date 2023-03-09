package com.wendy.used.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "member")
public class Member{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm")
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	private String name;
	private String password;
	private String email;
	private String phone;
	private String address;

}
