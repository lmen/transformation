package viewComponents;

import org.jdom2.Attribute;
import org.jdom2.Element;

public interface ViewComponentFactory {

	public static String elmAttrValue(Element elm, String attrName, String defaultValue) {
		Attribute attribute = elm.getAttribute(attrName);
		if (attribute == null)
			return defaultValue;

		return attribute.getValue();

	}

	public String getViewName();

	public ViewComponentNode createComponent(Element viewNode);

}
