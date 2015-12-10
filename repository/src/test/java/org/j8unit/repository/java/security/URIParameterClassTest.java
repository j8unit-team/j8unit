package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URIParameterClassTest
implements org.j8unit.repository.java.security.URIParameterClassTests<java.security.URIParameter> {

    @Override
    public Class<java.security.URIParameter> createNewSUT() {
        return java.security.URIParameter.class;
    }

}
