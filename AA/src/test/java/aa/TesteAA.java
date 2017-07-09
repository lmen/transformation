package aa;

import java.io.IOException;
import java.io.InputStream;

import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.junit.Test;

import viewComponents.ViewComponentNode;
import viewComponents.ViewComponentTreePrinter;
import viewComponents.Visitor;
import xml.XmlTreeBuilder;
import xml.XmlTreePrinter;

public class TesteAA {

	@Test
	public void ol() throws JDOMException, IOException {

		InputStream xmlFile = TesteAA.class.getClassLoader().getResourceAsStream("record.xml");
		Element root = new XmlTreeBuilder().build(xmlFile);
		new XmlTreePrinter().print(root);

		ViewComponentNode rootComp = new ViewComponentTreeBuilder().build(root);
		new ViewComponentTreePrinter().print(rootComp);

		rootComp.accept(new Visitor());
	}

}
