package j2html;

public class Attribute {
	private String name;
	private String value;

	public Attribute(String name, String value) {
		this.name = name;
		this.value = Text.escapeHtml4(value);
	}

	public Attribute(String name) {
		this.name = name;
		this.value = null;
	}

	public String render() {
		if (name == null) {
			return "";
		}
		if (value == null) {
			return " " + name;
		}
		return (" " + name + "=\"" + value + "\"");
	}

	@Override
	public String toString() {
		return this.render();
	}

	public String getName() {
		return name;
	}

	public void setValue(String value) {
		this.value = value;
	}
}