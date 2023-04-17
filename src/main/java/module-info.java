module br.edu.atividade {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.atividade to javafx.fxml;
    exports br.edu.atividade;
}