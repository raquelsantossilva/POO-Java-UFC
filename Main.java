
public class Main{
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("Azul","bic",1.7);
        caneta1.escrever();
    }
}


class Caneta{
    String cor;
    String marca;
    double ponta;
    int carga;
    boolean tampada;

    public Caneta(String cor,String marca,double ponta){
        this.cor =cor;
        this.marca = marca;
        this.ponta = ponta;
        this.carga =100;
        this.tampada = true;
    }

    public void escrever(){
        if(this.tampada){
            System.out.print("erro a caneta esta tampada ");
        }else if (this.carga >0){
            System.out.println("estou escrevendo..");
            this.carga --;
        }else{
            System.out.println("erro caneta sem carga");
        }
    }

    public void destampar(){
        if(this.tampada = false){
            System.out.println("destampando....");
        }else{
            System.out.println("destampando....");
        }
    }

    public void recarregar(){
        if (this.carga == 0){
            this.carga ++;
            System.out.println("recarregando...");
        }
    }
}

