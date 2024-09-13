/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atminterface;


import java.util.*;
public class Transaction{
    private double amount;//amount of this trasaction
    private Date timestamp;//time and date of this transcation 
    private String memo;//memo for this transaction
    private Account inAccount;//the account in which transaction is performed
    
    public Transaction(double amount,Account inAccount){
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
    }
    public Transaction(double amount,String memo,Account inAccount){
        //call two args constructor first
        this(amount,inAccount);
        //set the memo
        this.memo = memo;
    }
    public double getAmount(){
        return this.amount;
    }
    public String getSummaryLine(){
        if(this.amount >= 0){
            return String.format(this.timestamp.toString()+" : $"+this.amount+" : "+this.memo);
        }else{
            return String.format(this.timestamp.toString()+" : $("+this.amount+") : "+this.memo);
        }
    }

}
