package com.example.InherintanceMapping.singlemap.Singletable.service;

import com.example.InherintanceMapping.singlemap.Singletable.entity.Check;
import com.example.InherintanceMapping.singlemap.Singletable.entity.Credit;
import com.example.InherintanceMapping.singlemap.Singletable.entity.Payment;
import com.example.InherintanceMapping.singlemap.Singletable.repo.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class SingleService {
    @Autowired
    PaymentDao paymentDao;

    public void addCredit(Credit c){
        paymentDao.save(c);
    }

    public void addCheck(Check c){
        paymentDao.save(c);
    }

    public List<Payment>getData(){
        List<Payment>ans= new ArrayList<>();
        paymentDao.findAll().forEach(ans::add);

        return ans;
    }
}
