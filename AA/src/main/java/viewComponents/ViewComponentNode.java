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

	public void accept(Visitor visitor) {

		// visitor.enterAny(this);
		visitor.enter(this);

		for (ViewComponentNode viewComponentNode : children) {
			viewComponentNode.accept(visitor);
		}

		// visitor.leaveAny(this);

	}

}
