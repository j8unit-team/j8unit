package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransactionServiceClassTest
implements org.j8unit.repository.org.omg.IOP.TransactionServiceClassTests<org.omg.IOP.TransactionService> {

    @Override
    public Class<org.omg.IOP.TransactionService> createNewSUT() {
        return org.omg.IOP.TransactionService.class;
    }

}
