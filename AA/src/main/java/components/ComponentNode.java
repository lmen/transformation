package components;

import java.util.ArrayList;
import java.util.List;

public abstract class ComponentNode {

	public String name;
	public ComponentNode parent;
	public List<ComponentNode> children = new ArrayList<>();

	public ComponentNode(String name) {
		super();
		this.name = name;
	}

	public abstract String render();

	public List<ComponentNode> getChildren() {
		return children;
	}

}
