package br.inatel.dm112.model.entities;

import java.util.Date;

public class OrderEntity {

	private int number;

	private String cpf;

	private float value;

	private int status;

	private Date orderDate;

	private Date issueDate;

	private Date paymentDate;

	
	public OrderEntity() {
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Order [number=" + number + ", cpf=" + cpf + ", value=" + value + ", status=" + status + ", orderDate="
				+ orderDate + ", issueDate=" + issueDate + ", paymentDate=" + paymentDate + "]";
	}

}
