
package aula05;


public class ContaBanco {
    public int numConta;
    protected String tipo; //Corrente ou poupança
    private String dono;
    private double saldo;
    private boolean status; //Aberta ou fechada

    //Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.status = false;
    }
    
    public void abrirConta(String tipo){
        this.setStatus(true);
        setTipo(tipo);
        
        if(tipo.equalsIgnoreCase("cc")) this.setSaldo(50);
        else this.setSaldo(150);
        
    }
    public void fecharConta(){
        if(this.getSaldo() > 0) 
            System.out.println("Conta com dinheiro!");
        else if(this.getSaldo() < 0)
            System.out.println("Conta em débito");
        else
            this.status = false;
    }
    
    public void depositar(double valor){
        System.out.print(this.getDono() + " ");
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.print("R$"+valor+" adicionado(s) com sucesso!\n");
        }
        else{
            System.out.print("Não é possível depositar, pois a conta está fechada\n");
        }
    }
    public void sacar(double valor){
        System.out.print(this.getDono() + " ");
        if(!this.isStatus()){
            System.out.print("Conta desativada\n");
            return;
        }
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            System.out.print("R$"+valor+" sacado com sucesso!\n");
        }
        else{
            System.out.print("Não é possível sacar, pois a conta está fechada ou o saldo é insuficiente\n");
        }
    }
    
    public void pagarMensal(){
        double valorMensalidade = "cc".equals(this.getTipo()) ? 12 : 20;
        
        if(this.status){
            if(this.getSaldo() >= valorMensalidade)
                this.setSaldo(this.getSaldo() - valorMensalidade);
            else
                System.out.println("Saldo insuficiente");
        }
        else{
            System.out.println("Conta ");
        }
    }
    
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void estadoConta() {
        System.out.println("============================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + isStatus());

    }
}
