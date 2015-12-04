package org.j8unit.repository.javax.management.timer;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.timer.TimerNotification class javax.management.timer.TimerNotification},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.management.timer.TimerNotificationTests}.
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
 * @see org.j8unit.repository.javax.management.timer.TimerNotificationTests
 */
@Category(J8UnitRepository.class)
public abstract interface TimerNotificationClassTests<SUT extends Class<? extends javax.management.timer.TimerNotification>>
extends org.j8unit.repository.javax.management.NotificationClassTests<SUT>
{

    /**
     * Test method for {@link javax.management.timer.TimerNotification#TimerNotification(java.lang.String,java.lang.Object,long,long,java.lang.String,java.lang.Integer) public javax.management.timer.TimerNotification(java.lang.String,java.lang.Object,long,long,java.lang.String,java.lang.Integer)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TimerNotification_String_Object_long_long_String_Integer() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.timer.TimerNotification sut = null; // = new TimerNotification(java.lang.String,java.lang.Object,long,long,java.lang.String,java.lang.Integer);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.management.timer.TimerNotification> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.timer.TimerNotification.class.isAssignableFrom(sut));
    }

}
