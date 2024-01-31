/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import Controlador.InicioSesionController;
import Controlador.ReservarVueloController;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import modelo.reserva;
import Controlador.PagoController;
import java.io.IOException;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import modelo.Pago;
/*
 * FXML Controller class
 *
 * @author Hp
 */
public class FinalizacionController implements Initializable {
    
    public String CodigoReserva;
    private Pago pago;
    public static Label labelCerrar= new Label("hi");
    
    @FXML
    private Label codigo;
    
    @FXML
    private VBox root;  
    
    @FXML
    private HBox contenedorLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        contenedorLabel.getChildren().add(labelCerrar);
        CodigoReserva=generarCadenaAleatoria();
        codigo.setText(CodigoReserva);
        
        GenerarReserva();
        EscribirPago();   
    }  
    
    /**
    *metodo que genera una cadena aleatoria
    *@return String una cadena con varias letras para el nombre de los archivos serializados
    */
    private String generarCadenaAleatoria() {   
        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int longitudCadena = 5;
        Random random = new Random();
        StringBuilder cadenaAleatoria = new StringBuilder();
        for (int i = 0; i < longitudCadena; i++) {
            int indice = random.nextInt(caracteresPermitidos.length());
            char caracterAleatorio = caracteresPermitidos.charAt(indice);
            cadenaAleatoria.append(caracterAleatorio);
        }
        return cadenaAleatoria.toString();
    }
    
    /**
    *metodo que genera una cadena aleatoria
    *@return String una cadena con varios numeros del 0 al 9 que sera el codigo de las reservas
    */
    public String generarCodigoAzar() {
        Random random = new Random();
        int digito1 = random.nextInt(10);  // Números entre 0 (inclusive) y 10 (exclusive)
        int digito2 = random.nextInt(10);
        int digito3 = random.nextInt(10);

        String codigo = String.format("%d%d%d", digito1, digito2, digito3);
        return codigo;
    }
    
    /**
    *metodo que genera una reserva empleando los otros controladores
    */
    public void GenerarReserva(){
        reserva rs=new reserva(CodigoReserva,
        InicioSesionController.usuarioSeleccionado.getCedula(),
        ReservarVueloController.LugarSalida,
        ReservarVueloController.LugarLlegada,
        ReservarVueloController.fecha_partida,
        ReservarVueloController.fecha_Regreso,
        ReservarVueloController.numeroP,
        ReservarVuelo2Controller.vueloseleccionado.getCodigoVuelo(),
        ReservarVuelo4Controller.vueloseleccionado2.getCodigoVuelo(),
        ReservarVuelo3Controller.TarifaViaje1.getTipo(),
        ReservarVuelo5Controller.TarifaViaje2.getTipo());
        
        pago = rs.GenerarTransaccion(generarCodigoAzar(),CodigoReserva,PagoController.subtotal1+PagoController.subtotal2,PagoController.Descuento,PagoController.tipo,PagoController.Total);
        
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("src/main/resources/ReservasSerializadas/"+rs.getCodigoReserva()+".bin"))) {
            salida.writeObject(rs);
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        } 
        finally{
            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/Textos/reservas.txt",true));
                writer.write(rs.getCodigoReserva()+","+rs.getCedulaCliente()+","+rs.getCiudadOrigen()+","+rs.getCiudadDestino()+","+rs.getFechaSalida()+","+String.valueOf(rs.getNumeroPasajeros())+","+String.valueOf(rs.getNumeroVuelo())+","+String.valueOf(rs.getNumeroVueloRegreso())+","+rs.getTipoTarifaIda()+rs.getTipoTarifaRegreso()+"\n");
                writer.close();
            }
            catch(Exception a){}
        }    
    }
    
    /**
    *metodo que escribe el pago en el texto definido
    */
    public void EscribirPago(){
        try {
            // Crear un BufferedWriter para escribir en el archivo
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/Textos/Pagos.txt",true));
            writer.write(pago.getIdpago()+","+pago.getCodigoReserva()+","+pago.getTotalReserva()+","+pago.getDescuento()+","+pago.getFormaPago()+","+pago.getTotalPagar()+"\n");

            writer.close();

        } 
        catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
        finally{} 
    } 
}
