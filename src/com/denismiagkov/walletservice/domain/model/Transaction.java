package com.denismiagkov.walletservice.domain.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Transaction {
    String id;
    String accountNumber;
    Timestamp time;
    TransactionType type;
    BigDecimal amount;

    public Transaction(String id, Account account, Timestamp time, TransactionType type,
                       BigDecimal amount) {
        this.id = id;
        this.accountNumber = account.getNumber();
        this.time = time;
        this.type = type;
        this.amount = amount;
    }

    public String getAccount() {
        return accountNumber;
    }

    public void setAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' + "\n" +
                ", accountNumber=" + accountNumber + "\n" +
                ", time=" + time + "\n" +
                ", type=" + type + "\n" +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
