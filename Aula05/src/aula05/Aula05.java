package aula05;

import java.util.ArrayList;

public class Aula05 {


    public static void main(String[] args) {
        
        //ArrayList<ContaBanco> contas= new ArrayList();
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Matheus");
        p1.abrirConta("CC");
             
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Camila");
        p2.abrirConta("CP");
        
        
        p1.depositar(1000);
        p2.depositar(500);
        
        p2.sacar(100);
        
        p1.estadoConta();
        p2.estadoConta();
    }
    
}
