package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SubjectClassTest
implements org.j8unit.repository.javax.security.auth.SubjectClassTests<javax.security.auth.Subject> {

    @Override
    public Class<javax.security.auth.Subject> createNewSUT() {
        return javax.security.auth.Subject.class;
    }

}
