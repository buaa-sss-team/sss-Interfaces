package com.sss.interfaces.service;

public interface RequestService {
    void reqForExpert (SettleIn settleIn);
    void reqForWithdraw (Payment payment);
    void buyResource (BuyRes buyRes);
    void modifyResource(ModifySciRes modifySciRes);
}
