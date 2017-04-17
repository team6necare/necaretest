package assign4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ manage_activitytype_cjava.class,manage_activityschedule_cjava.class,manage_victimactivity_cjava.class,
				manage_activitytype_fjava.class,manage_activityschedule_fjava.class,manage_victimactivity_fjava.class,
			 })
public class AllTests {

}
