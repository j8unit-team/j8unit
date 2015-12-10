package org.j8unit.repository.javax.transaction;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidTransactionExceptionTest
implements org.j8unit.repository.javax.transaction.InvalidTransactionExceptionTests<javax.transaction.InvalidTransactionException> {

    @Override
    public javax.transaction.InvalidTransactionException createNewSUT() {
        return new javax.transaction.InvalidTransactionException();
    }

}
