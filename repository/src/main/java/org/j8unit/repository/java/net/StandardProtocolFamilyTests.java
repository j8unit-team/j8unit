package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.StandardProtocolFamily class java.net.StandardProtocolFamily}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link StandardProtocolFamilyClassTests}.
 * </p>
 *
 * @see java.net.StandardProtocolFamily class java.net.StandardProtocolFamily (the hereby targeted class-under-test
 *      class)
 * @see StandardProtocolFamilyClassTests StandardProtocolFamilyClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StandardProtocolFamilyTests<SUT extends java.net.StandardProtocolFamily>
extends ProtocolFamilyTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.net.StandardProtocolFamily> {

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.net.ProtocolFamily#name() interface java.net.ProtocolFamily}</li>
     * <li>{@linkplain Enum#name() class java.lang.Enum}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
    }

}
