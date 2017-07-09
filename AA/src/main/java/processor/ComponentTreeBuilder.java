package processor;

import components.ComponentNode;
import components.InputComponent;
import components.OutputComponent;
import components.WindowComponent;
import components.ZoneComponent;
import viewComponents.ViewComponentNode;
import viewComponents.ViewInputComponent;
import viewComponents.ViewOutputComponent;
import viewComponents.ViewWindowComponent;
import viewComponents.ViewZoneComponent;
import viewComponents.Visitor;

public class ComponentTreeBuilder implements Visitor<ComponentNode> {

	public ComponentNode enter(ViewWindowComponent comp) {
		System.out.println("specific enter viewInfo ViewWindowComponent ");
		WindowComponent c = new WindowComponent("WindowComponent");
		for (ViewComponentNode child : comp.children) {
			ComponentNode cc = child.visit(this);
			c.children.add(cc);
		}

		return c;
	}

	public ComponentNode enter(ViewZoneComponent comp) {
		System.out.println("specific enter viewInfo  " + comp.id);
		ZoneComponent c = new ZoneComponent("ZoneComponent");
		for (ViewComponentNode child : comp.children) {
			ComponentNode cc = child.visit(this);
			c.children.add(cc);
		}
		return c;
	}

	public ComponentNode enter(ViewOutputComponent comp) {
		System.out.println("specific enter viewInfo  " + comp.id);
		OutputComponent c = new OutputComponent("OutputComponent");
		return c;
	}

	public ComponentNode enter(ViewInputComponent comp) {
		System.out.println("specific enter viewInfo  " + comp.id);
		InputComponent c = new InputComponent("InputComponent");
		return c;
	}

	public ComponentNode enter(ViewComponentNode viewInfo) {
		System.out.println("GENERIC enter viewInfo: " + viewInfo.id);
		throw new RuntimeException("No file definition for " + viewInfo.id);
	}

}
