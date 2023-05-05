package gr.upatras.MqttTest;

public class Text {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public Text() {};

	public Text(String text) {
		super();
		this.text = text;
	}
}