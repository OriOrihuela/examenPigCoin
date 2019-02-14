package org.lasencinas.wallet;

import org.lasencinas.gensig.GenSig;
import java.security.PrivateKey;
import java.security.PublicKey;



public class Wallet {


    /* ---- Properties ---- */
    private PublicKey address = null;
    private PrivateKey SK = null;
    private int total_input = 0;
    private int total_output = 0;
    private int balance = 0;


    /* ---- Constructor ---- */
    public Wallet() { }


    /* ---- Getters ---- */
    public PrivateKey getSK() {
        return this.SK;
    }

    public PublicKey getAddress() {
        return this.address;
    }

    public int getBalance() {
        return balance;
    }

    public int getTotal_input() {
        return total_input;
    }

    public int getTotal_output() {
        return total_output;
    }


    /* ---- Setters ---- */
    public void setSK(PrivateKey SK) {
        this.SK = SK;
    }

    public void setAddress(PublicKey address) {
        this.address = address;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setTotal_input(int total_input) {
        this.total_input = total_input;
    }

    public void setTotal_output(int total_output) {
        this.total_output = total_output;
    }


    /* ---- Behaviours ---- */
    public void generateKeyPair() {
        setAddress(GenSig.generateKeyPair().getPublic());
    }

    @Override
    public String toString() {
        return "\n" + "Wallet = " + getAddress().hashCode() + "\n" +
                "Total input = " + getTotal_input() + "\n" +
                "Total output = " + getTotal_output() + "\n" +
                "Balance = " + getBalance() + "\n";
    }
}
