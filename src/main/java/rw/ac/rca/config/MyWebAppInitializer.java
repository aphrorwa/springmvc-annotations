/**
 * 
 */
package rw.ac.rca.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author DELL
 *
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] {AphrorwaSpringMVCConfig.class};
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] {"/"};
	}

}
