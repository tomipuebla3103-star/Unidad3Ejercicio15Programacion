public class Enrutador{
private String identificador;
private String direccionIP;
private boolean conectado;

public Enrutador(String identificador, String direccionIP, boolean conectado) {
    this.identificador = identificador;
    this.direccionIP = "192.168.1.1";
    this.conectado = conectado;

    setDireccionIP(direccionIP);
}

public void setDireccionIP(String nuevaIp) {
    if (nuevaIp.matches("([0-9]{1,3}\\.){3}[0-9]{1,3}")) {
        String[] partes = nuevaIp.split("\\.");
        boolean valida = true;

        for (int i = 0; i < partes.length; i++) {
            int numero = Integer.parseInt(partes[i]);

            if (numero < 0 || numero > 255) {
                valida = false;
            }
        }

        if (valida) {
            direccionIP = nuevaIp;
            System.out.println("IP configurada correctamente: " + direccionIP);
        } else {
            System.out.println("Error: dirección IP incorrecta.");
        }
    } else {
        System.out.println("Error: formato de IP incorrecto.");
    }
}

public String getIdentificador() {
    return identificador;
}

public String getDireccionIP() {
    return direccionIP;
}

public boolean isConectado() {
    return conectado;
}

public void mostrarEstado() {
    System.out.println("Identificador: " + identificador);
    System.out.println("Dirección IP: " + direccionIP);
    System.out.println("Conectado: " + conectado);
}
}
