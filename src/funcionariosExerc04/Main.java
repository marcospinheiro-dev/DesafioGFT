package funcionariosExerc04;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Supervisor supervisor = new Supervisor();
        Vendedor vendedor = new Vendedor();

        gerente.setSalario(5000.0);
        supervisor.setSalario(4000.0);
        vendedor.setSalario(3000.);

        System.out.println("Salário Gerente: " + gerente.bonificacao());
        System.out.println("Salário Supervisor: " + supervisor.bonificacao());
        System.out.println("Salário Gerente: " + vendedor.bonificacao());
    }
}
