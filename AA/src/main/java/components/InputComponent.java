package components;

public class InputComponent extends ComponentNode {

	public InputComponent(String name) {
		super(name);
	}

	@Override
	public String render() {
		return "<input type=\"label\" /";
	}

}
