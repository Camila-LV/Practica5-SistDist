import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServidorOperaciones extends UnicastRemoteObject implements ServicioOperaciones {
    public ServidorOperaciones() throws RemoteException {
        super();
    }

    public String calcularSuma(float a, float b) throws RemoteException {
        float c=0;
        c=a+b;
        return Float.toString(c);
    }

    public String calcularResta(float a, float b) throws RemoteException {
        float c=0;
        c=a-b;
        return Float.toString(c);
    }

    public String calcularMulti(float a, float b) throws RemoteException {
        float c=0;
        c=a*b;
        return Float.toString(c);
    }

    public String calcularDiv(float a, float b) throws RemoteException {
        float c=0;
        c=a/b;
        return Float.toString(c);
    }
}