package spark.servlet;

import spark.servlet.SparkApplication;

import com.google.inject.Module;

public interface SparkGuiceApplication extends SparkApplication {
	
	void destroy();
	
	Module[] modules();

}
