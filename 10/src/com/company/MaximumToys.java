package com.company;

public class MaximumToys {
    private int mony;
    private int minToys;
    public int amountToys;

    public MaximumToys(){
        minToys = 0;
        amountToys = 0;
    }

    public void setMony(int k){
        this.mony = k;
    }

    public int getAmoutToys(int[] p){
        while (mony >= p[minToys]) {
            mony = mony - p[minToys];
            minToys++;
            amountToys++;
        }
        return amountToys;
    }

}
