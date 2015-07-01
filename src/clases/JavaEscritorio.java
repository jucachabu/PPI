package clases;

import formularios.frmLogin;


public class JavaEscritorio {

    public static void main(String[] args) {
        // creo el Objeto Datos
        Datos misDatos = new Datos();
        // Llamamos el Formulario Login
        frmLogin miLogin = new frmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
        
        
        
    }
    
}
