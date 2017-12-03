/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeoncrawler;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Zuldred
 */
public class FXMLBattleDocumentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private GameHandler gameHandler;
    
    public void transferGameHandler(GameHandler gameHandler){
        this.gameHandler = gameHandler;
        battleLog.appendText("\n Your Health: " + gameHandler.player.health);
    }
    
    @FXML
    private TextArea battleLog;
    
    @FXML
    public void attackButton(){
    }
    
    @FXML
    public void usePotionButton(){
    }
    
    @FXML
    public void defendButton(){
    }
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}