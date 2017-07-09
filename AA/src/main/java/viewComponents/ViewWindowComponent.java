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

	public <T> T visit(Visitor<T> visitor) {

		return visitor.enter(this);

	}

}
