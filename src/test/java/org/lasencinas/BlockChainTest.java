package org.lasencinas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BlockChainTest {

    private List<Transaction> blockchain = null;

    @Before
    public void __init__() {
        blockchain = new LinkedList<>();
    }

    @Test
    public void constructorTest(){
        assertNotNull(blockchain);
    }
}
