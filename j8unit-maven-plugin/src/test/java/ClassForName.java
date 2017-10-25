import org.junit.Test;

public class ClassForName {

    @Test(expected = ClassNotFoundException.class)
    public void test1()
    throws Exception {
        Class.forName("org.j8unit.repository.javax.swing.text.AttributeSetClassTests.FontAttributeClassTests");
    }

    @Test
    public void test2()
    throws Exception {
        Class.forName("org.j8unit.repository.javax.swing.text.AttributeSetClassTests$FontAttributeClassTests");
    }

}
