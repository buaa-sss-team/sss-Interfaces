package com.sss.interfaces.service;

import com.sss.interfaces.hmodel.*;

import java.util.List;

public interface CheckService {
    List<SettleIn> checkSettleIn();
    List<Payment> checkPayment();
    List<BuyRes> checkBuyRes();
    List<ModifySciRes> checkModifyRes();
    List<Auditapplication> checkAudApp(int status);
}
