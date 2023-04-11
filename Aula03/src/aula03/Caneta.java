package aula03;


public class Caneta {
    public String modelo, cor;
    private float ponta;
    protected float carga;
    protected boolean tampada;
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + (this.tampada ? "Sim" : "Não"));
    }
    
    public void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO");
        }
        else{
            System.out.println("Rabisco");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
}
