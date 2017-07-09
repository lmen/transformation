package viewComponents;

import org.jdom2.Element;

public class ViewWindowComponent extends ViewComponentNode {

	public ViewWindowComponent(String id) {
		super(id);
	}

	private String name;

	public static class WindowComponentFactory implements ViewComponentFactory {

		public ViewComponentNode createComponent(Element viewNode) {
			ViewWindowComponent comp = new ViewWindowComponent(getViewName());
			comp.name = ViewComponentFactory.elmAttrValue(viewNode, "name", null);
			return comp;
		}

		public String getViewName() {
			return "window";
		}

	}

	public void accept(Visitor visitor) {

		// visitor.enterAny(this);
		visitor.enter(this);

		for (ViewComponentNode viewComponentNode : children) {
			viewComponentNode.accept(visitor);
		}

		visitor.leave(this);

	}

}
