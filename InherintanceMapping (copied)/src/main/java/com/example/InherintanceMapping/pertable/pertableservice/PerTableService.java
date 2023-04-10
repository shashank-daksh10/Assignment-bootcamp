package com.example.InherintanceMapping.pertable.pertableservice;

import com.example.InherintanceMapping.pertable.entity.CheckPerTable;
import com.example.InherintanceMapping.pertable.entity.CreditPerTable;
import com.example.InherintanceMapping.pertable.repo.CardPaymentRepository;
import com.example.InherintanceMapping.pertable.repo.CheckPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerTableService {

    @Autowired
    CardPaymentRepository cardPaymentRepository;

    @Autowired
    CheckPaymentRepository checkPaymentRepository;

    public void addCredit1(CreditPerTable cr){
        cardPaymentRepository.save(cr);
    }

    public void addCheck(CheckPerTable ch){
        checkPaymentRepository.save(ch);
    }

    public List<CreditPerTable> creditData(){
       List<CreditPerTable>ans =new ArrayList<>();
       ans.addAll(cardPaymentRepository.findAll());
       return ans;
    }

    public List<CheckPerTable> checkData(){
        List<CheckPerTable>ans =new ArrayList<>();
        ans.addAll(checkPaymentRepository.findAll());
        return ans;
    }
}
