package com.wendy.used.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "cartDetail")
public class CartDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private Integer id;
	
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm")
	@Column(name = "create_time")
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	
	@Column(name = "cart_id")	
	private Integer cartId;
	
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "product_qty")
	private Integer productQty;
	
}
