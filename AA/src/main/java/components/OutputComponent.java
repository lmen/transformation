package components;

import renderer.TemplateEngine;

public class OutputComponent extends ComponentNode {

	public OutputComponent(String name) {
		super(name);
	}

	@Override
	public String render() {
		return TemplateEngine.INSTANCE.render("output.ftm", this);
	}
}
