package components;

public class ComponentTreePrinter {

	public void print(ComponentNode node) {
		System.out.println("Component Tree:");
		print(node, "");
	}

	private void print(ComponentNode node, String ident) {
		System.out.format("%s - %s \n", ident, node.name);
		for (ComponentNode el : node.children) {
			print(el, ident + "  ");
		}
	}
}
