package org.j8unit.repository.javax.transaction;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidTransactionExceptionClassTest
implements org.j8unit.repository.javax.transaction.InvalidTransactionExceptionClassTests<javax.transaction.InvalidTransactionException> {

    @Override
    public Class<javax.transaction.InvalidTransactionException> createNewSUT() {
        return javax.transaction.InvalidTransactionException.class;
    }

}
