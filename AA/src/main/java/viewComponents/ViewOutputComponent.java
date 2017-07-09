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

	public void accept(Visitor visitor) {

		// visitor.enterAny(this);
		visitor.enter(this);

		visitor.leave(this);

	}

}
