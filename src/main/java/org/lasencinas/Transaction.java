package org.lasencinas;

import java.security.PublicKey;

public class Transaction {


    /* ---- Properties ---- */
    private String id = null;
    private String prev_hash = null;
    private PublicKey pKey_sender = null;
    private PublicKey pKey_recipient = null;
    private int pigCoins = 0;
    private String message = null;
    private Byte[] signature = null;


    /* ---- Constructor ---- */
    public Transaction() {}

    public Transaction(String id, String prev_hash, PublicKey pKey_sender, PublicKey pKey_recipient, int pigCoins,
                       String message) {
        this.id = id;
        this.prev_hash = prev_hash;
        this.pKey_sender = pKey_sender;
        this.pKey_recipient = pKey_recipient;
        this.pigCoins = pigCoins;
        this.message = message;
    }


    /* ---- Getters ----*/
    public String getId() {
        return id;
    }

    public String getPrev_hash() {
        return prev_hash;
    }

    public PublicKey getpKey_sender() {
        return pKey_sender;
    }

    public PublicKey getpKey_recipient() {
        return pKey_recipient;
    }

    public int getPigCoins() {
        return pigCoins;
    }

    public String getMessage() {
        return message;
    }

    public Byte[] getSignature() {
        return signature;
    }


    /* ---- Setters ---- */
    public void setId(String id) {
        this.id = id;
    }

    public void setPrev_hash(String prev_hash) {
        this.prev_hash = prev_hash;
    }

    public void setpKey_sender(PublicKey pKey_sender) {
        this.pKey_sender = pKey_sender;
    }

    public void setpKey_recipient(PublicKey pKey_recipient) {
        this.pKey_recipient = pKey_recipient;
    }

    public void setPigCoins(int pigCoins) {
        this.pigCoins = pigCoins;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSignature(Byte[] signature) {
        this.signature = signature;
    }


    /* ---- Behaviours ---- */

    @Override
    public String toString() {
        return "\n" + "hash = " + getId() + "\n" +
                "prev_hash = " + getPrev_hash() + "\n" +
                "pk_sender = " + getpKey_sender().hashCode() + "\n" +
                "pk_recipient = " + getpKey_recipient().hashCode() + "\n" +
                "pigcoins = " + getPigCoins() + "\n" +
                "message = " + getMessage() + "\n";
    }
}
