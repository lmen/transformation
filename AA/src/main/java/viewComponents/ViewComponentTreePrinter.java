package viewComponents;

public class ViewComponentTreePrinter {

	public void print(ViewComponentNode node) {
		System.out.println("ViewComponentTree");
		print(node, "");
	}

	public void print(ViewComponentNode node, String ident) {
		System.out.format("%s - %s \n", ident, node.id);
		for (ViewComponentNode c : node.children) {
			print(c, ident + "  ");
		}
	}
}
