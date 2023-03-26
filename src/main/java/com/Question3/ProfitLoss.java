package com.Question3;

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

//@Component

//class sub implements UpDown{       // if i add these then application wont run since spring cnt diff
//    @Override                      // differentiate which classs to implement.
//    public int up(int a, int b) {  // we can use @Primary for this.
//        return a-b;
//    }
//}
@Component
public class ProfitLoss {

    @Autowired
    UpDown obj;

    public ProfitLoss(UpDown obj){
        this.obj=obj;
    }

    public int WinOrloose(int a,int b){
        int ans = obj.up(a,b);
        return ans;
    }

}
