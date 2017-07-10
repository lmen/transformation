package components;

import renderer.TemplateEngine;

public class ZoneComponent extends ComponentNode {

	public ZoneComponent(String name) {
		super(name);
	}

	@Override
	public String render() {
		return TemplateEngine.INSTANCE.render("zone.ftm", this);
	}

}
