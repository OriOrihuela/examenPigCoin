package org.lasencinas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WalletTest {

    private Wallet wallet = null;

    @Before
    public void __init___() {
        wallet = new Wallet();
    }

    @Test
    public void getPrivKey() {
        String expected = "456";
        wallet.setPrivKey("456");
        assertEquals(expected, wallet.getPrivKey());
    }

    @Test
    public void getPublicKey() {
        String expected = "123";
        wallet.setPublicKey("123");
        assertEquals(expected, wallet.getPublicKey());
    }
}
