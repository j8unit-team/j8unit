package org.j8unit.repository.javax.activity;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivityRequiredExceptionTest
implements org.j8unit.repository.javax.activity.ActivityRequiredExceptionTests<javax.activity.ActivityRequiredException> {

    @Override
    public javax.activity.ActivityRequiredException createNewSUT() {
        return new javax.activity.ActivityRequiredException();
    }

}
