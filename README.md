# 🚀 60 Exercícios de Java: Dominando Classes Abstratas e Interfaces

## Visão Geral

Este repositório contém **60 exercícios de Java** que exploram conceitos fundamentais de **classes abstratas** e **interfaces**. Os exercícios foram cuidadosamente elaborados para fortalecer sua compreensão sobre orientação a objetos, polimorfismo, encapsulamento e reutilização de código. Cada exercício é uma oportunidade para praticar e aprimorar suas habilidades em Java, desde conceitos básicos até técnicas avançadas.

---

## 🎯 Objetivo

O objetivo deste projeto é fornecer uma base sólida para o desenvolvimento de aplicações Java, explorando:
- **Classes abstratas**: Para definir comportamentos comuns e compartilhados.
- **Interfaces**: Para criar contratos que garantam a implementação de métodos específicos.
- **Herança e Polimorfismo**: Para reutilizar código e permitir flexibilidade no design.
- **Métodos default em interfaces**: Para adicionar funcionalidades sem quebrar implementações existentes.

---

## 📂 Estrutura do Projeto

O projeto está organizado em duas partes principais:

### 1. **Exercícios com Classes Abstratas**
   - **30 exercícios** que exploram a criação e implementação de classes abstratas.
   - Exemplos: `Veiculo`, `InstrumentoMusical`, `FormaGeometrica`, `Funcionario`, `Animal`, entre outros.

### 2. **Exercícios com Interfaces**
   - **30 exercícios** que focam na criação e implementação de interfaces.
   - Exemplos: `Veiculo`, `InstrumentoMusical`, `Eletrodomestico`, `FormaGeometrica`, `Funcionario`, entre outros.

Cada exercício é independente e contém:
- Uma descrição clara do problema.
- Uma solução implementada em Java.
- Exemplos de uso e saídas esperadas.

---

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **GitHub**: Para versionamento e compartilhamento do código.
- **Markdown**: Para documentação clara e organizada.

---

## 📋 Lista de Exercícios

### Parte 1: Classes Abstratas
1. `Veiculo` com método `mover()` e implementações em `Carro` e `Bicicleta`.
2. `InstrumentoMusical` com método `tocar()` e implementações em `Guitarra` e `Piano`.
3. `FormaGeometrica` com métodos `calcularArea()` e `calcularPerimetro()`, implementações em `Circulo` e `Retangulo`.
4. `Funcionario` com método `calcularSalario()`, implementações em `Gerente` e `Estagiario`.
5. `Animal` com método `fazerSom()`, implementações em `Cachorro` e `Gato`.
6. Adição de construtor e método `getNome()` à classe `Animal`.
7. Método concreto `descansar()` na classe `Funcionario`.
8. Atributo `cor` e método `mostrarCor()` na classe `Veiculo`.
9. `Banco` com método `realizarTransacao()`, implementações em `Deposito` e `Saque`.
10. `Personagem` com método `atacar()`, implementações em `Guerreiro` e `Mago`.
11. Classe `Jogador` que estende `Personagem` com método `usarHabilidadeEspecial()`.
12. Método `calcularBonificacao()` na classe `Funcionario`, sobrescrito em `Gerente`.
13. Lista de funcionários na classe `Empresa` com método `listarFuncionarios()`.
14. `Transporte` com método `velocidadeMaxima()`, implementações em `Moto` e `Caminhão`.
15. `Documento` com método `imprimir()`, implementações em `PDF` e `Word`.
16. `AparelhoEletronico` com método `ligar()`, implementações em `Celular` e `Tablet`.
17. `Restaurante` com pratos (`Prato`), implementações em `Pizza` e `Sushi`.
18. `Jogo` com método `iniciar()`, implementações em `JogoAventura` e `JogoCorrida`.
19. `Forma3D` com método `calcularVolume()`, implementações em `Esfera` e `Cubo`.
20. `Computador` com método `processar()`, implementações em `Desktop` e `Notebook`.
21. `RedeSocial` com métodos `postar()` e `curtir()`, implementações em `Facebook` e `Twitter`.
22. `ContaBancaria` com métodos `sacar()` e `depositar()`, implementações em `ContaCorrente` e `ContaPoupanca`.
23. `Dispositivo` com método `conectarInternet()`, implementações em `Smartphone` e `SmartTV`.
24. `Pagamento` com método `realizarPagamento()`, implementações em `CartaoCredito` e `BoletoBancario`.
25. `Livro` com método `abrir()`, implementações em `Ebook` e `LivroFisico`.
26. `Trabalho` com método `executar()`, implementações em `Professor` e `Engenheiro`.
27. `Produto` com método `calcularDesconto()`, implementações em `Eletronico` e `Alimento`.
28. `Funcionario` com método `baterPonto()`, implementações em `Desenvolvedor` e `Designer`.
29. `Aula` com método `ministrar()`, implementações em `Matematica` e `Portugues`.
30. `Estoque` com método `atualizarQuantidade()`, implementações em `Eletronicos` e `Roupas`.

### Parte 2: Interfaces
1. `Veiculo` com método `acelerar()`, implementações em `Carro` e `Moto`.
2. `InstrumentoMusical` com método `tocar()`, implementações em `Violao` e `Piano`.
3. `Eletrodomestico` com métodos `ligar()` e `desligar()`, implementações em `Geladeira` e `Televisao`.
4. `FormaGeometrica` com método `calcularArea()`, implementações em `Quadrado` e `Circulo`.
5. `Funcionario` com método `calcularSalario()`, implementações em `Gerente` e `Programador`.
6. Interfaces `Nadador` e `Corredor`, implementadas na classe `Triatleta`.
7. `Banco` com métodos `sacar()`, `depositar()` e `verSaldo()`, implementação em `ContaCorrente`.
8. `OperacoesMatematicas` com métodos `somar()`, `subtrair()`, `multiplicar()` e `dividir()`, implementação em `Calculadora`.
9. `Imprimivel` com método `imprimir()`, implementações em `Documento` e `Imagem`.
10. `Animal` com método `comer()` e `Voador` com método `voar()`, implementações em `Passaro`.
11. `Jogavel` com método `iniciarJogo()`, implementações em `Xadrez` e `Futebol`.
12. `Pagamento` com método `pagar()`, implementações em `CartaoCredito` e `Boleto`.
13. `Armazenavel` com métodos `salvar()` e `carregar()`, implementações em `ArquivoTexto` e `BancoDeDados`.
14. `Sensores` com método `medirTemperatura()`, implementações em `SensorDeTemperatura` e `SensorDePressao`.
15. `ControleRemoto` com métodos `aumentarVolume()` e `diminuirVolume()`, implementação em `Televisao`.
16. `Animal` com método default `dormir()`, implementação em `Cachorro`.
17. `Imprimivel` com método default `mostrarNoMonitor()`, implementação em `Documento`.
18. `Pagamento` com método default `cancelarPagamento()`, implementações em `CartaoCredito` e `Pix`.
19. `OperacoesMatematicas` com método default `potencia()`, implementação em `CalculadoraCientifica`.
20. `Eletrodomestico` com método default `verificarEstado()`, implementação em `Microondas`.
21. `Conversor` que converte Celsius para Fahrenheit, implementação em `Temperatura`.
22. `Banco` que retorna a taxa de juros atual, implementação em `ContaPoupanca`.
23. `Utilitario` que calcula o fatorial de um número, implementação em `Matematica`.
24. `Mensagem` que retorna "Bem-vindo ao sistema!", implementação em `Usuario`.
25. `Horario` que retorna a hora atual, implementação em `Relogio`.
26. `Transmissivel` com métodos `iniciarTransmissao()` e `finalizarTransmissao()`, implementações em `Youtube` e `Twitch`.
27. `Autenticavel` com métodos `login()` e `logout()`, implementações em `UsuarioSistema` e `Administrador`.
28. `Movivel` com métodos `moverParaFrente()` e `moverParaTras()`, implementação em `Robo`.
29. `Repositorio<T>` com métodos `salvar(T objeto)` e `buscar(int id)`, implementação em `RepositorioCliente`.
30. `Musica` com métodos `play()`, `pause()` e `stop()`, implementações em `Spotify` e `Deezer`.

---

## 🚀 Como Usar

1. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/60-exercicios-java.git](https://github.com/Cliffordson01/Abstacts-And-Interfaces-JAVAexe)
