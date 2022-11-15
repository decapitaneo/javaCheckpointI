package com.checkPoint1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DepartamentoPessoal func1 = new DepartamentoPessoal("Jose", "Souza", 1, "Contratado");
        DepartamentoPessoal func2 = new DepartamentoPessoal("Maria", "Silva", 2, "Afastado");
        DepartamentoPessoal func3 = new DepartamentoPessoal("Juliana", "Rocha", 3, "Desligado");

        func1.calcularFolhaPagamentoFuncionarios(12000.00F, 3000.00F);
        func2.calcularFolhaPagamentoFuncionarios(5000.00F);
        func3.calcularFolhaPagamentoFuncionarios(45000F, 12000F);

        DepartamentoContabil clienteContabil1 = new DepartamentoContabil(1, 150000.85,20000.00);
        DepartamentoContabil clienteContabil2 = new DepartamentoContabil(2, 250000.85,40000.00);
        DepartamentoContabil clienteContabil3 = new DepartamentoContabil(3, 350000.85,60000.00);

        clienteContabil1.calcularAtivo();
        clienteContabil2.calcularAtivo();
        clienteContabil2.calcularAtivo();


        DepartamentoFiscal clienteFiscal1 = new DepartamentoFiscal(2, 0.2, 258000.00);
        DepartamentoFiscal clienteFiscal2 = new DepartamentoFiscal(2, 0.1, 157200.00);
        DepartamentoFiscal clienteFiscal3 = new DepartamentoFiscal(2, 0.3, 453500.00);
        clienteFiscal1.calculaGuias();
        clienteFiscal2.calculaGuias();
        clienteFiscal3.calculaGuias();

        DepartamentoLegalizacao clienteLegalizacao1 = new DepartamentoLegalizacao("Ari&De IT Consulting", LocalDate.now(), 2215455454545146L, 15230.00, 3 );
        DepartamentoLegalizacao clienteLegalizacao2 = new DepartamentoLegalizacao("Testando a vida", LocalDate.now(), 2215455444445146L, 25000.00, 1 );
        DepartamentoLegalizacao clienteLegalizacao3 = new DepartamentoLegalizacao("Ari&De IT Consulting", LocalDate.now(), 2215455454540001L, 45000.00, 2 );

        clienteLegalizacao1.renovacaoAlvaras();
        clienteLegalizacao2.renovacaoAlvaras();
        clienteLegalizacao3.renovacaoAlvaras();
    }
}
