package org.kreissl.simple.initialize;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * This class will initialize and register the springSecurityFilterChain Filter, default is every URL will be secured
 * @author keith
 *
 */
@Order(1)
public class SecurityWebInitializer extends
		AbstractSecurityWebApplicationInitializer {

}
