module WSUCougHacks2024 {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens com.majdaltouzach.sucklesspomodoro to javafx.graphics, javafx.fxml;
}
