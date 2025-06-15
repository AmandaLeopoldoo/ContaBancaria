# ContaBancaria

Este projeto é um exercício de programação orientada a objetos em Java, simulando o funcionamento básico de uma conta bancária. O objetivo é praticar conceitos como encapsulamento, métodos, construtores, manipulação de arrays e interação com o usuário via console.

## Funcionalidades

- **Criação de contas bancárias** com número, titular e saldo inicial (opcional).
- **Depósito**: adicionar valor ao saldo da conta.
- **Saque**: retirar valor do saldo, descontando uma taxa fixa (se houver).
- **Consulta de saldo e dados da conta**.
- **Interação via console** para entrada e saída de dados.

## Estrutura do Projeto

- `Conta`: Classe representando a conta bancária, com atributos como número, titular e saldo. Inclui métodos para depósito, saque e exibição dos dados da conta.
- `Main` (ou outro nome): Classe principal responsável pela interação com o usuário, leitura dos dados da conta, execução das operações (depósito/saque) e exibição dos resultados.

## Como executar

1. Clone o repositório:
   ```sh
   git clone https://github.com/AmandaLeopoldoo/ContaBancaria.git
   cd ContaBancaria
   ```

2. Compile os arquivos Java:
   ```sh
   javac Conta.java Main.java
   ```
   (ajuste os nomes dos arquivos conforme os nomes reais do seu projeto)

3. Execute o programa:
   ```sh
   java Main
   ```

4. Siga as instruções no console para criar uma conta, efetuar depósitos, saques e visualizar o saldo.

## Exemplo de uso

```
Entre com o número da conta: 1234
Entre com o titular da conta: Amanda
Haverá depósito inicial (s/n)? s
Entre o valor de depósito inicial: 500.00

Dados da conta:
Conta 1234, Titular: Amanda, Saldo: R$ 500.00

Entre um valor para depósito: 200.00
Valor depositado com sucesso!

Entre um valor para saque: 100.00
Saque realizado com sucesso! (taxa R$ 5.00)

Dados atualizados:
Conta 1234, Titular: Amanda, Saldo: R$ 595.00
```

## Requisitos

- Java 8 ou superior

## Organização dos arquivos

```
Conta.java
Main.java
```
*(Os nomes podem variar conforme sua implementação)*

## Licença

Projeto desenvolvido para fins educacionais.
