package com.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class ShopHatOrder {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String orderId;   // Razorpay order id
	    private String receipt;
	    private Integer amount;   // in paise
	    private String currency;
	    private String status;    // CREATED, PAID, FAILED
	    private LocalDateTime createdAt;

	    // Booking-related fields
	    private String userNm;
	    private Long moNO;
	    private int noOfPerson;
	    private String roomType;
	    private Long roomNo;
	    private String checkIn;
	    private String checkout;
		public ShopHatOrder() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ShopHatOrder(Long id, String orderId, String receipt, Integer amount, String currency, String status,
				LocalDateTime createdAt, String userNm, Long moNO, int noOfPerson, String roomType, Long roomNo,
				String checkIn, String checkout) {
			super();
			this.id = id;
			this.orderId = orderId;
			this.receipt = receipt;
			this.amount = amount;
			this.currency = currency;
			this.status = status;
			this.createdAt = createdAt;
			this.userNm = userNm;
			this.moNO = moNO;
			this.noOfPerson = noOfPerson;
			this.roomType = roomType;
			this.roomNo = roomNo;
			this.checkIn = checkIn;
			this.checkout = checkout;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getOrderId() {
			return orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public String getReceipt() {
			return receipt;
		}
		public void setReceipt(String receipt) {
			this.receipt = receipt;
		}
		public Integer getAmount() {
			return amount;
		}
		public void setAmount(Integer amount) {
			this.amount = amount;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public LocalDateTime getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}
		public String getUserNm() {
			return userNm;
		}
		public void setUserNm(String userNm) {
			this.userNm = userNm;
		}
		public Long getMoNO() {
			return moNO;
		}
		public void setMoNO(Long moNO) {
			this.moNO = moNO;
		}
		public int getNoOfPerson() {
			return noOfPerson;
		}
		public void setNoOfPerson(int noOfPerson) {
			this.noOfPerson = noOfPerson;
		}
		public String getRoomType() {
			return roomType;
		}
		public void setRoomType(String roomType) {
			this.roomType = roomType;
		}
		public Long getRoomNo() {
			return roomNo;
		}
		public void setRoomNo(Long roomNo) {
			this.roomNo = roomNo;
		}
		public String getCheckIn() {
			return checkIn;
		}
		public void setCheckIn(String checkIn) {
			this.checkIn = checkIn;
		}
		public String getCheckout() {
			return checkout;
		}
		public void setCheckout(String checkout) {
			this.checkout = checkout;
		}
		@Override
		public String toString() {
			return "ShopHatOrder [id=" + id + ", orderId=" + orderId + ", receipt=" + receipt + ", amount=" + amount
					+ ", currency=" + currency + ", status=" + status + ", createdAt=" + createdAt + ", userNm="
					+ userNm + ", moNO=" + moNO + ", noOfPerson=" + noOfPerson + ", roomType=" + roomType + ", roomNo="
					+ roomNo + ", checkIn=" + checkIn + ", checkout=" + checkout + "]";
		}

		
	    
	
}
