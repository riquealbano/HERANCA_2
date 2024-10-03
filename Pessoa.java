import java.time.LocalDate;

// A classe base Pessoa é usada para representar os atributos comuns entre vendedores, gerentes e clientes
class Pessoa {
    // Atributos comuns
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    // Construtor que recebe os atributos nome, cpf e data de nascimento
    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Métodos "getters" que permitem acessar os atributos privados
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}

// A classe Vendedor herda da classe Pessoa e inclui atributos específicos
class Vendedor extends Pessoa {
    // Atributos específicos do Vendedor
    private LocalDate dataContratacao;
    private double salarioBase;
    private double comissaoPercentual;

    // Construtor que inicializa tanto os atributos de Pessoa quanto os específicos de Vendedor
    public Vendedor(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, double comissaoPercentual) {
        super(nome, cpf, dataNascimento);  // Chama o construtor da classe Pessoa
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.comissaoPercentual = comissaoPercentual;
    }

    // Getters para acessar os atributos privados da classe Vendedor
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public double getComissaoPercentual() {
        return comissaoPercentual;
    }
}

// A classe Gerente também herda de Pessoa e tem atributos adicionais próprios
class Gerente extends Pessoa {
    // Atributos específicos de um Gerente
    private LocalDate dataContratacao;
    private double salarioBase;
    private String departamento;

    // Construtor que inicializa tanto os atributos de Pessoa quanto os de Gerente
    public Gerente(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, String departamento) {
        super(nome, cpf, dataNascimento);  // Chama o construtor da classe Pessoa
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    // Getters para acessar os atributos da classe Gerente
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public String getDepartamento() {
        return departamento;
    }
}

// A classe Cliente também herda de Pessoa e possui atributos adicionais para email, cartão e telefone
class Cliente extends Pessoa {
    // Atributos específicos do Cliente
    private String email;
    private String numCartaoFidelidade;
    private String telefone;

    // Construtor que inicializa os atributos de Pessoa e os específicos de Cliente
    public Cliente(String nome, String cpf, LocalDate dataNascimento, String email, String numCartaoFidelidade, String telefone) {
        super(nome, cpf, dataNascimento);  // Chama o construtor da classe Pessoa
        this.email = email;
        this.numCartaoFidelidade = numCartaoFidelidade;
        this.telefone = telefone;
    }

    // Getters para acessar os atributos da classe Cliente
    public String getEmail() {
        return email;
    }
    public String getNumCartaoFidelidade() {
        return numCartaoFidelidade;
    }
    public String getTelefone() {
        return telefone;
    }

    public static void main(String[] args) {
        // Criação de um objeto Vendedor e seus dados
        Vendedor vendedor = new Vendedor("Carlos Silva", "123.456.789-00", LocalDate.of(1990, 3, 15), LocalDate.of(2020, 5, 10), 2500.00, 12.0);
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Salário Base: R$ " + vendedor.getSalarioBase());
        System.out.println("Comissão: " + vendedor.getComissaoPercentual() + "%");
        System.out.println();

        // Criação de um objeto Gerente e seus dados
        Gerente gerente = new Gerente("Fernanda Souza", "987.654.321-00", LocalDate.of(1985, 8, 22), LocalDate.of(2018, 4, 10), 6000.00, "Tecnologia");
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Salário Base: R$ " + gerente.getSalarioBase());
        System.out.println("Departamento: " + gerente.getDepartamento());
        System.out.println();

        // Criação de um objeto Cliente e seus dados
        Cliente cliente = new Cliente("Ana Costa", "555.666.777-00", LocalDate.of(1995, 12, 18), "ana.costa@email.com", "98765", "(11) 91234-5678");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());
    }
}