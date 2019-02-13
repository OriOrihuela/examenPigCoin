package org.lasencinas;

public class Wallet {
    /* ---- Properties ---- */
    private String publicKey = null;
    private String privKey = null;

    /* ---- Constructor ---- */
    public Wallet(String publicKey, String privKey) {
        this.privKey = privKey;
        this.publicKey = publicKey;
    }

    /* ---- Getters ---- */

    public String getPrivKey() {
        return privKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    /* ---- Setters ---- */

    public void setPrivKey(String privKey) {
        this.privKey = privKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
