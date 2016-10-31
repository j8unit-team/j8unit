package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.TransactionService;

@RunWith(J8Unit4.class)
public class TransactionServiceClassTest
implements org.j8unit.repository.org.omg.IOP.TransactionServiceClassTests<TransactionService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.TransactionService]

    @Override
    public Class<TransactionService> createNewSUT() {
        return TransactionService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.TransactionService]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.TransactionService]

}
