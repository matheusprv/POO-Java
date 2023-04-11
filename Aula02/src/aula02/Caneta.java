package aula02;


public class Caneta {
    String modelo, cor;
    float ponta, carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + (this.tampada ? "Sim" : "Não"));
    }
    
    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO");
        }
        else{
            System.out.println("Rabisco");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
