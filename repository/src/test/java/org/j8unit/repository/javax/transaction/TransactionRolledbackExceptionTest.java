package org.j8unit.repository.javax.transaction;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransactionRolledbackExceptionTest
implements org.j8unit.repository.javax.transaction.TransactionRolledbackExceptionTests<javax.transaction.TransactionRolledbackException> {

    @Override
    public javax.transaction.TransactionRolledbackException createNewSUT() {
        return new javax.transaction.TransactionRolledbackException();
    }

}
