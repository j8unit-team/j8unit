package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SubjectTest
implements org.j8unit.repository.javax.security.auth.SubjectTests<javax.security.auth.Subject> {

    @Override
    public javax.security.auth.Subject createNewSUT() {
        return new javax.security.auth.Subject();
    }

}
