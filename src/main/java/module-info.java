module newclock.project.random.newclock {
    requires javafx.controls;
    requires javafx.fxml;


    opens newclock.project.random.newclock to javafx.fxml;
    exports newclock.project.random.newclock;
}