package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Member;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemberClassTest
implements org.j8unit.repository.java.lang.reflect.MemberClassTests<Member> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Member]

    @Override
    public Class<Member> createNewSUT() {
        return Member.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Member]

}
