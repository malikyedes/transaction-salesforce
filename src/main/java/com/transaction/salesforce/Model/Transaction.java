package com.transaction.salesforce.Model;

	import java.math.BigDecimal;
	import java.sql.Timestamp;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "transaction__c",  schema="salesforce")
	public class Transaction {

		@Id
		@Column(name = "id")
		private int id;
		@Column(name = "sfid")
		private String sfid;
		@Column(name = "user_id__c")
		private String userID;
		@Column(name = "from__c")
		private String fromAccount;
		@Column(name = "to_account__c")
		private String toAccount;
		@Column(name = "date__c")
		private Timestamp date;
		@Column(name = "description__c")
		private String decription;
		@Column(name = "amount__c")
		private BigDecimal amount;
		@Column(name = "status__c")
		private String status;
		@Column(name = "externalid__c")
		private String externalid;

		public String getExternalid() {
			return externalid;
		}

		public void setExternalid(String externalid) {
			this.externalid = externalid;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSfid() {
			return sfid;
		}

		public void setSfid(String sfid) {
			this.sfid = sfid;
		}

		public String getUserID() {
			return userID;
		}

		public void setUserID(String userID) {
			this.userID = userID;
		}

		public String getFromAccount() {
			return fromAccount;
		}

		public void setFromAccount(String fromAccount) {
			this.fromAccount = fromAccount;
		}

		public String getToAccount() {
			return toAccount;
		}

		public void setToAccount(String toAccount) {
			this.toAccount = toAccount;
		}

		public Timestamp getDate() {
			return date;
		}

		public void setDate(Timestamp date) {
			this.date = date;
		}

		public String getDecription() {
			return decription;
		}

		public void setDecription(String decription) {
			this.decription = decription;
		}

		public BigDecimal getAmount() {
			return amount;
		}

		public void setAmount(BigDecimal amount) {
			this.amount = amount;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Transaction() {
		};

	}

	
	

