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
@Table(name = "order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm")
	@Column(name = "create_time")
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	
	@Column(name = "member_id")
	private Integer memberId;
	
	@Column(name = "shipping_fee")
	private Integer shippingFee;
	
	@Column(name = "total_price")
	private Integer totalPrice;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone")
	private String phone;
	
//	@Transient
//	private List<OrderDetailView> orderDetailViewList;

}
