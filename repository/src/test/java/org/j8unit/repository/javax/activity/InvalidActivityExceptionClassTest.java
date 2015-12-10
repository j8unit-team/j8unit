package org.j8unit.repository.javax.activity;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidActivityExceptionClassTest
implements org.j8unit.repository.javax.activity.InvalidActivityExceptionClassTests<javax.activity.InvalidActivityException> {

    @Override
    public Class<javax.activity.InvalidActivityException> createNewSUT() {
        return javax.activity.InvalidActivityException.class;
    }

}
