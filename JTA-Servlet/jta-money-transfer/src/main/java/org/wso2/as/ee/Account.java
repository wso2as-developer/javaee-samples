package org.wso2.as.ee;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId;
    private float amount;
    private TransactionType transactionTypes;

    @Version
    private Date timestamp;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int id) {
        this.transactionId = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float transactionAmount) {
        this.amount = transactionAmount;
    }

    public TransactionType getTransactionType() {
        return transactionTypes;
    }

    public void setTransactionTypes(TransactionType transactionTypes) {
        this.transactionTypes = transactionTypes;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Account(float transactionAmount, TransactionType transactionTypes) {
        this.amount = transactionAmount;
        this.transactionTypes = transactionTypes;
    }

    public Account() {
    }
}

