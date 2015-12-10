package org.j8unit.repository.javax.transaction;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransactionRequiredExceptionClassTest
implements org.j8unit.repository.javax.transaction.TransactionRequiredExceptionClassTests<javax.transaction.TransactionRequiredException> {

    @Override
    public Class<javax.transaction.TransactionRequiredException> createNewSUT() {
        return javax.transaction.TransactionRequiredException.class;
    }

}
