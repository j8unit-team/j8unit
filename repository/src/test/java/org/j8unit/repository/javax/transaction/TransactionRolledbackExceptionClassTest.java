package org.j8unit.repository.javax.transaction;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransactionRolledbackExceptionClassTest
implements org.j8unit.repository.javax.transaction.TransactionRolledbackExceptionClassTests<javax.transaction.TransactionRolledbackException> {

    @Override
    public Class<javax.transaction.TransactionRolledbackException> createNewSUT() {
        return javax.transaction.TransactionRolledbackException.class;
    }

}
