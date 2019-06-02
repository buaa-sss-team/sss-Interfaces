package com.sss.interfaces.service;

import com.sss.interfaces.hmodel.*;

import java.util.List;

public interface CheckService {
    List<Tobeexpert> checkTobeexpert(int status);
    List<Buyres> checkBuyRes(int status);
}
