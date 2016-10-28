package org.j8unit.repository.java.net;

import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link StandardProtocolFamily public final enum java.net.StandardProtocolFamily}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.net.StandardProtocolFamilyClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StandardProtocolFamilyTests<SUT extends StandardProtocolFamily>
extends org.j8unit.repository.java.net.ProtocolFamilyTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, StandardProtocolFamily> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.StandardProtocolFamily]

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link ProtocolFamily#name() interface java.net.ProtocolFamily}</li>
     * <li>{@link Enum#name() class java.lang.Enum}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this
     * compiler-error situation, this method must be overridden. Dont't worry, there will be meaningful test methods
     * soon and, thus, overriding becomes unnecessary.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
        org.j8unit.repository.java.net.ProtocolFamilyTests.super.test_name();
        org.j8unit.repository.java.lang.EnumTests.super.test_name();
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.StandardProtocolFamily]

}
