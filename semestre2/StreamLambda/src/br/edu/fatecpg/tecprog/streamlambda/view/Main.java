package br.edu.fatecpg.tecprog.streamlambda.view;

import br.edu.fatecpg.tecprog.streamlambda.model.Funcionario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        // População da Lista
        funcionarios.add(new Funcionario("Bianca", "TI", 3500, 3));
        funcionarios.add(new Funcionario("Roberson", "TI", 3000, 1));
        funcionarios.add(new Funcionario("Janilson", "TI", 7500, 12));
        funcionarios.add(new Funcionario("Anita", "Marketing", 3500, 6));
        funcionarios.add(new Funcionario("Benedita", "RH", 5000, 15));
        funcionarios.add(new Funcionario("Leia", "RH", 7500, 22));
        funcionarios.add(new Funcionario("Leo", "Marketing", 5000, 15));
        funcionarios.add(new Funcionario("Ale", "RH", 7500, 4));

        // Operações com Streams e Lambdas

        // Filtragem
        List<Funcionario> salarioMaior3K = funcionarios.stream().filter(salario -> salario.getSalario() > 3000).toList();

        // Mapeamento
        List<Funcionario> funcionariosAumento = funcionarios.stream()
                .filter(anos -> anos.getAnosServico() > 10)
                .map(funcionario -> new Funcionario(
                        funcionario.getNome(),
                        funcionario.getDepto(),
                        funcionario.getSalario() *  1.05,
                        funcionario.getAnosServico()
                )).toList();

        // Ordenação
        List<Funcionario> funcionariosOrdenados = funcionarios.stream().sorted(Comparator.comparing(Funcionario::getNome)).toList();

        // Redução
        Double totalSalarios = funcionarios.stream().map(Funcionario::getSalario).reduce(0.0, Double::sum);

        // Agrupamento
        Map<String, Double> mediaSalarialPorDepto = funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getDepto, Collectors.averagingDouble(Funcionario::getSalario)));

        // Desafio adicional: exibir funcionário com maior tempo de serviço
        Funcionario maiorTempoDeServico = funcionarios.stream().sorted(Comparator.comparing(Funcionario::getAnosServico).reversed()).findFirst().get();

        // Exibição dos Resultados
        System.out.println("\n\033[93mFuncionários:\033[0m");
        funcionarios.forEach(f -> System.out.printf(
                "Funcionário: %s | Departamento: %s | Salário: R$ %.2f | Anos de Serviço: %d. \n",
                f.getNome(),
                f.getDepto(),
                f.getSalario(),
                f.getAnosServico()
        ));

        System.out.println("\n\033[93mFuncionários que ganham mais de 3K:\033[0m");
        salarioMaior3K.forEach(f -> System.out.printf(
                "Funcionário: %s | Departamento: %s | Salário: R$ %.2f | Anos de Serviço: %d. \n",
                f.getNome(),
                f.getDepto(),
                f.getSalario(),
                f.getAnosServico()
        ));

        System.out.println("\n\033[93mFuncionários que ganharam aumento de 5%:\033[0m");
        funcionariosAumento.forEach(f -> System.out.printf(
                "Funcionário: %s | Departamento: %s | Salário: R$ %.2f | Anos de Serviço: %d. \n",
                f.getNome(),
                f.getDepto(),
                f.getSalario(),
                f.getAnosServico()
        ));

        System.out.println("\n\033[93mFuncionários ordenados por nome:\033[0m");
        funcionariosOrdenados.forEach(f -> System.out.printf(
                "Funcionário: %s | Departamento: %s | Salário: R$ %.2f | Anos de Serviço: %d. \n",
                f.getNome(),
                f.getDepto(),
                f.getSalario(),
                f.getAnosServico()
        ));

        System.out.printf("\n\033[93mSalário total:\033[0m R$ %.2f \n", totalSalarios);

        System.out.println("\n\033[93mMédia salarial por departamento:\033[0m");
        mediaSalarialPorDepto.forEach((depto, media) -> {
            System.out.printf("Departamento: %s | Média salarial: R$ %.2f\n", depto, media);
        });

        System.out.printf("\n\033[93mFuncionário com maior tempo de serviço: \033[0m" +
                "%s | Departamento: %s | Salário: R$ %.2f | Anos de Serviço: %d.\n",
                maiorTempoDeServico.getNome(),
                maiorTempoDeServico.getDepto(),
                maiorTempoDeServico.getSalario(),
                maiorTempoDeServico.getAnosServico()
        );
    }
}
