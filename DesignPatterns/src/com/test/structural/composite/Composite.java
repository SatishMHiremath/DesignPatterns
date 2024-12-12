package com.test.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private List<Component> children = new ArrayList<Component>();
	
	@Override
	public void operation() {
		for (Component component : children) {
			component.operation();
		}
	}
	
	public void addChild(Component child) {
		children.add(child);
	}
	
	public void removeChild(Component child) {
		children.remove(child);
	}
	
}
