package viewComponents;

import org.jdom2.Element;

public class ViewOutputComponent extends ViewComponentNode {

	public ViewOutputComponent(String id) {
		super(id);
	}

	private String text;

	public static class OutputComponentFactory implements ViewComponentFactory {

		public ViewComponentNode createComponent(Element viewNode) {
			ViewOutputComponent comp = new ViewOutputComponent(getViewName());
			comp.text = ViewComponentFactory.elmAttrValue(viewNode, "text", null);
			return comp;
		}

		public String getViewName() {
			return "output";
		}

	}

	public <T> T visit(Visitor<T> visitor) {

		return visitor.enter(this);

	}

}
