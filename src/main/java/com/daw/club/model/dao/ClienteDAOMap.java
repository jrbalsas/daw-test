package com.daw.club.model.dao;

import com.daw.club.model.Cliente;
import com.daw.club.qualifiers.DAOMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped      //Elegible for Dependency Injection
@DAOMap
public class ClienteDAOMap implements ClienteDAO, Serializable{

    private  Map<Integer, Cliente> clientes=null;
    private  int idCliente = 1;

    public ClienteDAOMap() {
        if (clientes == null) {
            clientes = new HashMap<>();

            clientes.put(idCliente, new Cliente(idCliente++, "Paco López", "11111111A", false));
            clientes.put(idCliente, new Cliente(idCliente++, "María Jiménez", "22222222B", true));
            clientes.put(idCliente, new Cliente(idCliente++, "Carlos García", "33333333C", true));
        }
    }
    
    @Override
    public Cliente buscaId(Integer id) {
        return clientes.get(id);
    }
    @Override
    public List<Cliente> buscaTodos() {
        //return new ArrayList<Cliente>(clientes.values()); JDK<8
        return clientes.values().stream().collect(Collectors.toList());
    }

    @Override
    public boolean crea(Cliente c) {
        Cliente nc=new Cliente(c);
        nc.setId(idCliente);
        clientes.put(idCliente, nc);
        c.setId(idCliente);
        idCliente++;
        return true;
    }
        
    @Override
    public boolean guarda(Cliente c) {
        boolean result=false;
        if (clientes.containsKey(c.getId())) {
            Cliente nc=new Cliente(c);
            clientes.replace(c.getId(),c);
            result=true;
        }       
        return result;
    }
    
    @Override
    public boolean borra(Integer id) {
        boolean result=false;
        if (clientes.containsKey(id)) {
            clientes.remove(id);
            result = true;
        }
        return result;
    }
    
    public int numClientes() {
        return clientes.size();
    }

}
