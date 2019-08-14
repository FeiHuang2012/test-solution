package cn.gezhitech.test.plt1481;

import cn.gezhitech.tidemsc.model.User;
import cn.gezhitech.tidemsc.model.Pointer;
import cn.gezhitech.tidemsc.TideChaincodeApi;
import cn.gezhitech.tidemsc.model.BaseTransaction;
import org.hyperledger.composer.annotation.Transaction;
import cn.gezhitech.tidemsc.annotation.TransactionHandler;


@Transaction(returnType = AConcept.class)
public class TestTransactionReturnConcept extends BaseTransaction {

    @TransactionHandler
    public AConcept handle(TideChaincodeApi api) {
        return new AConcept().stringType("string").longType(1L)
                .embeddedField(new User().id("hello").name("world").org("hospital.com").role("world"))
                .pointerType(Pointer.fromId("admin", User.class));
    }
}
