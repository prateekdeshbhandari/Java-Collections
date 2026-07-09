package com.xworkz.sort.dto;

import com.sun.source.doctree.SerialTree;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount implements Serializable,Comparable<BankAccount> {

    private long accountNumber;
    private String customerName;
    private double balance;
    private String accountType;
    private String branch;

    @Override
    public int compareTo(BankAccount o) {
        BankAccount left=this;
        BankAccount right=o;
        if(left.accountNumber== right.accountNumber)return 0;
        if(left.accountNumber<right.accountNumber)return  100;
        return  -11;

    }
}
