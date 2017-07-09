package xml;

import org.jdom2.Element;

public class XmlTreePrinter {

	public void print(Element node) {
		System.out.println("Xml Tree:");
		print(node, "");
	}

	private void print(Element node, String ident) {
		System.out.format("%s - %s%s \n", ident, node.getName(), node.getAttributes());
		for (Element el : node.getChildren()) {
			print(el, ident + "  ");
		}
	}
}
