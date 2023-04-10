package com.example.InherintanceMapping.joined.service;

import com.example.InherintanceMapping.joined.entity.CheckJoined;
import com.example.InherintanceMapping.joined.entity.CreditJoined;
import com.example.InherintanceMapping.joined.entity.PaymentJoined;
import com.example.InherintanceMapping.joined.repo.CheckPaymentJ;
import com.example.InherintanceMapping.joined.repo.CreditPaymentJ;
import com.example.InherintanceMapping.joined.repo.PaymentDaoJ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JoinedService {
    @Autowired
    CheckPaymentJ checkPaymentJ;
    
    @Autowired
    CreditPaymentJ creditPaymentJ;
    
    @Autowired
    PaymentDaoJ paymentDaoJ;
    
    public void addCredit(CreditJoined cr){
        creditPaymentJ.save(cr);
        paymentDaoJ.save(cr);
    }

    public void addCheck(CheckJoined ch){
        checkPaymentJ.save(ch);
        paymentDaoJ.save(ch);
    }
    public List<CreditJoined>creditData(){
        List<CreditJoined>ans=new ArrayList<>();
        ans.addAll(creditPaymentJ.findAll());
        return ans;
    }

    public List<CheckJoined>checkData(){
        List<CheckJoined>ans=new ArrayList<>();
        ans.addAll(checkPaymentJ.findAll());
        return ans;
    }
    public List<PaymentJoined>paymentData(){
        List<PaymentJoined>ans=new ArrayList<>();
        ans.addAll(paymentDaoJ.findAll());
        return ans;
    }
}
