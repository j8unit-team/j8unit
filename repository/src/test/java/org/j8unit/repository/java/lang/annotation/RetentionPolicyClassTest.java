package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RetentionPolicyClassTest
implements org.j8unit.repository.java.lang.annotation.RetentionPolicyClassTests<java.lang.annotation.RetentionPolicy> {

    @Override
    public Class<java.lang.annotation.RetentionPolicy> createNewSUT() {
        return java.lang.annotation.RetentionPolicy.class;
    }

}
