package br.com.tentativa;

public class conta {
    private int numeroConta;
    private float saldo;
    private cliente titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public cliente getTitular() {
        return titular;
    }

    public void setTitular(cliente titular) {
        this.titular = titular;
    }

    public void deposito (float quantia){
        System.out.println("realizando deposito" + saldo);
        }

        public void saque (float quantia){
            System.out.println("realizando saque" + quantia);

            if (this.saldo > quantia) {
                System.out.println("saldo indisponivel");
            }

            this.saldo -= quantia;
            System.out.println("saque realizado" + "novo saldo" + this.saldo);
            }


    }

