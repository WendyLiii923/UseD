package com.wendy.used.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "used_order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm")
	@Column(name = "createTime")
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	
	@Column(name = "memberId")
	private Integer memberId;
	
	@Column(name = "totalPrice")
	private Integer totalPrice;
	
	@Column(name = "shippingFee")
	private Integer shippingFee;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone")
	private String phone;
	
//	@Transient
//	private List<OrderDetailView> orderDetailViewList;

}
