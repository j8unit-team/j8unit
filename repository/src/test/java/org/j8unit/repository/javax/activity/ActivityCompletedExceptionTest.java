package org.j8unit.repository.javax.activity;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivityCompletedExceptionTest
implements org.j8unit.repository.javax.activity.ActivityCompletedExceptionTests<javax.activity.ActivityCompletedException> {

    @Override
    public javax.activity.ActivityCompletedException createNewSUT() {
        return new javax.activity.ActivityCompletedException();
    }

}
