package org.lasencinas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.security.KeyPair;
import java.security.PublicKey;

public class TransactionTest {

    private Transaction transaction = null;

    @Before
    public void __init__() {
        transaction = new Transaction(){};
    }

    @Test
    public void constructorTest() {
        assertNotNull(transaction);
    }

    @Test
    public void checkTransactionTest() {
        Wallet wallet = new Wallet();
        Wallet wallet1 = new Wallet();
        wallet.generateKeyPair();
        wallet1.generateKeyPair();
        KeyPair pair = GenSig.generateKeyPair();
        transaction = new Transaction("1", "0", wallet.getAddress(), wallet1.getAddress(), 100,
                "Hiii");
        assertNotNull(transaction);
        assertEquals(100, transaction.getPigCoins());
        assertEquals("1", transaction.getId());
    }
}
