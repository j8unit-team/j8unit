package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemberClassTest
implements org.j8unit.repository.java.lang.reflect.MemberClassTests<java.lang.reflect.Member> {

    @Override
    public Class<java.lang.reflect.Member> createNewSUT() {
        return java.lang.reflect.Member.class;
    }

}
