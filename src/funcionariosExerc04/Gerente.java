package funcionariosExerc04;

public class Gerente extends Funcionario {


    @Override
    public double bonificacao() {
        return super.bonificacao() + 10000.00;
    }
}
