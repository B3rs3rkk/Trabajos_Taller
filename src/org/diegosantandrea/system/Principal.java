package org.diegosantandrea.system;
import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.diegosantandrea.controller.MenuCargoEmpleadoController;
import org.diegosantandrea.controller.MenuClientesController;
import org.diegosantandrea.controller.MenuComprasController;
import org.diegosantandrea.controller.MenuDetalleCompraController;
import org.diegosantandrea.controller.MenuDetalleFacturaController;
import org.diegosantandrea.controller.MenuEmailProveedorController;
import org.diegosantandrea.controller.MenuEmpleadoController;
import org.diegosantandrea.controller.MenuFacturaController;
import org.diegosantandrea.controller.MenuPrincipalController;
import org.diegosantandrea.controller.MenuProductosController;
import org.diegosantandrea.controller.MenuProgramadorController;
import org.diegosantandrea.controller.MenuProveedorController;
import org.diegosantandrea.controller.MenuTelefonoProveedorController;
import org.diegosantandrea.controller.MenuTipoProductoController;

public class Principal extends Application {

    private Stage escenarioPrincipal;
    private Scene escena;

    @Override
    public void start(Stage escenarioPrincipal) throws IOException {
        this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioPrincipal.setTitle("KinalExpress");
        menuPrincipalView();
//       Parent root = FXMLLoader.load(getClass().getResource("/org/diegosantandrea/view/MenuPrincipalView.fxml"));
//       Scene escena = new Scene(root);
//       escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }

    public Initializable cambiarEscena(String fxmlname, int width, int heigth) throws Exception {
        Initializable resultado;
        FXMLLoader loader = new FXMLLoader();
        InputStream file = Principal.class.getResourceAsStream("/org/diegosantandrea/view/" + fxmlname);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Principal.class.getResource("/org/diegosantandrea/view/" + fxmlname));
        escena = new Scene((AnchorPane) loader.load(file), width, heigth);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        resultado = (Initializable) loader.getController();

        return resultado;
    }

    public void menuPrincipalView() {
        try {
            MenuPrincipalController menuPrincipalView = (MenuPrincipalController) cambiarEscena("MenuPrincipalView.fxml", 497, 489);
            menuPrincipalView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuClienteView() {
        try {
            MenuClientesController menuClienteView = (MenuClientesController) cambiarEscena("MenuClienteView.fxml", 863, 482);
            menuClienteView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuProgramadorView() {
        try {
            MenuProgramadorController menuProgramadorView = (MenuProgramadorController) cambiarEscena("MenuProgramadorView.fxml", 600, 350);
            menuProgramadorView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuProveedorView() {
        try {
            MenuProveedorController menuProveedorView = (MenuProveedorController) cambiarEscena("MenuProveedorView.fxml", 910, 501);
            menuProveedorView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuTipoDeProductoView() {
        try {
            MenuTipoProductoController menuTipoDeProductoView = (MenuTipoProductoController) cambiarEscena("MenuTipoProductoView.fxml", 800, 432);
            menuTipoDeProductoView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuComprasView() {
        try {
            MenuComprasController menuComprasView = (MenuComprasController) cambiarEscena("MenuComprasView.fxml", 800, 450);
            menuComprasView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuCargoEmpleadoView() {
        try {
            MenuCargoEmpleadoController menuCargoEmpleadoView = (MenuCargoEmpleadoController) cambiarEscena("MenuCargoEmpleadoView.fxml", 747, 427);
            menuCargoEmpleadoView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuProductoView() {
        try {
            MenuProductosController menuProductoView = (MenuProductosController) cambiarEscena("MenuProductosView.fxml", 835, 462);
            menuProductoView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuEmailProveedorView() {
        try {
            MenuEmailProveedorController menuEmailProveedorView = (MenuEmailProveedorController) cambiarEscena("MenuEmailProveedorView.fxml", 595, 420);
            menuEmailProveedorView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuEmpleadoView() {
        try {
            MenuEmpleadoController menuEmpleadoView = (MenuEmpleadoController) cambiarEscena("MenuEmpleadosView.fxml", 595, 425);
            menuEmpleadoView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuTelefonoProveedorView() {
        try {
            MenuTelefonoProveedorController menuTelefonoProveedorView = (MenuTelefonoProveedorController) cambiarEscena("MenuTelefonoProveedorView.fxml", 600, 420);
            menuTelefonoProveedorView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuDetalleCompraView() {
        try {
            MenuDetalleCompraController menuDetalleCompraView = (MenuDetalleCompraController) cambiarEscena("MenuDetalleComprasView.fxml", 595, 420);
            menuDetalleCompraView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuFacturaView() {
        try {
            MenuFacturaController menuFacturaView = (MenuFacturaController) cambiarEscena("MenuFacturaView.fxml", 606, 426);
            menuFacturaView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuDetalleFacturaView() {
        try {
            MenuDetalleFacturaController menuDetalleFacturaView = (MenuDetalleFacturaController) cambiarEscena("MenuDetalleFacturaView.fxml", 606, 426);
            menuDetalleFacturaView.setEscenarioPrincipal(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
