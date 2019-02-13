package org.lasencinas;

import org.junit.Before;
import org.junit.Test;

import java.security.KeyPair;



import static org.junit.Assert.*;

public class WalletTest {

    private Wallet wallet = null;

    @Before
    public void ___init___() {
        wallet = new Wallet();
    }

    @Test
    public void constructorTest() {
        assertNotNull(wallet);
    }

    @Test
    public void getSK() {
        Wallet wallet_1 = new Wallet();
        KeyPair pair = GenSig.generateKeyPair();
        wallet_1.setSK(pair.getPrivate());
        wallet_1.setAddress(pair.getPublic());
    }
}
