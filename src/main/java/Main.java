import com.google.gson.Gson;
import model.*;

public class Main {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("Huawei");
        Funcionario f1 = new Funcionario("Carlos", 24, "Quality Assurance", 3000);
        Funcionario f2 = new Funcionario("Jonas", 30, "Sênior Engineer", 8000);
        Cliente c1 = new Cliente("José", 21);
        Gson gson = new Gson();

        System.out.println("André adicionando algo!");

        e1.adicionarFuncionario(f1);
        e1.adicionarFuncionario(f2);
        e1.adicionarCliente(c1);

        c1.adicionarCompra("Dell Inspiron 1300");
        c1.adicionarCompra("Mousepad Onyx");
        c1.adicionarCompra("Lenovo Widescreen 1440Hz");

        System.out.println(c1.getHistoricoCompras());

        String json = gson.toJson(f1);
        String json2 = gson.toJson(f2);
        String json3 = gson.toJson(c1);

        System.out.println(json);
        System.out.println(json2);
        System.out.println(json3);
    }
}