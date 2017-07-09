package viewComponents;

import java.util.HashMap;
import java.util.Map;

public enum ViewComponentFactoryDirectory {
	INSTANCE;

	static {
		ViewComponentFactoryDirectory.load();
	}

	public Map<String, ViewComponentFactory> index = new HashMap<String, ViewComponentFactory>();

	public void add(ViewComponentFactory node) {
		index.put(node.getViewName(), node);
	}

	public ViewComponentFactory byViewName(String name) {
		ViewComponentFactory factory = index.get(name);
		if (factory == null) {
			throw new RuntimeException("ViewComponentFactory not found for viewName: " + name);
		}
		return factory;
	}

	public static void load() {
		ViewComponentFactoryDirectory.INSTANCE.add(new ViewWindowComponent.WindowComponentFactory());
		ViewComponentFactoryDirectory.INSTANCE.add(new ViewInputComponent.InputComponentFactory());
		ViewComponentFactoryDirectory.INSTANCE.add(new ViewOutputComponent.OutputComponentFactory());
		ViewComponentFactoryDirectory.INSTANCE.add(new ViewZoneComponent.ZoneComponentFactory());
	}

}
