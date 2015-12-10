package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RetentionClassTest
implements org.j8unit.repository.java.lang.annotation.RetentionClassTests<java.lang.annotation.Retention> {

    @Override
    public Class<java.lang.annotation.Retention> createNewSUT() {
        return java.lang.annotation.Retention.class;
    }

}
