package system.service;
import system.service.UserService;

public class User {
    String nomeCompleto;
    int id, cpf;
    double saldo;

    public User(String nomeCompleto, int cpf, int id, double saldoInicial){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.id = id;
        this.saldo = saldoInicial;
    }

    public void informarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    public void somarSaldo(double valor){
        if(valor > 0){
            saldo += valor;
        }
        else {
            System.out.println("Digite algum valor positivo");
        }
    }
    public void sacarSaldo(double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}