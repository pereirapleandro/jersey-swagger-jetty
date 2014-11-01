package com.lppinfo.util;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import com.lppinfo.rest.BookRest;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class DocumentationManager extends Application {
	HashSet<Object> singletons = new HashSet<Object>();

	public DocumentationManager() {
		singletons.add(new BookRest());
	}

	@Override
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> set = new HashSet<Class<?>>();
		return set;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}