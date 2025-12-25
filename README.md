# 🏦 Digital Bank Architecture - Java OOP

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-green?style=for-the-badge)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/yuri-vieira-615131188/)

---

## 🇺🇸 English Version

A robust backend simulation of a banking system, engineered to demonstrate proficiency in Object-Oriented Programming (OOP) principles using Java 17.

### 📋 Project Highlights
- Abstraction & Interfaces: Strategic use of IConta to define contracts and ensure low decoupling.
- Inheritance & Polymorphism: Implementation of specialized ContaCorrente and ContaPoupanca classes with distinct behaviors.
- Encapsulation: Sensitive data protection (balances) through strict access modifiers.
- Business Logic: Hardened validations to prevent insufficient fund withdrawals, negative deposits, and ensure atomic transfers.

## 📂 Project Structure

The project follows a modular package structure to ensure separation of concerns:

```
src/
└── DigitalBank/
    ├── Main.java            # Entry point / Simulation Runner
    ├── Banco.java           # Bank entity managing multiple accounts
    ├── Cliente.java         # Customer entity
    ├── IConta.java          # Interface defining the transaction contract
    ├── Conta.java           # Abstract Base Class (Core Logic)
    ├── ContaCorrente.java   # Checking Account Implementation
    └── ContaPoupanca.java   # Savings Account Implementation
```

### 🚀 How to Run
- Clone the repository
- Open in IntelliJ IDEA
- Ensure JDK 17 is configured
- Run the Main.java file


---

## 🇧🇷 Versão em Português

Uma simulação robusta de um sistema bancário, desenvolvida para demonstrar domínio nos pilares da Programação Orientada a Objetos (POO) utilizando Java 17.

### 📋 Destaques do Projeto
- Abstração & Interfaces: Uso de IConta para definir contratos e garantir baixo acoplamento.
- Herança & Polimorfismo: Implementação de classes específicas para ContaCorrente e ContaPoupanca com comportamentos distintos.
- Encapsulamento: Proteção de dados sensíveis (saldos) e uso rigoroso de modificadores de acesso.
- Regras de Negócio: Validações para impedir saques sem saldo, depósitos negativos e garantir transferências atômicas.

## 📂 Estrutura do Projeto

O projeto segue uma estrutura de pacotes modular para garantir a separação de responsabilidades:

```
src/
└── DigitalBank/
    ├── Main.java            # Ponto de entrada / Executor da Simulação
    ├── Banco.java           # Entidade Banco que gerencia múltiplas contas
    ├── Cliente.java         # Entidade Cliente
    ├── IConta.java          # Interface que define o contrato de transações
    ├── Conta.java           # Classe Abstrata Base (Lógica Central)
    ├── ContaCorrente.java   # Implementação de Conta Corrente
    └── ContaPoupanca.java   # Implementação de Conta Poupança
```

### 🚀 Como Executar
- Clone o repositório
- Abra no IntelliJ IDEA
- Certifique-se de usar o JDK 17
- Execute o arquivo Main.java


---

Developed by Yuri Vieira


