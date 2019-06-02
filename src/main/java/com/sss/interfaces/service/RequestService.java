package com.sss.interfaces.service;

import com.sss.interfaces.hmodel.Buyres;
import com.sss.interfaces.hmodel.Payment;
import com.sss.interfaces.hmodel.Tobeexpert;

public interface RequestService {
    int reqForExpert (Tobeexpert Tobeexpert);
    int reqForWithdraw (Payment payment);
    int buyResource (Buyres buyRes);
}
