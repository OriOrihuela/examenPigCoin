package org.lasencinas.blockchain;

import org.lasencinas.transaction.Transaction;
import java.util.LinkedList;

public class BlockChain {


    /* ---- Properties ---- */
    private List<Transaction> blockChain = new LinkedList<>();


    /* ---- Constructor ---- */
    public BlockChain() {}


    /* ---- Getters ---- */
    public List<Transaction> getBlockChain() {
        return blockChain;
    }

    /* ---- Setters ---- */
    public void setBlockChain(List<Transaction> blockChain) {
        this.blockChain = blockChain;
    }

    /* ---- Behaviours ---- */
    public void addOrigin(Transaction transaction) {
        this.getBlockChain().add(transaction);
    }

    public void summarize(){
        for(Transaction transaction : getBlockChain()) {
            System.out.println(transaction.toString());
        }
    }

    public void summarize(int index) {
        System.out.println(getBlockChain().get(index).toString());
    }
}
