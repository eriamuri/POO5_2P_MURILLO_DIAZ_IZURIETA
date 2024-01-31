/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import modelo.Usuario;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

/*
 * @author Hp
 */

/**
* Clase Controlador de InicioSesion que implementa Initializable
*/
public class InicioSesionController implements Initializable {
    private ArrayList <Usuario> listaUsuarios= new ArrayList<>();
    public static Usuario usuarioSeleccionado;
    
    @FXML
    TextField usuario;
    
    @FXML
    TextField contraseña;
    
    @FXML
    private HBox root;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaUsuarios=IniciarUsuarios();
        try{
            InputStream inputStream = new FileInputStream("src/main/resources/imagen/fondo.PNG");
            Image image = new Image(inputStream);
            BackgroundImage backgroundImage = new BackgroundImage(
                image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
            );
            Background background = new Background(backgroundImage);
            root.setBackground(background);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    /**
    * Metodo que carga los usuarios en el sistema
    *@param 
    *@return listaUsu se retorna una lista de usuarios
    */
    
    private ArrayList<Usuario>IniciarUsuarios() {
        ArrayList<Usuario> listaUsu = new ArrayList<>();
        try{
        File fl=new File("src/main/resources/Textos/Cliente.txt");
        FileReader fr= new FileReader(fl);
        BufferedReader br= new BufferedReader(fr);
        String linea;
        while((linea=br.readLine())!=null){
            String [] informacion= linea.split(",");
            Usuario usu=new Usuario(informacion[0],informacion[1],informacion[2],informacion[3],informacion[4]);
            listaUsu.add(usu); 
        }
        }
        catch(IOException ex){
            ex.printStackTrace();
             
        }
        return listaUsu;
    }
    
    /**
    *Metodo que inia sesion al recibir una accion por parte del usuario
    *@param ae un action evente, se recibe una accion.
    */
    @FXML
    public void IniciarSesion(ActionEvent ae){
        boolean despliegar = false;
        for(Usuario u: listaUsuarios){
            if(u.getUsuario().equals(usuario.getText())&& u.getContraseña().equals(contraseña.getText())){
                despliegar = true; 
                usuarioSeleccionado = u;    
            }
            if(despliegar == true){
                Alert ale=new Alert(Alert.AlertType.INFORMATION);
                ale.setContentText("credenciales validas");
                ale.setTitle("Informacion");
                ale.showAndWait();
                CambiarEscena();
            }
            else{
                Alert ale=new Alert(Alert.AlertType.INFORMATION);
                ale.setContentText("credenciales no validas");
                ale.setTitle("Informacion"); 
                ale.showAndWait();
            }
        }  
    }
    
    /**
    *Metodo que inia sesion al recibir una accion por parte del usuario
    */
    public void CambiarEscena(){
        try{
            Stage actual=(Stage) usuario.getScene().getWindow();
            FXMLLoader fxmlloader =new FXMLLoader(getClass().getResource("/Vistas/Bienvenido.fxml"));
            Scene sc=new Scene(fxmlloader.load(),807,480);
            actual.setScene(sc);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
     }
    
    /*
    * metodo que cierra la ventana dependiendo del tiempo de uso del usuario
    * @param label la etiqueta de aviso
    * @param escenario escenario que se cerrará
    */
    public static void cerrar(Label label,Stage escenario){
        for(int i =5;i!=0;i--){
            String status = "Cerrando en "+i+" segundos..                                ";
            Platform.runLater(new Runnable(){
                public void run(){  
                    label.setText(status); }
                    });  
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException ex) {
                       ex.printStackTrace();
                    }
                  }
        Platform.runLater(new Runnable(){
                public void run(){  
                    escenario.close();}
                    }); 
    }
   
    /**
    * Metodo que permite utilar la accion cerrar()
    * @param label Etiqueta que muestra el tiempo faltante para que se cierra la ventana
    * @param escenario Ventana a cerrar
    */
    public static void iniciarcerrar(Label label,Stage escenario) {
        Thread dormido = new Thread(() -> {
            cerrar(label,escenario);
        });
        dormido.start();
    }
    
}
