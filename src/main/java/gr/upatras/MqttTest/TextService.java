package gr.upatras.MqttTest;

import org.springframework.stereotype.Service;

@Service
public class TextService implements ITextService{

	public TextService() {
		super();
	}
	
	@Override
	public Text addText(Text t) {
		return t;
	}
}
