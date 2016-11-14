import static org.j8unit.generator.util.OptionalString.ofOptional;
import static org.j8unit.generator.api.GeneratorSetupTest.JAVA_LANG;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import java.nio.file.Paths;
import java.util.Optional;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.util.OptionalString;
import org.junit.Test;

public class PackageNameTest {

    @Test
    public void testDefaultPackage()
    throws Exception {
        assertNull(PackageNameTest.class.getPackage());
        final OriginRenderer renderer = new OriginRenderer() {};
        final Optional<String> pakkage = renderer.originPackageFor(PackageNameTest.class);
        assertNotNull(pakkage);
        assertFalse(pakkage.isPresent());
        final OptionalString name = ofOptional(pakkage);
        assertNotNull(name);
        assertFalse(name.isPresent());
    }

    @Test
    public void testFolderForPackage()
    throws Exception {
        assertEquals(Paths.get("."), JAVA_LANG.targetFolderFor(PackageNameTest.class.getPackage()));
        assertEquals(Paths.get("."), JAVA_LANG.targetFolderFor(PackageNameTest.class));
    }

}
