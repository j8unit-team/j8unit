package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Member;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Member} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.reflect.MemberClassTests}).
 */

@RunWith(J8Unit4.class)
public class MemberClassTest
implements MemberClassTests<Member> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Member]

    @Override
    public Class<Member> createNewSUT() {
        return Member.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.Member]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Member]

}
