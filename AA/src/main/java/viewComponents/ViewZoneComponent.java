package viewComponents;

import org.jdom2.Element;

public class ViewZoneComponent extends ViewComponentNode {

	public ViewZoneComponent(String id) {
		super(id);
	}

	public String localid;

	public static class ZoneComponentFactory implements ViewComponentFactory {

		public ViewComponentNode createComponent(Element viewNode) {
			ViewZoneComponent comp = new ViewZoneComponent(getViewName());
			comp.localid = ViewComponentFactory.elmAttrValue(viewNode, "id", null);
			return comp;
		}

		public String getViewName() {
			return "zone";
		}

	}

	public <T> T visit(Visitor<T> visitor) {

		return visitor.enter(this);

	}

}
