package components;

public class WindowComponent extends ComponentNode {

	public WindowComponent(String name) {
		super(name);
	}

	@Override
	public String render() {
		return "<div Window </div";
	}

}
