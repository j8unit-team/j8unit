package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DomainCombinerClassTest
implements org.j8unit.repository.java.security.DomainCombinerClassTests<java.security.DomainCombiner> {

    @Override
    public Class<java.security.DomainCombiner> createNewSUT() {
        return java.security.DomainCombiner.class;
    }

}
