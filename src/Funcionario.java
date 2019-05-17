
public class Funcionario {
public String nome;
public String cpf;
public String cargo;
public double valorHora;
public double horasTrabalhadas;
public double beneficioDependentes;
public int quantidadeDependentes;
public byte tipoInsalubridade;
public double totalInsalubridade;
public double valeTransporte;
public double valorTotalPassagem;
public double salarioFamilia;
public double descontoInss;
public double Inss;
public double salarioLiquido; 

public double calcularSalario(){
    return this.valorHora * this.horasTrabalhadas;
}
public double calcularValeTransporte(){
    double Sb = calcularSalario();
    double Vt = this.calcularSalario() * 0.06; 
    if(Vt > this.valorTotalPassagem){
      return this.valorTotalPassagem;
    }else{
      return Vt;
    }
   }
public double calcularBeneficioDependentes(){
    if(calcularSalario()<=725.02){
        this.beneficioDependentes = 37.18 * this.quantidadeDependentes;
    }else if(calcularSalario()>= 725.03 && calcularSalario()<=1089.72){;
        this.beneficioDependentes = 26.20 * this.quantidadeDependentes;
    }else{
        this.beneficioDependentes = 0;
    }
    return this.beneficioDependentes;
}
public double calcularInsalubridade(){
    switch(this.tipoInsalubridade){
        case 1:
            this.totalInsalubridade = 0;
            break;
        case 2:
            this.totalInsalubridade = 868.00 * 0.1;
            break;
        case 3:
            this.totalInsalubridade = 868.00 * 0.2;
            break;
        default:
            this.totalInsalubridade = 868.00 * 0.4;
    }
    return this.totalInsalubridade;
    }
public double calcularInss(){
    if(calcularSalario()<=1317.07){
       this.descontoInss = calcularSalario() * 0.08;
    }else if(calcularSalario()>=1317.08 && calcularSalario()<=2195.12){
       this.descontoInss = calcularSalario() * 0.09;
    }else{
       this.descontoInss = calcularSalario() * 0.11;
       
    }
    return this.descontoInss;
}
public double calcularSalarioLiquido(){
    return calcularSalario() - calcularInss() + calcularInsalubridade() + calcularBeneficioDependentes() - calcularValeTransporte();
}

    @Override
    public String toString() {
        return  "Nome = " + nome+
                "\n cpf = " + cpf +
                "\n cargo = " + cargo + 
                "\nvalorHora = " + valorHora+
                "\nhorasTrabalhadas = " + horasTrabalhadas + 
                "\nbeneficioDependentes = " + beneficioDependentes + 
                "\nquantidadeDependentes = " + quantidadeDependentes + 
                "\ntipoInsalubridade = " + tipoInsalubridade + 
                "\ntotalInsalubridade = " + totalInsalubridade + 
                "\nvaleTransporte = " + valeTransporte + 
                "\n valorTotalPassagem = " + valorTotalPassagem + 
                "\n salarioFamilia = " + salarioFamilia + 
                "\n descontoInss = " + descontoInss + 
                "\n Inss = " + Inss 
                + "\n salarioLiquido = " +salarioLiquido;
    }

}  

