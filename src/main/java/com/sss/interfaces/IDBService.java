package com.sss.interfaces;
import com.sss.interfaces.model.*;
import java.sql.*;

public interface IDBService {
    //user
    public Boolean addUser(user x);
    public Boolean delUser(int id);
    public Boolean updateUser(user x);
    public user queryUser(int id);

   //expert
    public Boolean addExpert(expert x);
    public Boolean delExpert(int id);
    public Boolean updateExpert(expert x);
    public expert queryExpert(int id);

    //administrator
    public Boolean addAdministrator(administrator x);
    public Boolean delAdministrator(int id);
    public Boolean updateAdministrator(administrator x);
    public administrator queryAdministrator(int id);

    //scientificRes
    public Boolean addScientificRes(scientificRes x);
    public Boolean delScientificRes(int id);
    public Boolean updateScientificRes(scientificRes x);
    public scientificRes queryScientificRes(int id);

    //patent
    public Boolean addPatent(patent x);
    public Boolean delPatent(int id);
    public Boolean updatePatent(patent x);
    public patent queryPatent(int id);

    //paper
    public Boolean addPaper(paper x);
    public Boolean delPaper(int id);
    public Boolean updatePaper(paper x);
    public paper queryPaper(int id);

    //auditapplication
    public Boolean addAuditapplicayion(auditapplication x);
    public Boolean delAuditapplication(int id);
    public Boolean updateAuditapplication(auditapplication x);
    public auditapplication queryAuditapplication(int id);

    //settleIn
    public Boolean addSettleIn(settleIn x);
    public Boolean delSettleIn(int id);
    public Boolean updateSettleIn(settleIn x);
    public settleIn querySettleIn(int id);

    //buyRes
    public Boolean addBuyRes(buyRes x);
    public Boolean delBuyRes(int id);
    public Boolean updateBuyRes(buyRes x);
    public buyRes queryBuyRes(int id);

    //payment

 public Boolean addPayment(payment x);
 public Boolean delPayment(int id);
 public Boolean updatePayment(payment x);
 public payment queryPayment(int id);

 //modifySciRes
 public Boolean addModifySciRes(modifySciRes x);
 public Boolean delModifySciRes(int id);
 public Boolean updateModifySciRes(modifySciRes x);
 public modifySciRes queryModifySciRes(int id);

 //boughtScientificRes
 public Boolean addBoughtScientificRes(boughtScientificRes x);
 public Boolean delBoughtScientificRes(int id);
 public Boolean updateBoughtScientificRes(boughtScientificRes x);
 public boughtScientificRes queryBoughtScientificRes(int id);

 //transaction
 public Boolean addTransaction(transaction x);
 public Boolean delTransaction(int id);
 public Boolean updateTransaction(transaction x);
 public transaction queryTransaction(int id);

 //Logs
 public Boolean addLogs(Logs x);
 public Boolean delLogs(Timestamp time);
 public Boolean updateLogs(Logs x);
 public Logs queryLogs(Timestamp time);

 //message
 public Boolean addMessage(message x);
 public Boolean delMessage(int id);
 public Boolean updateMessage(message x);
 public message queryMessage(int id);

//tags
 public Boolean addTags(tags x);
 public Boolean delTags(String tag);

 //expertTags
 public Boolean addExpertTag(expertTag x);
 public Boolean delExpertTag(int id);
 public Boolean updateExpertTag(expertTag x);
 public expertTag queryExpertTag(int id);

 //scientificResTags
 public Boolean addScientificResTag(scientificResTag x);
 public Boolean delScientificResTag(int id);
 public Boolean updateScientificResTag(scientificResTag x);
 public scientificResTag queryScientificResTag(int id);





}
