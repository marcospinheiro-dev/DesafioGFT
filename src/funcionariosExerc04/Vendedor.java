package funcionariosExerc04;

public class Vendedor extends Funcionario{

    @Override
    public double bonificacao() {
        return super.bonificacao() + 3000.00;
    }
}
