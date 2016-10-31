package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.TransactionService;

@RunWith(J8Unit4.class)
public class TransactionServiceTest
implements org.j8unit.repository.org.omg.IOP.TransactionServiceTests<TransactionService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TransactionService]

    @Override
    public TransactionService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.TransactionService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TransactionService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TransactionService]

}
