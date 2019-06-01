package com.sss.interfaces.service;

import com.sss.interfaces.hmodel.BuyRes;
import com.sss.interfaces.hmodel.ModifySciRes;
import com.sss.interfaces.hmodel.Payment;
import com.sss.interfaces.hmodel.SettleIn;

public interface RequestService {
    void reqForExpert (SettleIn settleIn);
    void reqForWithdraw (Payment payment);
    void buyResource (BuyRes buyRes);
    void modifyResource(ModifySciRes modifySciRes);
}
