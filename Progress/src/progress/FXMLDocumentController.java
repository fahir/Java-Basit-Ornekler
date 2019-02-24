/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progress;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/**
 *
 * @author Win
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private ProgressBar progress;
    @FXML
    private Label size;
    private File file;
    private long count;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        // Thread t = new Thread(new progress());
        // t.start();
        ScheduledExecutorService servis = Executors.newScheduledThreadPool(2);//2 elemanlı servis oluşturduk
        servis.submit(new progress());
        servis.submit(() -> {
            for (int i = 0; i < 200; i++) {
                System.out.println("Döngü:" + (i + 1));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        servis.submit(() -> {
            while (true) {
                System.out.println("Ben işimi bitirdim başka iş var mı?");
                Thread.sleep(500);
            }
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        file = new File("mursid.iso");
    }

    public class progress implements Runnable {

        @Override
        public void run() {
            FileInputStream stream = null;
            try {
                stream = new FileInputStream(file);
                byte[] buffer = new byte[1024];//her döngüde 1024 byte okunacak
                int len = 0;
                count = 0;
                while ((len = stream.read(buffer)) > 0) {
                    count += len;
                    progress.setProgress(1.0 * count / file.length());
                    Platform.runLater(() -> {
                        size.setText("" + count);
                    });

                }
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
