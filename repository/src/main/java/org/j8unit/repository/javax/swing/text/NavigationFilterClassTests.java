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
 * Test class for {@link javax.swing.text.NavigationFilter class javax.swing.text.NavigationFilter},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.text.NavigationFilterTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.NavigationFilterTests
 */
@Category(J8UnitRepository.class)
public abstract interface NavigationFilterClassTests<SUT extends Class<? extends javax.swing.text.NavigationFilter>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.text.NavigationFilter#NavigationFilter() public javax.swing.text.NavigationFilter()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_NavigationFilter() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.text.NavigationFilter sut = null; // = new NavigationFilter();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.text.NavigationFilter> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.NavigationFilter.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.NavigationFilter$FilterBypass class javax.swing.text.NavigationFilter$FilterBypass},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.NavigationFilterTests.FilterBypassTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.NavigationFilterTests.FilterBypassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FilterBypassClassTests<SUT extends Class<? extends javax.swing.text.NavigationFilter.FilterBypass>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.NavigationFilter.FilterBypass#FilterBypass() public javax.swing.text.NavigationFilter$FilterBypass()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_FilterBypass() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.NavigationFilter.FilterBypass sut = null; // = new FilterBypass();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.NavigationFilter.FilterBypass> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.NavigationFilter.FilterBypass.class.isAssignableFrom(sut));
        }

    }

}
