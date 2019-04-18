package testUtil;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"file:src\\test\\resources\\propertyFiles\\${environment}.properties"})
	
public interface ConfigProperties extends Config {
	@Key("url")
	String getUrl();
	
	@Key("path")
	String path();
	
	@Key("username")
	String getusername();

}
