package components;

import renderer.TemplateEngine;

public class WindowComponent extends ComponentNode {

	public WindowComponent(String name) {
		super(name);
	}

	@Override
	public String render() {
		return TemplateEngine.INSTANCE.render("window.ftm", this);
	}

}
