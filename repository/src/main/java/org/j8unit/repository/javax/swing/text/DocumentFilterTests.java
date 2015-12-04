package org.j8unit.repository.javax.swing.text;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.text.DocumentFilter class javax.swing.text.DocumentFilter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.DocumentFilterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DocumentFilterTests<SUT extends javax.swing.text.DocumentFilter>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.text.DocumentFilter#replace(javax.swing.text.DocumentFilter.FilterBypass,int,int,java.lang.String,javax.swing.text.AttributeSet) public void javax.swing.text.DocumentFilter.replace(javax.swing.text.DocumentFilter$FilterBypass,int,int,java.lang.String,javax.swing.text.AttributeSet) throws javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_replace_FilterBypass_int_int_String_AttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DocumentFilter#insertString(javax.swing.text.DocumentFilter.FilterBypass,int,java.lang.String,javax.swing.text.AttributeSet) public void javax.swing.text.DocumentFilter.insertString(javax.swing.text.DocumentFilter$FilterBypass,int,java.lang.String,javax.swing.text.AttributeSet) throws javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insertString_FilterBypass_int_String_AttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DocumentFilter#remove(javax.swing.text.DocumentFilter.FilterBypass,int,int) public void javax.swing.text.DocumentFilter.remove(javax.swing.text.DocumentFilter$FilterBypass,int,int) throws javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_FilterBypass_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.DocumentFilter$FilterBypass class javax.swing.text.DocumentFilter$FilterBypass},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.DocumentFilterClassTests.FilterBypassClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FilterBypassTests<SUT extends javax.swing.text.DocumentFilter.FilterBypass>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.text.DocumentFilter.FilterBypass#getDocument() public abstract javax.swing.text.Document javax.swing.text.DocumentFilter$FilterBypass.getDocument()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getDocument() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.DocumentFilter.FilterBypass#remove(int,int) public abstract void javax.swing.text.DocumentFilter$FilterBypass.remove(int,int) throws javax.swing.text.BadLocationException}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_remove_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.DocumentFilter.FilterBypass#replace(int,int,java.lang.String,javax.swing.text.AttributeSet) public abstract void javax.swing.text.DocumentFilter$FilterBypass.replace(int,int,java.lang.String,javax.swing.text.AttributeSet) throws javax.swing.text.BadLocationException}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_replace_int_int_String_AttributeSet() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.DocumentFilter.FilterBypass#insertString(int,java.lang.String,javax.swing.text.AttributeSet) public abstract void javax.swing.text.DocumentFilter$FilterBypass.insertString(int,java.lang.String,javax.swing.text.AttributeSet) throws javax.swing.text.BadLocationException}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_insertString_int_String_AttributeSet() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
