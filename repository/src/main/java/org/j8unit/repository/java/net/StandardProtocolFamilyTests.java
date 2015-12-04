package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.net.StandardProtocolFamily class java.net.StandardProtocolFamily}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.net.StandardProtocolFamilyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface StandardProtocolFamilyTests<SUT extends java.net.StandardProtocolFamily>
extends org.j8unit.repository.java.net.ProtocolFamilyTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.net.StandardProtocolFamily> {

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test. In result, there are duplicated according test method within the super test classes. To solve
     * this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon and,
     * thus, overriding becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_name()
    throws Exception {
    }

}
