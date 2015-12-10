package org.j8unit.repository.javax.activity;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidActivityExceptionTest
implements org.j8unit.repository.javax.activity.InvalidActivityExceptionTests<javax.activity.InvalidActivityException> {

    @Override
    public javax.activity.InvalidActivityException createNewSUT() {
        return new javax.activity.InvalidActivityException();
    }

}
