package com.Question6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface operation{
    public int operate(int a, int b);
}

@Component
 class add2 implements operation{
    @Override
    public int operate(int a, int b) {
        return a+b;
    }
}
@Component
@Primary
class sub2 implements operation{
    @Override
    public int operate(int a, int b) {
        return a-b;
    }
}
@Component
public class ProfitLoss{
    @Autowired
    operation op;
    public ProfitLoss(operation op){
        this.op=op;
    }
    public int calculation(int a , int b){
        int ans =op.operate(a,b);
        return ans;
    }
}