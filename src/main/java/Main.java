import br.inatel.model.Cliente;
import br.inatel.model.Empresa;
import br.inatel.model.Funcionario;
import br.inatel.model.Pessoa;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("Huawei");
        Pessoa p1 = new Pessoa("André", 22);
        Pessoa p2 = new Pessoa("Maria", 20);
        Funcionario f1 = new Funcionario(p1, "Quality Assurance", 3000, 1093, "Noturno");
        Funcionario f2 = new Funcionario(p2, "Sênior Engineer", 8000, 2981, "Integral");
        Cliente c1 = new Cliente("José", 21);
        Gson gson = new Gson();

        System.out.println("André adicionando algo para incorrer conflito!");

        e1.adicionarFuncionario(f1);
        e1.adicionarFuncionario(f2);
        e1.adicionarCliente(c1);

        c1.adicionarCompra("Dell Inspiron 1300");
        c1.adicionarCompra("Mousepad Onyx");
        c1.adicionarCompra("Lenovo Widescreen 1440Hz");

        System.out.println(c1.getHistoricoCompras());

        System.out.println(f1.toString());
        System.out.println(f2.toString());

        System.out.println(c1.toString());

        String json = gson.toJson(f1);
        String json2 = gson.toJson(f2);
        String json3 = gson.toJson(c1);

        System.out.println(json);
        System.out.println(json2);
        System.out.println(json3);
    }
}
