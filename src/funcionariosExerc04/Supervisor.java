package funcionariosExerc04;

public class Supervisor extends Funcionario{

    @Override
    public double bonificacao() {
        return super.bonificacao() + 5000.00;
    }
}
