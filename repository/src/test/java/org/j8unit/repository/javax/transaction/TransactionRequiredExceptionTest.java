package org.j8unit.repository.javax.transaction;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransactionRequiredExceptionTest
implements org.j8unit.repository.javax.transaction.TransactionRequiredExceptionTests<javax.transaction.TransactionRequiredException> {

    @Override
    public javax.transaction.TransactionRequiredException createNewSUT() {
        return new javax.transaction.TransactionRequiredException();
    }

}
