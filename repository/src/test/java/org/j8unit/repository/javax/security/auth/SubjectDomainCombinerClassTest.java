package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SubjectDomainCombinerClassTest
implements org.j8unit.repository.javax.security.auth.SubjectDomainCombinerClassTests<javax.security.auth.SubjectDomainCombiner> {

    @Override
    public Class<javax.security.auth.SubjectDomainCombiner> createNewSUT() {
        return javax.security.auth.SubjectDomainCombiner.class;
    }

}
