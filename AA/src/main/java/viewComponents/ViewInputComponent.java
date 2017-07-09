package viewComponents;

import org.jdom2.Element;

public class ViewInputComponent extends ViewComponentNode {

	public ViewInputComponent(String id) {
		super(id);
	}

	private String type;

	public static class InputComponentFactory implements ViewComponentFactory {

		public ViewComponentNode createComponent(Element viewNode) {
			ViewInputComponent comp = new ViewInputComponent(getViewName());
			comp.type = ViewComponentFactory.elmAttrValue(viewNode, "type", null);
			return comp;
		}

		public String getViewName() {
			return "input";
		}

	}

	public <T> T visit(Visitor<T> visitor) {

		return visitor.enter(this);

	}

}
