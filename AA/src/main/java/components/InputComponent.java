package components;

import renderer.TemplateEngine;

public class InputComponent extends ComponentNode {

	public InputComponent(String name) {
		super(name);
	}

	@Override
	public String render() {
		return TemplateEngine.INSTANCE.render("input.ftm", this);
	}

}
