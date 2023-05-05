package gr.upatras.MqttTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class TextController {
	@Autowired
	private ITextService textService;
	private static final Logger log = LoggerFactory.getLogger(TextController.class);

	@ApiOperation(value = "Creates a Text", notes = "This operation creates a Text entity.", response = Text.class)
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created", response = Text.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
			@ApiResponse(code = 403, message = "Forbidden", response = Error.class),
			@ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
			@ApiResponse(code = 409, message = "Conflict", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	@RequestMapping(value = "/text", produces = { "application/json;charset=utf-8" }, consumes = {
			"application/json;charset=utf-8" }, method = RequestMethod.POST)
	public ResponseEntity<Text> createText(
			@ApiParam(value = "The Text to be created", required = true) @RequestBody Text t) {
		log.info("Will add a new text");
		Text text = textService.addText(t);
		return new ResponseEntity<Text>(text, HttpStatus.OK);
	}
}