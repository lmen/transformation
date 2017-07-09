package viewComponents;

import org.jdom2.Element;

public class ViewZoneComponent extends ViewComponentNode {

	public ViewZoneComponent(String id) {
		super(id);
	}

	private String id;

	public static class ZoneComponentFactory implements ViewComponentFactory {

		public ViewComponentNode createComponent(Element viewNode) {
			ViewZoneComponent comp = new ViewZoneComponent(getViewName());
			comp.id = ViewComponentFactory.elmAttrValue(viewNode, "id", null);
			return comp;
		}

		public String getViewName() {
			return "zone";
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
