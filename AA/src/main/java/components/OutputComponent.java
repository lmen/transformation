package components;

public class OutputComponent extends ComponentNode {

	public OutputComponent(String name) {
		super(name);
	}

	@Override
	public String render() {
		return "<input type=\"label\" /";
	}

}
