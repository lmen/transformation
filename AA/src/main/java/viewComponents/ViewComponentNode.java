package viewComponents;

import java.util.ArrayList;
import java.util.List;

public class ViewComponentNode {

	public String id;
	public ViewComponentNode parent;
	public List<ViewComponentNode> children = new ArrayList<>();

	public ViewComponentNode(String id) {
		super();
		this.id = id;
	}

	public <T> T visit(Visitor<T> visitor) {

		return visitor.enter(this);

	}

}
