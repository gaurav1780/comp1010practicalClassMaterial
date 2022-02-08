
//DO NOT MODIFY
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Graded {
	String description();
	double marks();
}
