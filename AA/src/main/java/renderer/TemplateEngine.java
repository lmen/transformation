package renderer;

import java.io.StringWriter;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public enum TemplateEngine {
	INSTANCE;

	private Configuration cfg;

	private TemplateEngine() {
		this.cfg = init();
	}

	private Configuration init() {
		// Create your Configuration instance, and specify if up to what
		// FreeMarker
		// version (here 2.3.25) do you want to apply the fixes that are not
		// 100%
		// backward-compatible. See the Configuration JavaDoc for details.
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_25);

		// Specify the source where the template files come from. Here I set a
		// plain directory for it, but non-file-system sources are possible too:
		cfg.setClassForTemplateLoading(TemplateEngine.class, "/templates/");

		// Set the preferred charset template files are stored in. UTF-8 is
		// a good choice in most applications:
		cfg.setDefaultEncoding("UTF-8");

		// Sets how errors will appear.
		// During web page *development*
		// TemplateExceptionHandler.HTML_DEBUG_HANDLER is better.
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		// Don't log exceptions inside FreeMarker that it will thrown at you
		// anyway:
		cfg.setLogTemplateExceptions(false);

		return cfg;
	}

	public String render(String templatePath, Object values) {
		try {
			Template temp = cfg.getTemplate(templatePath);
			StringWriter s = new StringWriter();
			temp.process(values, s);
			s.close();
			return s.toString();
		} catch (Exception e) {
			throw new RuntimeException("Error while rendering", e);
		}
	}

}
