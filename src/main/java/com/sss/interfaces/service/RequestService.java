package com.sss.interfaces.service;
import com.sss.interfaces.hmodel.*;
public interface RequestService {
    int reqForExpert (Tobeexpert Tobeexpert);
    int reqForWithdraw (Payment payment);
    int buyResource (Buyres buyRes);
}
