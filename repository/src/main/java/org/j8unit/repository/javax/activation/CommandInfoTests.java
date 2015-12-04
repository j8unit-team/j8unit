package org.j8unit.repository.javax.activation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.activation.CommandInfo class javax.activation.CommandInfo}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.activation.CommandInfoClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CommandInfoTests<SUT extends javax.activation.CommandInfo>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.activation.CommandInfo#getCommandClass() public java.lang.String
     * javax.activation.CommandInfo.getCommandClass()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCommandClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.activation.CommandInfo#getCommandObject(javax.activation.DataHandler,java.lang.ClassLoader) public
     * java.lang.Object
     * javax.activation.CommandInfo.getCommandObject(javax.activation.DataHandler,java.lang.ClassLoader) throws
     * java.io.IOException,java.lang.ClassNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCommandObject_DataHandler_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.CommandInfo#getCommandName() public java.lang.String
     * javax.activation.CommandInfo.getCommandName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCommandName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
