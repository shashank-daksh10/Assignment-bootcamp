package com.loosecoupling;

interface profitLoss{
    public int Values(int a,int b);
}

class Profit implements profitLoss{
    @Override
    public int Values(int a, int b) {
        return a+b;
    }
}
class Loss implements profitLoss{
    @Override
    public int Values(int a, int b) {
        return a-b;
    }
}

public class ProfitLoss {
    profitLoss pl;

    public ProfitLoss(profitLoss pl){
        this.pl=pl;
    }

    public int WinOrloose(int a,int b){
        int ans = pl.Values(a,b);
        return ans;
    }

}
