package com.Question5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface UpDown{
    public int up(int a, int b);
}

@Component
class add implements UpDown{
    @Override
    public int up(int a, int b) {
        return a+b;
    }
}

@Component
@Primary
class sub implements UpDown{
    @Override
    public int up(int a, int b) {
        return a-b;
    }
}
@Component
public class profitLoss {

    @Autowired
    UpDown obj;

    public profitLoss(UpDown obj){
        this.obj=obj;
    }

    @Override
    public String toString() {
        return "profitLoss{" +
                "obj=" + obj +
                '}';
    }

    public int WinOrloose(int a, int b){
        int ans = obj.up(a,b);
        return ans;
    }

}
