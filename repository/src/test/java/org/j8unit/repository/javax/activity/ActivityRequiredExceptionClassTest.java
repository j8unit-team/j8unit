package org.j8unit.repository.javax.activity;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivityRequiredExceptionClassTest
implements org.j8unit.repository.javax.activity.ActivityRequiredExceptionClassTests<javax.activity.ActivityRequiredException> {

    @Override
    public Class<javax.activity.ActivityRequiredException> createNewSUT() {
        return javax.activity.ActivityRequiredException.class;
    }

}
