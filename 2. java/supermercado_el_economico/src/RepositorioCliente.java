import java.util.ArrayList;
import java.util.List;

public class RepositorioCliente {

    List<Cliente> clientes;

    public RepositorioCliente() {
        this.clientes = new ArrayList<>();
    }

    public List<Cliente> findAll() {
        return clientes;
    }

    public void save(Cliente cliente){
        clientes.add(cliente);
    }

    public void deleteByDni(String dni){
        boolean flag = true;
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getDni().equals(dni)){
                System.out.println("cliente eliminado: " + clientes.remove(i));
                flag = false;
                break;
            }

        }
        if(flag) System.out.println("cliente no encontrado");
    }

    public Cliente findByDni(String dni){
        boolean flag = true;
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getDni().equals(dni)){
                flag = false;
                return clientes.get(i);
            }

        }
        if(flag) System.out.println("cliente no encontrado");
        return null;
    }
}