package aa;

import java.util.List;

import org.jdom2.Element;

import viewComponents.ViewComponentFactoryDirectory;
import viewComponents.ViewComponentNode;

public class ViewComponentTreeBuilder {

	public ViewComponentNode build(Element node) {

		ViewComponentNode comp = createComponent(node);

		List<Element> children = node.getChildren();
		for (Element el : children) {
			ViewComponentNode child = build(el);
			comp.children.add(child);
		}

		return comp;

	}

	private ViewComponentNode createComponent(Element root) {
		return ViewComponentFactoryDirectory.INSTANCE.byViewName(root.getName()).createComponent(root);
	}

}