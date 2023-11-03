import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicioOperaciones extends Remote {
    String calcularSuma(float a, float b) throws RemoteException;
    String calcularResta(float a, float b) throws RemoteException;
    String calcularMulti(float a, float b) throws RemoteException;
    String calcularDiv(float a, float b) throws RemoteException;
}
