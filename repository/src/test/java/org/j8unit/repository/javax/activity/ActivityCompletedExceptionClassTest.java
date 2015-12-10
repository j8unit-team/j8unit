package org.j8unit.repository.javax.activity;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivityCompletedExceptionClassTest
implements org.j8unit.repository.javax.activity.ActivityCompletedExceptionClassTests<javax.activity.ActivityCompletedException> {

    @Override
    public Class<javax.activity.ActivityCompletedException> createNewSUT() {
        return javax.activity.ActivityCompletedException.class;
    }

}
