package xml;

import java.io.IOException;
import java.io.InputStream;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class XmlTreeBuilder {

	public Element build(InputStream input) throws JDOMException, IOException {
		// Use a SAX builder
		SAXBuilder builder = new SAXBuilder();
		// build a JDOM2 Document using the SAXBuilder.
		Document jdomDoc = builder.build(input);

		// get the document type
		System.out.println("DocType: " + jdomDoc.getDocType());

		// get the root element
		Element root = jdomDoc.getRootElement();
		return root;
	}
}
