package com.github.jzhongming.wf.mvc.scan;

public abstract class SupperClassFilter extends DefaultClassFilter {

	protected final Class<?> superClass;

	protected SupperClassFilter(String packageName, Class<?> superClass) {
		super(packageName);
		this.superClass = superClass;
	}

	public SupperClassFilter(String packageName, Class<?> superClass, ClassLoader loader) {
		super(packageName, loader);
		this.superClass = superClass;
	}
}
