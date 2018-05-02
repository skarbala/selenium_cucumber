package suites;

import categories.ReleaseTest;
import categories.SmokeTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.DummyTest;
import tests.InceptionTest;
import tests.WaitForItTest;

@RunWith(Categories.class)
@Categories.IncludeCategory(ReleaseTest.class)
@Categories.ExcludeCategory(SmokeTest.class)
@Suite.SuiteClasses({
        DummyTest.class,
        WaitForItTest.class,
        InceptionTest.class
})
public class ReleaseTestSuite {
}
