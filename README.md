# 🎲 Jogo da Adivinhação em Java

Um projeto simples em **Java** para treinar lógica de programação e interação com o usuário.  
O computador escolhe um número **aleatório entre 1 e 100**, e o jogador deve adivinhar com base nas dicas fornecidas.

---

## 📌 Regras do Jogo

- O número secreto é sempre um **inteiro entre 1 e 100**.
- O jogador pode tentar quantas vezes quiser até acertar.
- A cada tentativa, o jogo indica se o número secreto é **maior ou menor** que o palpite.
- Ao acertar, o jogo mostra uma mensagem de vitória e a quantidade de tentativas realizadas.

 ---

## 📌 Exemplo de Execução

🎯 Tente adivinhar o número entre 1 e 100!

Digite seu palpite: 50

🔼 O número secreto é maior!

Digite seu palpite: 75

🔽 O número secreto é menor!

Digite seu palpite: 63

✅ Parabéns! Você acertou em 3 tentativas.

---

## 🛠️ Tecnologias Utilizadas

- ☕ **Java** – Linguagem principal do projeto  
- 📄 **GitHub** – Armazenamento e versionamento do código  
- 🖥️ **GitHub Web Interface** – Toda a criação foi feita sem terminal ou IDE  

---

## 📚 Aprendizados

Durante o desenvolvimento deste projeto, foi possível:

- Compreender melhor a lógica de estruturas de repetição (`do/while`)  
- Utilizar a classe `Scanner` para entrada de dados do usuário  
- Gerar números aleatórios com `Random`  
- Praticar boas práticas de organização de código  
- Criar e gerenciar um repositório no GitHub apenas com o navegador  

---

## ▶️ Como Executar

### Requisitos

- Java JDK 8 ou superior instalado  
- Terminal ou prompt de comando  

### Passo a Passo

```bash
# Clone este repositório
git clone https://github.com/GabrielPetinatti/jogo-adivinhacao.git

# Acesse o diretório do projeto
cd jogo-adivinhacao

# Compile o código
javac JogoAdivinhacao.java

# Execute o jogo
java JogoAdivinhacao


